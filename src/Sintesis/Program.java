package Sintesis;

public class Program {
    String s;
    public Program(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>\n" +
                "<HTML>\n" +
                "<head>\n" +
                "<title>EjAprobado.pl</title>\n"+
                "<style>\n" +
                ".cte {color:rgb(19,189,72);}\n" +
                ".ident {color:rgb(55,40,244);}\n" +
                ".palres {color:rgb(0,0,0);font-weight:bold;}"+
                "</style>\n" +
                "<BODY>\n"+
                new Part()+
                "</BODY>\n"+
                "</HTML>\n";
    }



    public String toString1() { //al inicio del programa las X son el nombre del fichero
        return "<H1>Programa: XXXXXX</H1>";
    }

    public String toString2() {
        return "<H2>Funciones y procedimientos</H2>";
    }

    public String toString3() { //listas de cabeceras
        return "<UL>" + /*aqui llamariamos a otro metodo*/ "</UL>";
    }

    public String toString4() { //cabeceras de metodos (funcion)
        return "<LI><A HREF= \"#enlace al elemento\" tipo nombre ( param ) </A></LI>";
    }

    public String toString5() { //cabeceras de metodos (procedimiento)
        return "<LI><A HREF= \"#enlace al elemento\" nombre ( param ) </A></LI>";
    }

    public String toString6() { //por cada metodo
        return "<HR/><A NAME=\"xxx\">";
    }

    public String toString7() { //inicio y fin
        return "<DIV style=\"text-indent:\n" +
                "Xcm\"> ... </DIV>";
    }

    public String toString8() { //constantes
        return "<SPAN CLASS=\"cte\">...</SPAN>";
    }

    public String toString9() { //palabras reservadas
        return "<SPAN CLASS=\"palres\">...</SPAN>";
    }

    public String toString11() { //identificadores
        return "<SPAN CLASS=\"ident\">...</SPAN>";
    }

    public String toString12() { //despuess de cada metodo
        return "<A\n" +
                "HREF=\"...\">...</A>";
    }

    //opcional

    public String toString13() { //enlazar con su correspondiente declaracion
        return "<A HREF=\"...\">...</A>";
    }

    public String toString14() { //mira nose
        return "<A NAME=\"xxx\">CLASS=\"ident\">...</SPAN>";
    }

}
