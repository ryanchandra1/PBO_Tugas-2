import java.util.Scanner;

public class T2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata;
        String kalimat = "\nkalau dilakukan dengan sepenuh hati maka besi batangan" +
                "pun kalau digosok terus menerus akan menjadi jarum";
        System.out.println("" + kalimat);

        while (true){
            System.out.println("\nMohon input kata/kalimat yang sama dengan diatas : ");
            kata = sc.nextLine();
            if (kalimat.contains(kata)) {
                System.out.println("Benar! Pada kalimat diatas terdapat : \n" + kata);
                break;
            } else {
                System.out.println("Mohon input kata/kalimat yang benar!");
            }
        }
    }
}
