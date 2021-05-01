//Author Sumit Kant Verma
package projects;
import java.util.Scanner;
public class Calculator {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of elements on which you want to perform arithmetic operations: ");
      
      int n = input.nextInt();
      
      if (n==2) { 
    	  
      System.out.print("Enter value of 1st number: ");
      int a = input.nextInt();

      System.out.print("Enter value of 2nd number:" );
      int b = input.nextInt();

      System.out.println("Select operation");
      System.out.println("Addition-a:  Subtraction-s:  Multiplication-m:  Division-d: ");
      char ch = input.next().charAt(0);
      switch(ch) {
         case 'a' :
         System.out.println("Sum of the given two numbers: "+(a+b));
         break;
         case 's' :
         System.out.println("Difference between the two numbers: "+(a-b));
         break;
         case 'm' :
         System.out.println("Product of the two numbers: "+(a*b));
         break;
         case 'd' :
         System.out.println("Division of the given number: "+(a/b));
         break;
         default :
         System.out.println("Invalid grade");
      }}
      
      else {
    	  int[] array = new int[100];
    	  System.out.println("Enter the elements of the array");
    	  for(int i=0 ; i<n ;i++) {
    		  array[i]=input.nextInt();
    	  }
    	  System.out.println("Select operation");
          System.out.println("Addition:a  Multiplication:m ");
          char ch = input.next().charAt(0);
          
          switch(ch) {
          	case 'a':
          		int sum=0;
          		for(int i=0 ; i<n ; i++) {
          			sum = sum + array[i];
          		}
          		System.out.println("Sum of all the elements of an array: " +sum);
          		break;
          	case 'm':
          		int mul=1;
          		for(int i=0 ; i<n ; i++) {
          			mul =mul * array[i];
          		}
          		System.out.println("Multiplication of all the elements of an array: " +mul);
          		break;
          	default :
          		System.out.println("Invalid grade");
          }
      }
      
   }
}
