public class factorial {
static int factorial(int n)
{
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact1,fact2=1;  
  int a=7;
  int b=5;
  fact1 = factorial(a); 
  fact2 = factorial(b);
  int diff= fact1-fact2;
  System.out.println("the diff between the factorials is "+diff);    
 }  
 
}

    
   