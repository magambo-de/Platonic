package com.platonic;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.platonic.beans.ProfileBean;

@Path("profile")
public class Profile {
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public ProfileBean getProfile(@FormParam("id") int id)
	{
		ProfileBean profile = new ProfileBean(id, "Umutcan", "Simsek", "super high");
		return profile;
	}
}
