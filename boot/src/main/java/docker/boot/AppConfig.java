package docker.boot;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import docker.boot.controller.AppController;

@Component
@ApplicationPath("practise")
public class AppConfig extends ResourceConfig{
	
    AppConfig(){
	   register(AppController.class);
   }

}
