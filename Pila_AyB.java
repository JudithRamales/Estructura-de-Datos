/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_ayb;
import java.util.Scanner;
/**
 *
 * @author Judith Ramales
 */
public class Pila_AyB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        int tope = 0, topeB = 0, opc = 0;
        int a = 0, b = 0;

        int[] pilaA = new int[5];

        int[] pilaB = new int[5];

        int[] pilaC = new int[10];

        do {

            System.out.println("\nSelecciona la opción: \n"
                    + "\n1. Llenar pila A\n"
                    + "2. Llenar pila B\n"
                    + "3. Borrar dato de pila A\n"
                    + "4. Borrar dato de pila B\n"
                    + "5. Mostrar pila A y B \n"
                    + "6. Unificación de pilas\n"
                    + "7. Salida\n");

            switch (opc = sc.nextInt()) {

                case 1:

                    if (tope == pilaA.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println("Introduzca valor: ");
                        pilaA[tope] = sc.nextInt();
                        System.out.println(tope + " lugar del valor");
                        tope++;
                    }
                    break;

                case 2:

                    if (topeB == pilaB.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println("Introduzca valor: ");
                        pilaB[topeB] = sc.nextInt();
                        System.out.println(topeB + " lugar del valor");
                        topeB++;
                    }

                    break;

                case 3:
                    if (tope > 0) {

                        System.out.println("Dato de A eliminado " + tope);
                        tope--;

                    } else {

                        System.out.println("pila A vacia");

                    }
                    break;

                case 4:
                    if (topeB > 0) {

                        System.out.println("Dato de B eliminado " + tope);
                        topeB--;

                    } else {

                        System.out.println("Pila B vacia");

                    }
                    break;

                case 5:
                    if (tope > 0) {

                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.print(" " + pilaA[i]);
                        }

                    } else {
                        System.out.println("\nPila A vacia");
                    }

                    if (topeB > 0) {

                        for (int j = topeB - 1; j >= 0; j--) {
                            System.out.print(" " + pilaB[j]);
                        }
                    } else {
                        System.out.println("\nPila B vacia");
                    }

                    break;

                case 6:
                    
                    System.out.println("Unión de pilas terminado");
                    int uni= 0;
                    
                    for (int i = 0; i < 5; i++) {
                      
                        pilaC[uni]= pilaA[i];
                        uni++;
                        pilaC[uni] = pilaB[i];
                        uni++;
                    }
                    System.out.print("\n" );
                    for(int i=0;i<10;i++){
                        System.out.print(pilaC[i]+" ");
                    }
                    System.out.println();
                    
                    break;

            }

        } while (opc != 7);

    }
}