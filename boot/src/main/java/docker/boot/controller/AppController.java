package docker.boot.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;


@Controller
@Path("/")
public class AppController {
	
	@GET
	@Path("display")
	public String display(){
		
		return "Success Vijay";
	}

}
