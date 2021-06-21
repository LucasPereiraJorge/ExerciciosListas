import java.util.Scanner;

public class Main {
    static void myMethod(char[] letras, int i, int vS){
        Scanner scanner = new Scanner(System.in);
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for(i = 0; i< letras.length; i++){
            letras[i] = scanner.next().charAt(0);
        }
        for (i = 0; i< letras.length; i++){
            for (int j=0; j<5; j++){
                if (letras[i] == vogais[j]) {
                    letras[i] = ' ';
                    vS++;
                }
            }

        }
        for (i = 0; i< letras.length; i++){
            if (letras[i] != ' ') {
                System.out.print(letras[i] + ", ");

            }
        }
        System.out.println("Das 5 letras digitadas são consoantes : " + (5-vS));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma seleção de letras.");
        myMethod( new char[5], 0, 0);
    }
}
