/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tamanho;
        System.out.println("Quantos Numeros voce quer Imprimir: ");
        tamanho = entrada.nextInt();
        
        int numeros[] = new int[tamanho];

        // Preenchendo o vetor
        for (int i = 0; i < numeros.length ; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros armazenados no vetor:");

        // Exibindo os valores do vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        entrada.close();
    }
}
