import java.util.Scanner;
import java.util.Random;
public class Sapxepngaunhien {
    public static void main (String [] args) {
        Scanner songuyen=new Scanner(System.in);
        System.out.print("nhập số phần tử của mảng: ");
        int b=songuyen.nextInt();
        int [] mang = new int [b];
        NhapNgauNhien(mang,b);
        for(int i=0;i<mang.length;i++){
            for(int j=i+1;j<mang.length-1;j++){
                if(mang[i]>mang[j]){
                    int tempt=mang[i];
                    mang[i]=mang[j];
                    mang[j]=tempt;
                }
            }
        }
        in(mang);

    }
    static void NhapNgauNhien(int [] a,int n){
        Random random=new Random();
        for(int i=0;i<n;i++){
            a[i]=random.nextInt(100)+1;
        }
    }
    static void in (int [] a){
        for(int num : a){
            System.out.print(num + " ");
        }
    }

}

