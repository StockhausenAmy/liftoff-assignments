import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    // code goes here
    char[] arr = str.toCharArray();
    String rts = "";
    for (int i=arr.length-1; i>=0; i--) {
      rts += arr[i];
    }
    str = rts;
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}
