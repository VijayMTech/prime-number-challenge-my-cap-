import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Please insert any number:");
        Scanner SC= new Scanner(System.in);
        int n=SC.nextInt();
        int i,m=0,flag=0;
        m=n/2;
        for (i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n + "is not a prime number");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(n+"\tis a prime number");
        }
    }
}