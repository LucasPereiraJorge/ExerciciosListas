import java.util.Scanner;

public class Main {
    static void myMethod(float[] vet1, float[] vet2, int i, int n, int j){
        float[] soma = new float[vet1.length+vet2.length];

        System.out.println("Vetor 1");
        for (; i<vet1.length; i++){
            System.out.println((i+1) + " Numero");
            Scanner sc = new Scanner(System.in);
            vet1[i] = sc.nextFloat();
        }
        System.out.println("Vetor 2");
        for (; i<vet2.length; i++){
            System.out.println((i+1) + " Numero");
            Scanner sc = new Scanner(System.in);
            vet2[i] = sc.nextFloat();
        }
        System.out.println("Vetores Unificados");
        while (n< soma.length){
            soma[n] = vet1[j];
            n++;
            soma[n] = vet2[j];
            n++;
            j++;
        }
        for (; i< soma.length; i++){
            System.out.print(soma[i] + ", ");
        }
    }

    public static void main(String[] args) {
        myMethod(new float[3], new float[3], 0 , 0,0);
    }
}
