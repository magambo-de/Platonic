package com.platonic;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ReadWrite;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.tdb.TDBFactory;

@Path("query")
public class Query {
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String getResults(@FormParam("query") String query) throws UnsupportedEncodingException
	{
		query = URLDecoder.decode(query); 
		Dataset ds = TDBFactory.createDataset("ds");
		ds.begin(ReadWrite.READ);
		
		com.hp.hpl.jena.query.Query q = QueryFactory.create(query);
		QueryExecution exec = QueryExecutionFactory.create(q, ds.getDefaultModel());
		ResultSet rs = exec.execSelect();
		ds.getDefaultModel().write(System.out,"TTL");
		String r = ResultSetFormatter.asText(rs);
		ds.commit();
		ds.close();
		
		return r;
	}
}
