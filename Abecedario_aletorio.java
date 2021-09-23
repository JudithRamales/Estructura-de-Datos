/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abecedario_aletorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class Abecedario_aletorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
      
        Random tp = new Random();
        
        int tope = 0, opt = 0;
        char[] pila = new char[26];
        char car;
        do {
            System.out.println("1 - llenar\n"
                    + "2 - eliminar\n"
                    + "3 - mostrar\n"
                    + "4 - repetidas\n"
                    + "5 - salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    char letra = 'A';
                    for (int i = 0; i < 26; i++) {
                        if (tope < 26) {
                            
                            letra = (char)(tp.nextInt(26) + 'a');
                            pila[tope] = letra;//abc[i];
                            letra++;
                            tope++;
                            System.out.println("Valores agregados");
                        } else {
                            System.out.println("La pila esta llena");
                            break;
                        }
                    }
                    break;
                case 2:
                    if (tope > 0) {
                        System.out.println("Se elimino un dato " + tope);
                        //restar unidad a tope, para poder reutilizar la posicion 
                        tope--;
                    } else {
                        System.out.println("no hay elementos para eliminar");
                    }
                    break;
                case 3:
                    if (tope > 0) {
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println(" " + pila[i]);
                        }
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 4: 
                //repetir
                    for (int i = 0 ; i < pila.length; i++) {
                        int cont = 0;
                        car = pila[i];
                           for (int j = 0 ; j < pila.length; j++){
                               if(pila[j] == car){
                                   cont++;
                               }
                           }
                           System.out.println(pila[i] + " se repite " + cont + " veces ");
                           cont = 0;
                        }
                    
                
                    break;
                case 5:
                    

                
            }
        } while (opt != 5);
    }
}
