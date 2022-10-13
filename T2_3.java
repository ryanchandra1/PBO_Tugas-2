import java.util.Random;
import java.util.Scanner;

public class T2_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] tjk = {"t", "j", "k"};
            String komputer = tjk[new Random().nextInt(tjk.length)];
            String jari;
            System.out.println("----------------------------------------------");
            System.out.println("                 |Game Suit|                  ");
            System.out.println("----------------------------------------------");
            System.out.println("| t = Telunjuk | j = Jempol | k = Kelingking |");
            System.out.println("----------------------------------------------");

            while(true) {
                System.out.println("Masukkan jari (t, j, atau k) : ");
                jari = scanner.nextLine();
                if (jari.equals("t") || jari.equals("j") || jari.equals("k")) {
                    break;
                }
                System.out.println(jari + " salah jari");
            }

            System.out.println("Komputer: " + komputer);

            if (jari.equals(komputer)) {
                System.out.println("Hasil = SERI");
            }
            else if (jari.equals("t")) {
                if (komputer.equals("k")) {
                    System.out.println("Hasil = MENANG");

                } else if (komputer.equals("j")) {
                    System.out.println("Hasil = KALAH");
                }
            }

            else if (jari.equals("j")) {
                if (komputer.equals("t")) {
                    System.out.println("Hasil = MENANG");

                } else if (komputer.equals("k")) {
                    System.out.println("Hasil = KALAH");
                }
            }

            else if (jari.equals("k")) {
                if (komputer.equals("j")) {
                    System.out.println("Hasil = MENANG");

                } else if (komputer.equals("t")) {
                    System.out.println("Hasil = KALAH");
                }
            }

            System.out.println("Apakah ingin bermain lagi? (y untuk iya dan t untuk tidak)");
            String maenLagi = scanner.nextLine();

            if (!maenLagi.equals("y")) {
                break;
            }

        }
    }
}
