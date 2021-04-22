import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

import java.io.IOException;

public class MainClass{

    public static void main(String[] args){
        try{
            CharStream input = CharStreams.fromFileName(args[0]);
            CodeToHTMLLexer analex = new  CodeToHTMLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);

            CodeToHTMLParser anasint = new CodeToHTMLParser(tokens);
            anasint.removeErrorListeners();
            anasint.addErrorListener(new DiagnosticErrorListener());
            anasint.getInterpreter()
                    .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

            anasint.r();

        } catch (RecognitionException e) { //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) { //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (RuntimeException e) { //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }

}