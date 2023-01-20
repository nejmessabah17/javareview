package Com.Syntax.Review2;

public class IfStatement {
    public static void main(String[] args) {
        /*
        if statement conditional statement
       if  (boolean coditional){
            code
        {
         */
        //> ,>=,< , <= , != ,
        int day= 2;
        if (day==1) {
            System.out.println("it is the first day of the month");

        }

            String month="December";
        if(month.equals("December")){
            System.out.println("it is Christmas time");
        }

        boolean evening=true;
        if (evening){
            System.out.println("i might have a class at syntax");
        }
    }
}
