/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_abecedario;

import java.util.Scanner;

/**
 *
 * @ Judith Ramales
 */
public class PIlas_Abecedario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
          Scanner in = new Scanner(System.in);
        int ciclo, tope=0;
        char pila[] = new char[27]; 
        //en esta linea se crea la pila
        do{ 
        //comenzamos implementando un ciclo do while que hará basicamente que se 
        //repita el ciclo hasta que se seleccione la opcion salir
            System.out.print("1. Llenar\n"
                    + "2. Mostrar\n"
                    + "3. Eliminar\n"
                    + "4. Salir\n");
            switch(ciclo=in.nextInt()){ 
            //switch seleccionamos las opciones
                case 1: 
                    //Se rellena la pila desde el 0 hasta el 26 con las letras del abecedario
                    tope=0;
                    pila[tope]='A';tope++; pila[tope]='B';tope++; pila[tope]='C';tope++; pila[tope]='D';tope++;
                    pila[tope]='E';tope++; pila[tope]='F';tope++; pila[tope]='G';tope++; pila[tope]='H';tope++;
                    pila[tope]='I';tope++; pila[tope]='J';tope++; pila[tope]='K';tope++; pila[tope]='L';tope++;
                    pila[tope]='M';tope++; pila[tope]='N';tope++; pila[tope]='Ñ';tope++; pila[tope]='O';tope++;
                    pila[tope]='P';tope++; pila[tope]='Q';tope++; pila[tope]='R';tope++; pila[tope]='S';tope++;
                    pila[tope]='T';tope++; pila[tope]='U';tope++; pila[tope]='V';tope++; pila[tope]='W';tope++;
                    pila[tope]='X';tope++; pila[tope]='Y';tope++; pila[tope]='Z';tope++;
                    System.out.println("Valores agregados");
                    break;
                case 2: 
                    //La pila de abecedario se muestra 
                    for(int i=tope-1;i>=0;i--){
                        System.out.print(" "+pila[i]);
                    }
                    System.out.println("");
                    break;
                case 3: 
                     //Se eliminara de las letras de 1 en 1, del 26 al 0, cuando ya no haya nada 
                        if(tope>0){
                        tope--;
                        System.out.println("Dato "+tope+" eliminado\n");
                    } else{
                        System.out.println("La pila está vacía\n");
                    }                    
                    break;
                case 4: 
                    //Se finaliza todo el ciclo
                    ciclo=4;
                    break;
                default: 
                    break;
            }
        }       while(ciclo!=4);
    }
}