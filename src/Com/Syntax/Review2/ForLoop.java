package Com.Syntax.Review2;

public class ForLoop {
    public static void main(String[] args) {
        //best loop --->used when we know how many times we want to repeat block of COT
        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);
            if (i == 12) {
                System.out.println("i is equal to 12-I am breaking my loop");

                break;//stops/break the loop
            }
        }
        //continue-->skips current iteration
        for (int i=1;i<=10;i++){
            if (i%3==0){
                System.out.println(i);
                continue;//java goes to the beginning of the loop
                // and skips teh rest of the code that i inside loop body
            }
            System.out.println("hello");
            System.out.println(" how are you");
            System.out.println(" hope you well");
        }
    }
}