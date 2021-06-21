import java.util.Scanner;

public class Main {

    static void myMethod(float[] notas, float media, int i) {
        Scanner scanner = new Scanner(System.in);
        for (; i < notas.length; i++) {
            System.out.println("Digite sua nota do " + (i + 1) + " bimestre");
            notas[i] = scanner.nextFloat();
            media += notas[i];
        }
        for (i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        float mm = (media/ notas.length);
        System.out.println("Sua média foi de " + mm);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myMethod(new float[4],0,0);
    }
}
