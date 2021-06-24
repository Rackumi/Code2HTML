import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class CodeToHTMLErrorListener extends BaseErrorListener{

    public static boolean failed = false;
    int[] contador = new int[1];

    public static boolean isFailed() {
        return failed;
    }

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){

        failed = true;
        contador[0]++;
        System.err.println("< Error numero "+ contador[0]+" >");

        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Partes afectadas en el error: "+stack+"\n");

        if(msg.contains("mismatched input")){
            msg = msg.replace("mismatched input","No coincide la entrada");
            msg = msg.replace("expecting","se esperaba");
            msg = msg+"\nError sintactico: Puede que este error se deba a que varios tokens fueron añadidos donde no debian.";
        }
        else if(msg.contains("extraneous input")){
            msg = msg.replace("extraneous input","Entrada no esperada");
            msg = msg.replace("expecting","se esperaba");
            msg = msg+"\nError sintactico: Puede que este error se deba a que un token fue añadido donde no debia.";
        }
        else if(msg.contains("no viable alternative")){
            msg = msg.replace("no viable alternative at input","No hay una alternativa viable a la entrada obtenida");
            msg = msg+"\nError sintactico: Puede que este error se deba a que ninguna otra alternativa es consistente con esa regla o subregla.";
        }
        else if(msg.contains("missing")){
            msg = msg.replace("missing","falta");
            msg = msg.replace("at","en");
            msg = msg+"\nError sintactico: Puede que este error se deba a que falta un cierto token en la ubicacion antes mencionada.";
        }

        System.err.println("linea "+line+":"+charPositionInLine+" en "+offendingSymbol+": "+msg);
        underlineError(recognizer,(Token)offendingSymbol, line, charPositionInLine);
    }

    protected void underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInLine){
        CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for(int i=0; i<charPositionInLine; i++){
            System.err.print(" ");
        }
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if( start>=0 && stop>=0 ){
            for(int i=start; i<=stop; i++){
                System.err.print("^");
            }
        }
        System.err.println("\n");
    }
}