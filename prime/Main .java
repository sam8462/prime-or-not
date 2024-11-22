import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }else {
            boolean isPrime=true;
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i ==0){
                    isPrime=false;
                }
            }
            if (isPrime==true){
                System.out.println("number is prime");
            }else {
                System.out.println("number is not prime");
            }
        }
    }
}