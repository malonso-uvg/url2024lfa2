package src;

public class AFD_2 {

    private int[] acceptStates = {3};

    public boolean parse(String input){
        boolean isAccepted = false;
        boolean thereIsError = false;
        int actualState = 0;
        int index = 0;
        
        while (!isAccepted && !thereIsError){
            String token = "" + input.charAt(index);

            switch (actualState) {
                case 0:
                    try {
                        actualState = state0(token);
                    } catch (Exception e) {
                        thereIsError = true;                      
                    }
                break;

                case 1:
                    try {
                        actualState = state1(token);
                    } catch (Exception e) {
                        thereIsError = true;
                       
                    }
                break;

                case 2:
                try {
                        actualState = state2(token);
                    } catch (Exception e) {
                        thereIsError = true;
                    }
                break;

                case 3:
                try {
                        actualState = state3(token);
                    } catch (Exception e) {
                        thereIsError = true;
                    }
                break;


            
                default:
                    break;
            }

            index++; //paso al siguiente elemento

            if (index == input.length()){ //Llegué al final de la cadena 
                isAccepted = isAcceptState(actualState);

                thereIsError = !isAccepted; //Si fue aceptado entonces no hay error y viceversa
            }

        }

        return isAccepted;
    }

    private boolean isAcceptState(int state){
        for (int statetested : acceptStates){
            if (statetested == state)
                return true;
        }

        return false;
    }
    
    private int state0(String token) throws Exception{
        if (token.equals("b")){
            return 0;
        }else if (token.equals("a")){
            return 1;
        } else {
            throw new Exception("No se esperaba el token: " + token);
        }
    }

    private int state1(String token) throws Exception{
        if (token.equals("a")){
            return 1;
        }else if (token.equals("b")){
            return 2;
        } else {
            throw new Exception("No se esperaba el token: " + token);
        }
    }

    private int state2(String token) throws Exception{
        if (token.equals("a")){
            return 1;
        }else if (token.equals("b")){
            return 3;
        } else {
            throw new Exception("No se esperaba el token: " + token);
        }
    }

    private int state3(String token) throws Exception{
        if (token.equals("a")){
            return 1;
        }else if (token.equals("b")){
            return 0;
        } else {
            throw new Exception("No se esperaba el token: " + token);
        }
    }
}
