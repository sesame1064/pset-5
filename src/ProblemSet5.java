/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();

        // System.out.println(ps.surroundMe("cde", "abfg"));
        // System.out.println(ps.surroundMe(null, "####"));
        // System.out.println(ps.surroundMe("abc", null));
        // System.out.println(ps.surroundMe("abc", "123"));

        // System.out.println(ps.endsMeet("abcdefg", 2));
        // System.out.println(ps.endsMeet(null, 2));
        // System.out.println(ps.endsMeet("", 2));
        // System.out.println(ps.endsMeet("abc", -1));

        // System.out.println(ps.middleMan("abcdefg"));
        // System.out.println(ps.middleMan(null));
        // System.out.println(ps.middleMan("12"));
        // System.out.println(ps.middleMan("a"));
  
        // System.out.println(ps.isCentered("abcdefg", "cde"));
        // System.out.println(ps.isCentered("abcdefg", "abc"));
        // System.out.println(ps.isCentered(null, "abc"));
        // System.out.println(ps.isCentered("abcd", "abc"));
        // System.out.println(ps.isCentered("abc", null));
        // System.out.println(ps.isCentered("abcdefg", "cd"));
  
    
        // System.out.println(ps.countMe("I am an example sentence", 'e'));
        // System.out.println(ps.countMe(null, 'a'));
        // System.out.println(ps.countMe("abc$ def$", '$'));
  
        // System.out.println("\nExercise 6");
        // System.out.println(ps.triplets("aaabbbccc"));
        // System.out.println(ps.triplets("aaaa"));
        // System.out.println(ps.triplets("abc"));
        // System.out.println(ps.triplets(null));
  
        // System.out.println("\nExercise 7");
        // System.out.println(ps.addMe("123 abc 123"));
        // System.out.println(ps.addMe("abcdefghijk"));
        // System.out.println(ps.addMe(null));
  

        // System.out.println(ps.sequence("abbcccdddd"));
        // System.out.println(ps.sequence("aAabBbBb"));
        // System.out.println(ps.sequence(""));
        // System.out.println(ps.sequence(null));

        // System.out.println(ps.intertwine("aceg", "bdfh"));
        // System.out.println(ps.intertwine("abc", "12345"));
        // System.out.println(ps.intertwine(null, "abcd"));
        // System.out.println(ps.intertwine("abcd", null));
        // System.out.println(ps.intertwine(null, null));
        
        // System.out.println("\nExercise 10");
        // System.out.println(ps.isPalindrome("racecar"));
        // System.out.println(ps.isPalindrome("Madam"));
        // System.out.println(ps.isPalindrome(null));
    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
        String first;
        String last;
        String complete;
        if(in != null && out != null && out.length() == 4){
            first = out.substring(0, (out.length()/2));
            last = out.substring(out.length()/2, out.length());
            complete = first + in + last;
        }else{
            complete = in;
        }
        return complete;
    }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {
 
        String output = text;
 
        if(text == null || text.length() > 10 || text.length() < 1 || n > text.length() || n < 1){
            return output;
        }else{
            output = text.substring(0, n) + text.substring(text.length() - n, text.length());
            return output;
        }

    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {
         String output;
        if(text != null && text.length() >= 3 && (text.length() % 2) != 0){
            output = text.substring((text.length()/2)-1, (text.length()/2) + 2);
        }else{
            output = text;
        }
        return output;
    }
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {

        if(text == null || target == null || (text.length() % 2) == 0 || text.length() < 3 || target.length() != 3 ){
            return false;
        }else if((text.substring(text.length()/2 -1 , text.length()/2 + 2)).equals(target)){
            return true;
        }
        return false;
    }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
        
        if(text != null &&  Character.isAlphabetic(suffix)){
            int count = 0;
            String[] words =  text.split(" ");
            for(int i = 0; i < words.length; i++){
                if(words[i].endsWith(Character.toString(suffix))){
                    count++;
                }
            }

            if(count == 0){
                return -1;
            }else{
                return count;
            }
        }else{
            return -1;
        }   
        
    }
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {
        if(text != null){
            int triplet = 0;

            for(int i = 1; i < text.length()-1; i++){
                char one = text.charAt(i-1);
                char two = text.charAt(i);
                char three = text.charAt(i+1);
                if(one == two && two == three){
                    triplet +=1;
                }
            }
            return triplet;
        }else{
            return -1;
        }
    }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
        if(text != null){
            char character;
            int sum = 0;
            for(int i = 0; i < text.length(); i++){
                character = text.charAt(i);
                if(Character.isDigit(character)){
                    sum += Character.getNumericValue(character);
                }
            }
            return sum;
        }else{
            return -1;
        }
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {
        if (text != null) {
            long mainSeq = 1;
            long seqLen = 1;
            char one = ' ';
            char two = ' ';
            for (int i = 1; i < text.length(); i++ ) {
              one = text.charAt(i-1);
              two = text.charAt(i);
              if (one == two) {
                seqLen -= -1;
                if (seqLen > mainSeq) {
                    mainSeq = seqLen;
                }
               } else {
                seqLen = 1;
               }
            }
              if (one == ' ') {
                mainSeq = 0;
              }
              return mainSeq;
          }else {
            return -1;
          }

    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {
        long main = 0;
        String combined = "";

        if(a != null && b != null){
            if (a.length() > b.length()){
                main = a.length();
            }else{
                main = b.length();
            }
        }

        for(int i = 0; i < main; i++){
            if(i < a.length() && i < b.length()){
                combined += String.valueOf(a.charAt(i));
                combined += String.valueOf(b.charAt(i));
            }else if(i < a.length()){
                combined += String.valueOf(a.charAt(i));
            }else if(i < b.length()){
                combined += String.valueOf(b.charAt(i));
            }else{
                combined = null;
            }
        }
        return combined;
    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        String reverse = "";

        if(text != null){
            for(int i = text.length() -1 ; i >= 0; i-- ){
                reverse += String.valueOf(text.charAt(i));
            }
            if(text.equals(reverse)){
                isPalindrome = true;
            }

            return isPalindrome;
        }else{
            return false;
        }
    }
}
