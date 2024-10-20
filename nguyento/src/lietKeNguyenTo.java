import java.util.Scanner;
public class lietKeNguyenTo {
    public static void main (String [] args){
        System.out.print("Nhập số phần tử mảng: ");
        int n= new Scanner(System.in).nextInt();
        int [] mang=new int [n];
        nhap(mang,n);
        for (int num :mang ) {
            if(nguyenTo(num)== true) {
                System.out.print(num+ " ");
            }
        }
    }
    static boolean nguyenTo (int n){
        if(n<2) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i== 0) {
                return false;
            }
        }
        return true;
    }
    static void nhap (int a[], int n){
        for(int i=0;i<n;i++){
            System.out.print("Nhập phần tử thứ "+ i+": ");
            a[i]=new Scanner(System.in).nextInt();
        }
    }
}
