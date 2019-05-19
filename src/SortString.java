import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Returns a array of string in a alphabetically sorted order*/

public class SortString {
    public String[] Extract(String str) {

        String Empty[]=new String[]{};
        List<String> allMatches = new ArrayList<String>();
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        int flag=1;
        while (m.find())
        {
            allMatches.add(m.group());
        }
        Collections.sort(allMatches);
        String[] item = allMatches.toArray(new String[allMatches.size()]);
        if(flag==1)
        {
            return item;
        }
        else { return Empty;}

    }
}
