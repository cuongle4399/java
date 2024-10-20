import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap tên: ");
        String nhapten = sc.nextLine();
        System.out.print("nhập tuổi đi: ");
        int tuoi= sc.nextInt();
        System.out.print("Nhập giới tính của bạn: ");
        String gioitinh= new Scanner(System.in).nextLine();
        System.out.print("Tên của bạn là: "+nhapten + " Tuổi: "+ tuoi+ " giới tính: "+ gioitinh);
    }
}