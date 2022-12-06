import java.util.Scanner;
public class info
{
public static void main(String[]args)
{
   Scanner sc= new Scanner(System.in);
   System.out.println("please enter your last name-");
   String lastname= sc.nextLine();
   System.out.print("please enter your age-");
   int age= sc.nextInt();
   System.out.print("please enter your current temperature-");
    double temp= sc.nextDouble();
    System.out.println("Your last name is-"+lastname);
    System.out.println("Your age is-"+age);
    System.out.println("your current temp is"+temp);
    
}
}