import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de numA: ");
        int numA = scanner.nextInt();

        System.out.print("Ingrese el valor de numB: ");
        int numB = scanner.nextInt();

        boolean tienenMismoSigno = (numA > 0 && numB > 0) || (numA < 0 && numB < 0);

        System.out.println(tienenMismoSigno);

        scanner.close();
    }
}
