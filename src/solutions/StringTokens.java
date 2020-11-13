package solutions;

public class StringTokens {
    
public void regexToken(){
    String s = "He is a very very good boy, isn't he?";

        // String[] nameArray = s.split("[! ,?._'@]+");
        // int nameLength=nameArray.length;

        // System.out.println(nameLength);

        // for (String string : nameArray) {
        //     System.out.println(string);
        // }

        if (s.trim().length()==0|| s.trim().length()>400000) {
            System.out.println(0);
        }

        String[] nameArray = s.trim().split("[! ,?._'@]+");
        System.out.println(nameArray.length);

        for (String string : nameArray) {
            System.out.println(string);
        }
}

}
