import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        int[] num = new int[10];
        List<Integer> num = new ArrayList<>();
        int temp;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
//            num[i] = reader.nextInt();
            num.add(reader.nextInt());
        }
        for (int i = 0; i < 10; i++) {
//            if (num[i] % 10 == 4) {
            if (num.get(i) % 10 == 4) {
                System.out.println("El numero " + num.get(i) + " en la posicion " + (i + 1));

            }
        }
    }
}
