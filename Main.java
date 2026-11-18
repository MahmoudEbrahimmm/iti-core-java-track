import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //var
        int sum = 0;

        System.out.print("Enter the grade first subject ");
        int grade1 = input.nextInt();

        System.out.print("Enter the grade sec subject ");
        int grade2 = input.nextInt();

        sum = grade1 + grade2;
        System.out.println("Total sum: " + sum);

    }
}