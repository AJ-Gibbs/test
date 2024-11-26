import java.util.Scanner;

public class Area_Testing {
    public static void main (String [] args){
        //System.out.println("Testing");
        //write a code that asks user for width and height and returns area
        //System.out.println("no.");
        System.out.println("-The Area of A Shape-");

        Scanner input = new Scanner(System.in);

        System.out.print("What's the width: ");
        double width = input.nextDouble();

        System.out.print("What's the height: ");
        double height = input.nextDouble();


        //Math Calculations
        double area = width * height;

        System.out.println("The Area of your chosen shape is: " + area);






    }
}
