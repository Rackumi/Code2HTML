import SintData.Sintesis;
import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.regex.Pattern;

public class MainClass{

    public static String nf;

    public static void main(String[] args){

        try{

            CharStream input = CharStreams.fromFileName(args[0]);
            CodeToHTMLLexer analex = new  CodeToHTMLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);

            Sintesis datos = new Sintesis();

            CodeToHTMLParser anasint = new CodeToHTMLParser(tokens, datos);
            anasint.removeErrorListeners();
            anasint.addErrorListener(new CodeToHTMLErrorListener());
            String nameFile = args[0] + ".html";
            FileOutputStream f = new FileOutputStream(nameFile);
            System.setOut(new PrintStream(f));


            String[] path = args;
            if(args[0].contains("/")){
                path = args[0].split("/");
            }
            else if(args[0].contains("\\")){
                path = args[0].split(Pattern.quote(File.separator));
            }
            nf = path[path.length-1];
            datos.setTitulo(nf);

            anasint.r();
            f.close();
            if (CodeToHTMLErrorListener.isFailed()){
                File f2 = new File(System.getProperty("user.dir"),nameFile);
                f2.delete();
            }




        } catch (RecognitionException e) { //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) { //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (RuntimeException e) { //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }

}