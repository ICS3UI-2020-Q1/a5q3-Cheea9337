import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for an integer
    System.out.println("Please enter an integer to calculate the factorial of");
    int userNum = input.nextInt();

    int sum = 1;
    for(int count = userNum; count >= 1; count--){
      sum = sum * count;
    }
    System.out.println(userNum + "!" + " = " + sum);
  }
}
