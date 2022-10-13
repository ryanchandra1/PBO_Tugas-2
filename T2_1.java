import java.util.Scanner;
public class T2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a;
        System.out.print("Masukkan angka 0-10 : ");
        a = sc.nextInt();
        while (a > 10) {
            System.out.println("Angka yang anda masukkan salah. \nMohon masukan Angka kembali");
            a = sc.nextInt();
        }
        System.out.println("Angka yang anda masukkan adalah \n" + a);

    }
}