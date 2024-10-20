import java.util.Scanner;
public class tinhgiathua {
    public static void main (String [] args){
        System.out.print("Nhập n: ");
        int n= new Scanner(System.in).nextInt();
        System.out.print("Gia thừa của "+n+" là: "+ giaThua(n));
    }
    static int giaThua(int n){
        if(n<=1){
            return 1;
        }
        else {
            return n*giaThua(n-1);
        }
    }
}
