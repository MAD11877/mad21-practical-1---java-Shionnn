import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    // System.out.print("Enter a integer: ");
    int num = in.nextInt();
    List<String> list = new ArrayList<String>(); 
    in.nextLine();
    for (int i = 0; i < num; i++){
    
      String str = in.nextLine();
      list.add(str);
    };
    
    for (int i = 0; i < list.size(); i++){
      
      for (int j = i+1; j < list.size(); j++){
        // System.out.println(list.get(i) + list.get(j));
        if (list.get(i).equals(list.get(j))){
          num--;
        }
      }
      // System.out.println(count);
    }
    System.out.print(num);

  }
}
