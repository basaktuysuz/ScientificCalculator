import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
     boolean abc = true;


     while (abc =true){
         ScientificCalculator.DisplayMenu();
         int choice = sc.nextInt();
         double firstInput, secondInput, result;
         int factorialInput;

         switch(choice){

             case 1 :
                 System.out.println("Enter the first Value");
                 firstInput= sc.nextDouble();
                 System.out.println("Enter Second value ");
                 secondInput= sc.nextDouble();
                 result = ScientificCalculator.CalculatePower(firstInput ,secondInput );
                 System.out.println("the result is " + result );
                 break;
             case 2 :
                 System.out.println("Enter A value ");
                 firstInput=sc.nextDouble();
                 result = ScientificCalculator.CalculateSquareRoot(firstInput);
                 System.out.println("The result is ..."+ result);
                 break;
             case 3:
                 System.out.println("The maximum operation takes 2 real values as input parameters.");
                 System.out.print("Enter the first value: ");
                 firstInput = sc.nextDouble();
                 System.out.print("Enter the second value: ");
                 secondInput = sc.nextDouble();
                 result = ScientificCalculator.calculateMaximum(firstInput, secondInput);
                 System.out.println("The result is " + result);
                 break;

             case 4:
                 System.out.println("The logarithm operation (in base e) takes a real input parameter.");
                 System.out.print("Enter the input: ");
                 firstInput = sc.nextDouble();
                 result = ScientificCalculator.calculateLogarithm(firstInput);
                 System.out.println("The result is " + result);
                 break;
             case 5:
                 System.out.println("The factorial operation takes a non-negative decimal value.");
                 System.out.print("Enter the input: ");
                 factorialInput = sc.nextInt();
                 result = ScientificCalculator.calculateFactorial(factorialInput);
                 System.out.println("The result is " + result);
                 break;

             case 6 :
                 System.out.println("Program quits ...");
               abc = false;

               default:
                 System.out.println("Wrong choice???");
                 break;

         }
     }
    }
}
