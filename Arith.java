class Arith
{
 public static void main(String args[])
 {
 int a=10;
 int b=0;
 int c;
try
{
 c=a/b;
 System.out.println("The Result is: "+c);
}catch(ArithmeticException e)
{
 
 System.out.println("you cannot divide by zero");
}
 System.out.println("Rest of the code");
 System.out.println("Git Repository");
}
}
