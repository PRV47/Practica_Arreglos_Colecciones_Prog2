import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        int [] num = new int[10];
        int max = Integer.MIN_VALUE;
        int mem = 0;
//
//        for (int i = 0; i < 10; i++ ){
//            System.out.print("Ingrese un numero: ");
//            num[i] = reader.nextInt();
//
//            if (num[i] <= 1) {
//                break;
//            } else {
//                for (int x = 2; x < num[i]; x++) {
//                    if (num[i] % x == 0) {
//                        break;
//                    } else {
//                        if (num[i] > max) {
//                            max = num[i];
//                            mem = i + 1;
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println("El mayor numero primo es " + max + " en la posicion " + mem);

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            num.add(reader.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            if (num.get(i) <= 1) {
                break;
            } else {
                for (int x = 2; x < num.get(i); x++) {
                    if (num.get(i) % x == 0) {
                        break;
                    } else {
                        if (num.get(i) > max) {
                            max = num.get(i);
                            mem = i + 1;
                        }

                    }
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No hay ningun primo en el arreglo");
        } else {
            System.out.println("El mayor numero primo es " + max + " en la posicion " + mem);
        }
    }
}
