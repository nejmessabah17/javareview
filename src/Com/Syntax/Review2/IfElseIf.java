package Com.Syntax.Review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more conditions to test
        if (boolean condition){
              codeA
        }else if (boolean condition){
             condB
        }else  if ( boolean condition}{
             CodeC
             }
         */


        /*check homework
         if you comleteed more than 25 - > great job
           if you comleteed more than > 20 - good job
           if you comleteed more than > 10 - ok job
           if you comleteed more than > 5 - not good job

         */

        int homeWork = 30;
        if (homeWork > 25) {
            System.out.println("great job");
        } else if (homeWork > 20) {
            System.out.println("good job");

        } else if (homeWork > 10) {
            System.out.println("ok job");

        } else if (homeWork > 5) {
            System.out.println("not a good job");


        }
        System.out.println("..................");
        String browser = "firefox";
        if (browser.equals("chrome")) {

            System.out.println("test case executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("test case executed on safari browser");


        } else if (browser.equals("firefox")) {
            System.out.println("test case executed on firefox browse");
        } else {
            System.out.println("browser is not supported");

        }
    }
}
