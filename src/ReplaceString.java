import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*replace a character d with f and l with t*/
public class ReplaceString {

    public String replace(String str)
    {

        Pattern p= Pattern.compile("d");
        Matcher m=p.matcher(str);
        String word= m.replaceAll("f");
        Pattern p1= Pattern.compile("l");
        Matcher m1=p1.matcher(word);
        String word1= m1.replaceAll("t");
        return  word1;

    }
}
