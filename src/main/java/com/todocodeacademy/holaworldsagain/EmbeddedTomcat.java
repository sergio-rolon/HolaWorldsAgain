package com.todocodeacademy.holaworldsagain;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class EmbeddedTomcat {

	public static void main(String[] args) throws LifecycleException{
		// TODO Auto-generated method stub
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);
		
		tomcat.getConnector();
		
		tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
		
		tomcat.start();
		tomcat.getServer().await();
	}

}
