import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Scanner{

    public static boolean isValidEmailAddress(String email){
        String usuario = "[a-zA-Z0-9_\\.\\-]+";
        String dominio = "@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*";
        //Pattern pattern = Pattern.compile("^[a-zA-Z0-9_\\.\\-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*$", Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("^"+usuario+dominio+"$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean isValidURL(String url){
        Pattern pattern = Pattern.compile("^(https?://)?(www\\.)?[a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(url);
        return matcher.find();
    }

    public static boolean isValidIP(String ipv4){
        String octeto = "((1[0-9][0-9])|((2[0-4][0-9])|(25[0-5]))|([0-9]?[0-9]))";
        Pattern pattern = Pattern.compile("^"+octeto+"\\."+octeto+"\\."+octeto+"\\."+octeto+"$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(ipv4);
        return matcher.find();
    }

}