import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stepNumber;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan istediği adım sayısı alınır
        System.out.print("Adım Sayısını Giriniz: ");
        stepNumber = input.nextInt();

        //Elmasın üst tarafı için normal üçgen yazdırma algoritması kullanılır
        for (int i = 0; i < stepNumber; i++) {

            for (int k = 0; k < (stepNumber - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Aynı üçgen ters çevrilerek elmasın alt kısmını oluşturur
        // Bunun için birinci döngüdeki i sayısı adım sayısından başlar ve birer azalır böylece önceki elmasın tabanındaki yıldız sayısı kadar buraya yıldız yazdırır
        for (int i = stepNumber; i >= 0; i--) {

            for (int k = 0; k < (stepNumber - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}