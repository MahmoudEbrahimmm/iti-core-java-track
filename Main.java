import java.util.Scanner;

class Main{
    public static void main(String args[]){
        //create input
        Scanner input = new Scanner(System.in);

        //enter name
        System.out.printf("Enter your name: ");
        String name = input.nextLine();

        //enter age
        System.out.printf("Enter your age: ");
        int age = input.nextInt();

        //enter weight
        System.out.printf("Enter your weight (kg): ");
        double weight = input.nextDouble();
        
        //Height
        System.out.printf("Enter your Height (m): ");
        double height = input.nextDouble();

        //BMI
        double bmi = weight / (height * height);

        //Display info of user
        System.out.printf("%n======== Information of %s bmi ========%n",name);
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years %n", age);
        System.out.printf("Weight: %f kg %n", weight);
        System.out.printf("Height: %f m %n", height);
        System.out.printf("BMI: %.2f %n", bmi);
        System.out.println("Goog By");


    }
}