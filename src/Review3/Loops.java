package Review3;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    /*    int a=1;
        while (a>3){
            System.out.println(" i am while loop");
            a++;
            //
            int b=1;
            do {

                System.out.println("do while");
                b++;
                while (b >= 3) {
?*/
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {


            System.out.println("do you understand loops in java");

            answer = scanner.nextLine();


        }while (!answer.equalsIgnoreCase("yes"));

        System.out.println("great jobs,let's learn arrays noww");
    }

}
