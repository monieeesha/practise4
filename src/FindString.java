import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* Find a particular string and return the start and End index of that word*/

public class FindString {

    public  String[]  MatchString(String str,String ch) {

        String[] empty=new String[0];
        List<String> result = new ArrayList<String>();
        Pattern pattern = Pattern.compile(ch);
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find())
        {

            result.add("found at:" + matcher.start() + "-" + matcher.end());
        }
        if(result.size()>1) {
            String[] item = result.toArray(new String[result.size()]);
            return item;
        }
        else
            return empty;
    }

}
