import java.util.*;
class Main{
 public static void main(String args[]) {
  int a,b;
  Scanner sc = new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  try
  {
   int fraction = a/b;
   System.out.println("This line will not be Executed");
   } 
   catch (ArithmeticException e)
   {
   System.out.println("In the catch Block due to Exception = " + e);
  }
 }
}
