import java.util.*;
import java.io.*;

public class ReportRepair {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    List<Integer> arr = new ArrayList<Integer>();     // creates array for the list of entries
    
    while (in.hasNextLine()) {     
      x = in.nextInt();    
      arr.add(x);
    }

    System.out.println("Number of entries: " + arr.size());

    int k = 0;            // value 3
    int c = 1;            // value 2
    int r = 2;            // value 1

    while (arr.get(k) + arr.get(c) + arr.get(r) != 2020) {
      r++;                // keep going through the array for value 1
      if (r == (arr.size() - 1)) {
        r = 0;            // once value 1 reaches cap, start doing value 2
        c++;
      }
      if (c == (arr.size() - 1)) {  
        c = 0;          // this if statement is only necessarily for calculating three values; modify the while-statement and output as well to calculate two values
        k++;
      }
    }

    System.out.println(arr.get(k) + ", " + arr.get(c) + ", " + arr.get(r));

  }
}
