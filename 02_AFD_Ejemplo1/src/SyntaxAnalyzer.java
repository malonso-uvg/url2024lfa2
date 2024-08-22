package src;
public class SyntaxAnalyzer{

    public static final int ACCEPTED = 0;
    public static final int ERROR = 1;


    public static int stringIsAccepted(String value){
        AFD_2 automata = new AFD_2();

        if (automata.parse(value))    
            return ACCEPTED;
        else 
            return ERROR;
    }
    
}