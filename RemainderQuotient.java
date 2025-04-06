import java.util.Scanner;

class RemainderQuotient{
    public static void main(String[] args){
        int a,b;
        // a=9;
        // b=3;
        // int r=a%b;
        // int q=a/b;

        //Make User Define

        Scanner rq= new Scanner(System.in);
        System.out.println("Enter = ");
        a= rq.nextInt();
        System.out.println("Enter =");
        b = rq.nextInt();
        int r= a%b;
        int q = a/b;


        System.out.println("Quotient = "+q+ " Remainder = " + r);
    }
}