package com.fun.prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/respostas")
public class EP {

	@GET
	@Path("Q1")
	@Produces(MediaType.TEXT_PLAIN)
	public String dependenciaExtra(){
		return "Qual é a dependencia que pode ser removida do maven?";
	}
	

	@GET
	@Path("Q5")
	@Produces(MediaType.TEXT_PLAIN)
	public String respostaQ5(){
		return "O commit eh: XXX e o conteudo do arquivo eh XXX";
	}	
	
}