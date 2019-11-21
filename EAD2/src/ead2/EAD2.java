
package ead2;

import java.util.Scanner;

/**
 *
 * @author Giovani O.
 */
public class EAD2 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static int[] carregarVetor(int[] vetor){
        System.out.println("Adicione números inteiros ao vetor.");
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Posição["+ i +"]: ");
            vetor[i] = input.nextInt();
        }
        
        return vetor;
    }
    
    public static void listarVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição[" + i + "]: " + vetor[i]);
        }
    }
    
    public static void filtrarPares(int[] vetor){
        System.out.println("Números pares no vetor: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.println("Posição[" + i + "]: " + vetor[i]);
            }
        }
    }
    
    public static void filtrarImpares(int[] vetor){
        System.out.println("Números impares no vetor: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 != 0){
                System.out.println("Posição[" + i + "]: " + vetor[i]);
            }
        }
    }
    
    public static void parIndiceImpar(int[] vetor){
        int acumulador = 0;
        
        for (int i = 0; i < vetor.length; i++){
            if (i % 2 != 0 && vetor[i] % 2 == 0){
                acumulador++;
            }
        }
        
        System.out.println("Há " + acumulador + " números pares em posições impares.");
    }
    
    public static void imparIndicePar(int[] vetor){
        int acumulador = 0;
        
        for (int i = 0; i < vetor.length; i++){
            if (i % 2 == 0 && vetor[i] % 2 != 0){
                acumulador++;
            }
        }
        
        System.out.println("Há " + acumulador + " números impares em posições pares.");
    }
            
    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean controle = true;
        
        while (controle == true){
            carregarVetor(vetor);
        
            System.out.println("-------");
        
            listarVetor(vetor);

            System.out.println("-------");

            filtrarPares(vetor);

            System.out.println("-------");

            filtrarImpares(vetor);

            System.out.println("-------");

            parIndiceImpar(vetor);

            System.out.println("-------");

            imparIndicePar(vetor);
            
            System.out.println("-------");
            
            System.out.println("Deseja executar o programa novamente? (s/n)");
            String sN = input.next();

            if ("s".equals(sN) || "S".equals(sN)){
                controle = true;
            }else if ("n".equals(sN) || "N".equals(sN)){
                controle = false;
            }
            
            
        }
    }
    
}
