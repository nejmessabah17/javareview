package Com.Syntax.Review2;

import java.util.Scanner;

public class ScannerExemple {
    public static void main(String[] args) {

        int i=10;

        // no primitive valiable = scanner
              Scanner  keyboard= new Scanner(System.in);
        System.out.println("please enter your age");
        int age= keyboard.nextInt();//to capture int value
        System.out.println("are you tired");
        boolean tired= keyboard.nextBoolean();//To capture boolean values

        System.out.println("what is your name");
            String name= keyboard.next(); //to capture string until space
    }
}
