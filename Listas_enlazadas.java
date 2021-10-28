/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_enlazadas;
import java.util.Scanner;

/**
 *
 * @author famil
 */
public class Listas_enlazadas {
 
   static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");

        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }

       static class Node {
           String name;
           Node next;
    }
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Scanner rd = new Scanner(System.in);
           Node top = null;
           int opt = 0;

        do {
            System.out.println("\n1 agregar nodo incial\n"
                     + "2 agregar nodo anterior a inicial\n"
                     + "3 agregar nodo posterior a inicialt\n"
                     + "4 agregar nodo intermedio\n"
                     + "5 mostrar lista\n"
                     + "6 salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    top = new Node();
                    System.out.println("ingresa contenido de nodo incial");
                    top.name = rd.nextLine();
                    top.next = null;
                    dump("Caso 1", top);
                    break;
                case 2:
                    Node temp;

                    temp = new Node();
                    System.out.println("ingresa contenido de nodo anterior a inicial");
                    temp.name = rd.nextLine();
                    temp.next = top;
                    top = temp;
                    dump("Caso 2", top);
                    break;
                case 3:
                    temp = new Node();
                    System.out.println("ingresa contenido de nodo posterior a inicial");
                    temp.name = rd.nextLine();
                    temp.next = null;

                    Node temp2;

                    temp2 = top;

                    while (temp2.next != null) {
                        temp2 = temp2.next;
                    }

                        temp2.next = temp;
                        dump("Caso 3", top);
                    break;
                case 4:
                    temp = new Node();
                    System.out.println("ingresa contenido de nodo intermedio");
                    temp.name = rd.nextLine();

                    temp2 = top;

                    while (temp2.name.equals(top.name) == false) {
                    temp2 = temp2.next;
                    }
                      temp.next = temp2.next;
                      temp2.next = temp;
                    dump("Caso 4", top);
                    break;
                case 5:
                    dump("contenido de Nodos", top);
                    break;
                case 6:
                    break;
            }

        } while (opt!= 6);

    }
    
}
 
