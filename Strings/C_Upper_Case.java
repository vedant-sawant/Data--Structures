public class C_Upper_Case {
    public static String uppercasechar(String str)
    {
        StringBuilder sb=new StringBuilder();
        //capitalize first letter
        Character ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        //check gap and then capitatlize next letters of every word
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sb.append(str.charAt(i));
                i++;
                Character c= Character.toUpperCase(str.charAt(i));
                sb.append(c);
            }
            else
                sb.append(str.charAt(i));
        }
        str=sb.toString();
        return str;
    }
    public static void main(String[] args) {
        String neww="hi i am Vedant!";
        System.out.println(uppercasechar(neww));
    }
}
