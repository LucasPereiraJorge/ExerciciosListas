import java.util.Scanner;

public class Main {

    static void myMethod(int i, int[] numeros ) {
        Scanner scanner = new Scanner(System.in);

        for (; i < numeros.length; i++) {
            System.out.println("Digite o valor da casa " + (i + 1));
            numeros[i] = scanner.nextInt();
        }
        for (i = 9; i>=0; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }

    public static void main(String[] args) {
        myMethod(0,new int[10]);
    }
}
