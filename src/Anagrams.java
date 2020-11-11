public class Anagrams {

    public static boolean isAnagram(String a, String b) {


        boolean wordCheck;


        //create a count var
        int count = 0;
        //store length of string in variables
        int aLength = a.length();
        int bLength = b.length();
        //if they are of different lengths then false 
        if (aLength != bLength) {
            wordCheck = false;
        } 
        else{

            //loop through first string and add each character while updating count 
        for (int i = 0; i < aLength; i++) {
            count = count + a.charAt(i);
        }
        //loop through second string and decrement count
        for (int i = 0; i < bLength; i++) {
            count = count - b.charAt(i);
        }
        

        wordCheck = (count == 0)? true: false;

        }

        
        
        return wordCheck;
    }
    
}
