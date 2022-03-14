import java.util.Scanner;
public class ismail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz(Örn. 75 kg):");
            double kilo = scanner.nextInt();
                System.out.println("Boyunuzu giriniz(Örn. 180 cm)");
                    double boy = scanner.nextInt();
                    boy = boy/100;

    double kbi = kilo/(boy*boy);
        System.out.println("Kitle Beden İndeksiniz");
            System.out.println(kbi);

    }
}
