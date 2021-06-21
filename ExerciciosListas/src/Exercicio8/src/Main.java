import java.util.Scanner;

public class Main {

    static void myMethod(float[][] idadeA, int i){
        for (; i<5; i++){
            System.out.println("Pessoa " + (i+1) + " Idade: ");
            Scanner sc= new Scanner(System.in);
            idadeA[i][0] = sc.nextFloat();
            System.out.println("Altura: ");
            idadeA[i][1] = sc.nextFloat();
        }
        for (i=4; i>-1; i--){
            System.out.println("Pessoa " + (i+1) + " Idade " + idadeA[i][0] + " ,Altura " + idadeA[i][1]);
        }
    }

    public static void main(String[] args) {
        myMethod(new float[5][2], 0);
    }
}
