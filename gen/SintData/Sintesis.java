package SintData;

import org.abego.treelayout.internal.util.java.lang.string.StringUtil;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sintesis {
	private int variable, declaraciones;

	private String titulo;

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public String inic(){
		return("<!DOCTYPE html>\n" +
				"<HTML>\n" +
				"<head>\n" +
				"<title>"+ getTitulo() +"</title>\n" +
				"<style>\n" +
				".cte {color:rgb(19,189,72);}\n" +
				".ident {color:rgb(55,40,244);}\n" +
				".palres {color:rgb(0,0,0);font-weight:bold;}\n" +
				"</style>\n" +
				"</head>\n"+
				"\n<BODY>\n" +
				"<A NAME=\"inicio\">\n" +
				"<H1>Programa: "+ getTitulo() +"</H1>\n" +
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

	public boolean esPrincipal(String cabeza){
		return cabeza.contains("Principal");
	}

	public String parrafo(String codigo, String ancla){
		return("\n<HR/>\n" + "<A NAME=\""+ancla+"\">\n" +
				codigo+ "<A HREF=\"#"+ancla+"\">Inicio de rutina</A><BR/>\n" +
				"<A HREF=\"#inicio\">Inicio de programa</A><BR/>");
	}

	public String ident(String codigo){
		return "<SPAN CLASS=\"ident\">"+codigo+"</SPAN> ";
	}

	public String palres(String codigo){
		return "<SPAN CLASS=\"palres\">"+codigo+"</SPAN> ";
	}

	public String cte(String codigo){
		return "<SPAN CLASS=\"cte\">"+codigo+"</SPAN> ";
	}

	public String asigopEspacio(String codigo){
		return " "+codigo+" ";
	}

	public String aperturaYCierre(String codigo){
		return (palres("inicio")+saltoBR()+div(codigo)+palres("fin")+saltoBR());
	}

	public String div(String codigo){
		String[] saltos = codigo.split("\n");
		StringBuilder salida = new StringBuilder();
		String aux = "";
		String desp = "";
		double desplazamiento;

		if(saltos.length > 0){
			for (String salto : saltos) {
				if (salto.contains("\t<DIV style=\"text-indent: ")) {
					Pattern p = Pattern.compile("[0-9]+.?[0-9]*cm");
					Matcher m = p.matcher(salto);
					while(m.find()) {
						desp = m.group();
					}
					desp = desp.substring(0, desp.length()-2);
					desplazamiento = Double.parseDouble(desp);
					aux = salto.replaceFirst("[0-9]+.?[0-9]*cm", String.valueOf(desplazamiento+0.5)+"cm");
					salida.append(aux).append("\n");
				}
				else {
					salida.append("\t<DIV style=\"text-indent: ").append("0.5").append("cm\">").append(salto).append("</DIV>\n");
				}
			}
		}

		return(salida.toString());
	}

	public String saltoBR(){
		return " <BR/>\n";
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
