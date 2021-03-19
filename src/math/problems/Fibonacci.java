package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        int num=40;
        int a=0;
        int b=1;
        for(int i=1;i<=num;i++){
            int sum=a+b;
            System.out.println(a);
            a=b;
            b=sum;



        }


    }


}
