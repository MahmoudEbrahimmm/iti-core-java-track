import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;

        double div = num1 / num2;
        double mul = num1 * num2;
        double mod= num1 % num2;

        System.out.println(sum + "\n" + sub + "\n" + div + "\n" + mul +"\n"+ mod);

    }
}