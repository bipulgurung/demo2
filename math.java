import java.util.Scanner;
                 
public class math
{
    public static void main(String args[])
  {
    int first, second, add, subtract, multiply, modulus;
    float divide, exponentiation;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    divide = (float) first / second;
    modulus = first % second;
    exponentiation = first ^ second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + divide);
    System.out.println("Modulus="+modulus);
    System.out.println("exponentiation="+exponentiation);
  }
}

