import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
//        int [] num = new int[10];
        int contador = 0;
        List<Integer> num = new ArrayList<>();

        for (int i = 100; i <= 300 && contador < 10; i++) {
            boolean flag = true;
            for (int x = 2; x * x <= i; x++) {
                if (i % x == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
//                num[contador] = i;
                num.add(i);
                contador = contador + 1;
            }
        }

        for (int y = 0; y < 10; y++ ) {
            System.out.println(num.get(y));
        }

    }
}

