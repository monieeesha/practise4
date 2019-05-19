import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*only to search for a string "Harry" if it presennt return a boolean vcalue*/
public class FindHenry {

    public  String  Repacestr(String str) {

        Boolean b=false;
        Pattern p = Pattern.compile("Harry");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            b=true;
        }

        String result="Is Harry here?"+b;
        return result;
    }
}
