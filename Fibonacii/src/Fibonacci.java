import java.util.Scanner;

class TimsoFibonacci {
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b <= n) {
            if (b == n) return true;
            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Các số Fibonacci trong mảng là:");
        for (int num : arr) {
            if (isFibonacci(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
