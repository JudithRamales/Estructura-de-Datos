/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaa_b;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Judith Ramales 
 */
public class PilaA_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
   
        Scanner sc = new Scanner(System.in);
        Random rand = new Random ();

        int tope=0, topeB=0, opcion = 0;
        int a = 0, b = 0, pila;
       

        System.out.println("Ingrese el tamaño de pila que quiere: ");//Pedimos matriz
        int tamaño = sc.nextInt();
        
        
        
        int[] A_pila = new int[tamaño];

        int[] B_pila = new int[tamaño];

        int[] C_pila = new int[tamaño+tamaño];

        do {

            System.out.println("\nSelecciona una opción: \n"
                    + "\n1. Llenar pila A y B\n"
                    + "2. Mostrar pilas A y B\n"
                    + "3. Vaciar pila A y B\n"
                    + "4. Unir pila A y B\n"
                    + "5. Mostrar pila C \n"
                    + "6. Salida\n");

            switch (opcion = sc.nextInt()) {

                case 1:

                    if (tope == A_pila.length) {
                        System.out.println("pila llena...");
                    } else {
                        System.out.println("Valores aleatoreos listos");
                        for (int i = 0; i <A_pila.length; i++) {
                               A_pila[i] = rand.nextInt(100-1+1)+1;
                              //números random                         
                          }
                        if (topeB == B_pila.length) {
                        System.out.println("pila llena...");
                    } else {
                                for (int i = 0; i <B_pila.length; i++) {
                                B_pila[i] = rand.nextInt(200-100+1)+100;
                               //números random 
                        }
                    }
                    }
                    break;

                case 2:

                    System.out.println("La pila A sus valores aleatorios son: \n");
                   for (int i=0;i<A_pila.length; i++) {
                     System.out.println(" " + A_pila[i]);
                     //Mostrar los vectores
                     
            }
                   System.out.println("\nLa pila B sus valores aleatorios son:  \n");//impreción en pantalla 
                   for (int i=0;i<B_pila.length; i++) {
                     System.out.println(" " + B_pila [i]);
                     //Mostrar los vectores
            }
                    break;

                case 3:
                    if (tope > 0) {

                        System.out.println("Datos de pila A eliminados" + tope);
                        tope--;
                    } 
                     else {

                        System.out.println("pila A vacia");}
                    
                    if (tope > 0) {

                        System.out.println("Datos de pila B eliminados" + tope);
                        tope--;
                    } else {

                        System.out.println("pila B vacia");
                    }
                    break;

                case 4:
                    System.out.println("Pila A y pila B unidas ");
                        
                    System.out.println("Pila C");
                    int uni= 0;
                    
                    for (int i = 0; i<tamaño; i++) {
                      
                        C_pila[uni]= A_pila[i];
                        uni++;
                        C_pila[uni] = B_pila[i];
                        uni++;
                                        }
                    System.out.print("\n" );
                    for(int i=0;i<tamaño*2;i++){
                        System.out.print(C_pila[i]+" ");
                    }
                    System.out.println();
                    
                    break;
                   
                case 5:
                    System.out.println("Pila C \nLa suma de las pilas son: ");
                    for(int i = 0;i<A_pila.length;i++){
                            for(int j = 0;j<B_pila.length;j++){
                                if(i==j){
                                    pila=A_pila[i]+B_pila[j];
                            System.out.println(pila+" ");
                                }
                            }
                          }
                    break;
            }
        } while (opcion != 6);
    }
   
}