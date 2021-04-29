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
}
