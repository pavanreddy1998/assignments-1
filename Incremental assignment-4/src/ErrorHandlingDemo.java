import java.util.Scanner;

class Negative_Exception extends Exception{}
class Zero_Number_Exception extends Exception{}
class String_length_Exception extends Exception{}

public class ErrorHandlingDemo {
  static final int MIN_USERNAME_LENGTH = 5;
    static void method1(int number,String userName) throws Negative_Exception,Zero_Number_Exception,String_length_Exception {
      if(number<0){
       System.out.println("throwing negative exception");
       throw new Negative_Exception();
      }
        if(number==0){
            System.out.println("throwing zero numberber exception");
            throw new Zero_Number_Exception();
        }
        if(userName.isEmpty()){
            System.out.println("throwing Null pointer exception");
           throw new NullPointerException();
        }
        if(userName.length()<MIN_USERNAME_LENGTH){
            System.out.println("throwing string length exception, use string length greater than "+MIN_USERNAME_LENGTH);
            throw new String_length_Exception();
        }

    }


    public static void main(String arg[]){
        int number;
        String userName;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        number=sc.nextInt();
        sc.nextLine();
        System.out.println("enter userName");
        userName=sc.nextLine();
        try{
            method1(number,userName);
        }
        catch (Negative_Exception | Zero_Number_Exception | String_length_Exception  n){
            System.out.println("exception caught");
        }
        finally {
            System.out.println("finally block");
        }
    }
}


/**
  *Test cases:
   1.
    enter number
    5
    enter userName
    pavan
    finally block

  2.
    enter number
    0
    enter userName
    pavan
    throwing zero numberber exception
    exception caught
    finally block

  3.
    enter number
    5
    enter userName
    str
    throwing string length exception, use string length greater than 5
    exception caught
    finally block

 4.
     enter number
     -5
     enter userName
     pavan
     throwing negative exception
     exception caught
     finally block

  5.
    enter number
    7
    enter userName

    throwing Null pointer exception
    finally block
    Exception in thread "main" java.lang.NullPointerException
    	at ErrorHandlingDemo.method1(ErrorHandlingDemo.java:20)
    	at ErrorHandlingDemo.main(ErrorHandlingDemo.java:38)







   */
