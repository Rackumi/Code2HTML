import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class CodeToHTMLErrorListener extends BaseErrorListener{

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Partes afectadas: "+stack+"\n");

        System.err.println("linea "+line+":"+charPositionInLine+" en "+offendingSymbol+": "+msg);
        underlineError(recognizer,(Token)offendingSymbol, line, charPositionInLine);

//        StringBuilder buf = new StringBuilder();
//        buf.append("rule stack: "+stack+" ");
//        buf.append("line "+line+":"+charPositionInLine+" at "+
//                offendingSymbol+": "+msg);
//        JDialog dialog = new JDialog();
//        Container contentPane = dialog.getContentPane();
//        contentPane.add(new JLabel(buf.toString()));
//        contentPane.setBackground(Color.white);
//        dialog.setTitle("Syntax error");
//        dialog.pack();
//        dialog.setLocationRelativeTo(null);
//        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        dialog.setVisible(true);
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
        System.err.println();
    }
}