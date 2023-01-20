package Com.Syntax.Review2;

public class NestedLoops {
    public static void main(String[] args) {
        //nested-->loop inside another loop


        for (int i = 1; i <= 3; i++) { //outer loop
            System.out.println(i);
            for (int j = 1; j <= 4; j++) {// inner loop
                System.out.println(j);
            }
        }
        System.out.println("***********************");
        for (int i=1;i<5;i++){
            System.out.println("hello");
            for (int j=1;j<=2;j++){// inner
                System.out.println("bye");

            }
        }
        System.out.println("************************");
        for (int i=0;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("--------car--------");
        for (int a=0;a<=9;a++){
            for (int b=0;b<=9;b++){
                for (int c=0;c<=9;c++){
                    for (int d=0;d<=9;d++){
                        System.out.println(a + " " + b + " " + c + " " + d );
                    }

                }
            }
        }
    }
}