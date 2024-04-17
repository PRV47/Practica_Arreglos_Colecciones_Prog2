import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
//        int [] num = new int[10];
//        int max = Integer.MIN_VALUE;
//        int mem = -1;
//
//        for (int i = 0; i < 10; i++ ){
//            System.out.print("Ingrese un numero: ");
//            num[i] = reader.nextInt();
//
//            if (num[i] > max) {
//                max = num[i];
//                mem = i;
//            }
//        }
//
//        System.out.println("El mayor numero es " + max + " en la posicion " + mem);

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++ ){
            System.out.print("Ingrese un numero: ");
            num.add(reader.nextInt());
        }

        int max = Collections.max(num);
        int mem = num.indexOf(max);

        System.out.println("El mayor numero es " + max + " en la posicion " + mem);


    }
}