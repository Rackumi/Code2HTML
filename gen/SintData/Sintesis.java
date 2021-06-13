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
				"</head>\n"+
				"\n<BODY>\n" +
				"<A NAME=\"inicio\">\n" +
				"<H1>Programa: "+ titulo +"</H1>\n" +
				"<H2>Funciones y procedimientos</H2>\n");
	}

	public String end(){
		return("\n</BODY>\n" +
				"</HTML>");
	}

	public String cabecera(String cabezas){

		String[] elementos = cabezas.split(" ");
		String tipo = "";
		String nombre;
		StringBuilder strParametros = new StringBuilder();

		int cont = 0;
		if(elementos[cont].equals("entero") || elementos[cont].equals("real") || elementos[cont].equals("caracter")){
			tipo = elementos[cont];
			cont++;
			nombre = elementos[cont];
			cont++;
		}
		else{
			nombre = elementos[cont];
			cont++;
		}
		for(int i=cont; i<elementos.length; i++){
			if (i<elementos.length-1) {
				strParametros.append(elementos[i]).append(" ");
			}
			else{
				strParametros.append(elementos[i]);
			}
		}

		return("<LI><A HREF=\"#"+ nombre +"\">"+ tipo +" "+ nombre +" ( "+ strParametros +" )</A></LI>\n");
	}

	public String parrafo(String codigo){
		return("\n<HR/>\n" +
				codigo);
	}

	public String aperturaYCierre(String codigo){
		return("<SPAN CLASS=\"palres\">inicio</SPAN><BR/>\n"+codigo+"<SPAN CLASS=\"palres\">fin</SPAN><BR/>\n");
	}

	public String cuerpo(String codigo){
		return("\t<DIV style=\"text-indent: 0.5cm\"><SPAN CLASS=\"palres\">real</SPAN> <SPAN CLASS=\"ident\">resultado</SPAN>;</DIV>");
	}

	public Sintesis(){
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
