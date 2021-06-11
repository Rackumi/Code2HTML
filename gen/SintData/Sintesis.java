package SintData;

import java.util.LinkedList;

public class Sintesis {
	private int variable, declaraciones;

	public String inic(String titulo){
		return("<!DOCTYPE html>\n" +
				"<HTML>\n" +
				"<head>\n" +
				"<title>"+ titulo +"</title>\n" +
				"<style>\n" +
				".cte {color:rgb(19,189,72);}\n" +
				".ident {color:rgb(55,40,244);}\n" +
				".palres {color:rgb(0,0,0);font-weight:bold;}\n" +
				"</style>\n" +
				"</head>"+
				"<BODY>\n" +
				"<A NAME=\"inicio\">\n" +
				"<H1>Programa: "+ titulo +"</H1>\n" +
				"<H2>Funciones y procedimientos</H2>\n");
	}

	public String end(){
		return("</BODY>\n" +
				"</HTML>");
	}

	public Sintesis() {
		variable = 0;
		declaraciones = 0;
	}
	
	public void newDec ( ) {
		declaraciones++;
		variable++;
	}
	
	public void newVar ( ) {
		variable++;
	}

	public void resumen () {
		if(declaraciones == 0) System.out.println("No hay declaraciones.");
		else {
			if(declaraciones == 1) System.out.print("Se ha detectado una declaracion ");
			else System.out.print("Se han detectado " + declaraciones + " declaraciones ");
			if(variable == 1) System.out.println(" con una variable.");
			else System.out.println("con " + variable + " variables.");
		}
		
	}
}
