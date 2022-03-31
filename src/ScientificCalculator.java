public class ScientificCalculator {

    public static void DisplayMenu(){
        System.out.println("Here are the menu options for your choice [1 through 6] :");
        System.out.println("*** Press 1 to calculate POWER       ***");
        System.out.println("*** Press 2 to calculate SQUARE ROOT ***");
        System.out.println("*** Press 3 to calculate MAXIMUM     ***");
        System.out.println("*** Press 4 to calculate LOGARITHM   ***");
        System.out.println("*** Press 5 to calculate FACTORIAL   ***");
        System.out.println("*** Press 6 to TERMINATE the program ***");
        System.out.print("Your choice? : ");
    }
    public static double CalculatePower(double a , double b){

        double Result=1.0;
        for (int i=1; i<=b; i++)
            Result=(Result*a);
        return Result;
    }
    public static double CalculateSquareRoot(double ınt ){
        double res;
        res =Math.sqrt(ınt);
        return res;
    }
    public static double calculateMaximum(double first, double second) {
        if (first > second) {
            return first;
        }
        else {
            return second;
        }
    }
    public static double calculateLogarithm(double input) {
        return Math.log(input);
    }

    public static int calculateFactorial(int n){
    int factorialValue = 1;
        for (int i = 1; i <= n; i++) {
        factorialValue *= i;
    }
        return factorialValue;
    }

}
