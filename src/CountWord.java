import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*count the number of occurence of given word in n a string*/

public class CountWord {
    public int  Calculatecount(String str, String ch)
    {

             int count=0;
             Pattern p= Pattern.compile(ch);
             Matcher m=p.matcher(str);

             while(m.find())
             {
                count++;
             }
             return count;
    }



}
