package br.inatel.pos.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalcService 
{
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Response sum(@QueryParam("frist") Double frist,@QueryParam("second") Double second);

	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Response subtract(@FormParam("first") Double frist, @FormParam("second") Double second);
}
