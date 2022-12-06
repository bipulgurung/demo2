import java.util.Scanner;

public class credit
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your total college credits");
    int c=sc.nextInt();
    if(c>=90){
        System.out.println("You are senior.");
    }
    else if(c>=60){
        System.out.println("You are junior.");
    }
    else if(c>=30){
        System.out.println("You are sophomore");
    }
    else if(c>=0){
        System.out.println("You are freshman");
    }
}
}

