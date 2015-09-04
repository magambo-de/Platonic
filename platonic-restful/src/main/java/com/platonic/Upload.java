package com.platonic;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.ReadWrite;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.tdb.TDBFactory;




@Path("upload")
public class Upload {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces("text/turtle")
	public String uploadRDF(@FormParam("data") String data) throws UnsupportedEncodingException
	{		
			
			
			data = URLDecoder.decode(data,"UTF-8");
			//return data;
			String directory = "ds";
			Dataset dataset = TDBFactory.createDataset(directory);
			dataset.begin(ReadWrite.WRITE);
			Model m = null;
	
			m = dataset.getDefaultModel();

			
			InputStream in = new ByteArrayInputStream(data.getBytes());
			m.read(in,"http://platonic.com/","N-TRIPLE");
			
			dataset.commit();
			dataset.close();
		
			return "Veri: " +data;
			
	
		
		
	}
	
}
