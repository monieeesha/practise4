

public class ReverseString {


/*reverse Each word in a string*/
    public String Reversethestring(String str){

        String  x=null;
        String[] res=str.split(" ");
        String output="";
        for(String s:res)
        {

            StringBuilder  str1 =new StringBuilder(s);
            str1.reverse();
            output=output+str1.toString()+" ";
            x= output.trim();

        }

       return x;

    }
}
