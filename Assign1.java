import java.util.Scanner;



public class Assign1 {
  public static void main(String[] args) {
    double Maximum;
    try (Scanner input = new Scanner(System.in)) {
      System.out.print(
        "Enter three floating-point values separated by spaces: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        if (num1>num2 && num1>num3)
        Maximum = num1;
        else if(num2> num1 && num2>num3)
        Maximum = num2;
        else
        Maximum = num3;
    }
    //  printing results
    System.out.println("Maximum is:" + Maximum);


  }
}
