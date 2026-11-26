public class Example {
    public  static  void main(String[] args){
        int [] numbers = {2 , 8 , 9};
        int c = 0;

        try {
            c = numbers[6];
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You tried to access an elemtns that is out");
            System.out.println("Continuing with c value of 1.");
            c = 1;
        }

        System.out.print(c);
    }
}