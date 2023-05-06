import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) {
    // code goes here  
    int longestWordIndex = 0;
    int longestWordLength = 0;
    String[] words = sen.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");

    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > longestWordLength) {
        longestWordIndex = i;
        longestWordLength = words[i].length();
      }
    }

    sen = words[longestWordIndex];

    return sen;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}
