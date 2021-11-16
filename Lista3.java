package lista3;

import java.util.Random;
import java.util.Scanner;


public class Lista3 {
Scanner sc = new Scanner(System.in);

    static class Nodo {  //Clase plantilla nodo

        String Name;   //Declaramos string como Name 
        Nodo next;     //Declaramos Nodo como next 

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc; 
        Lista3 n = new Lista3();

        do { 

            System.out.println("\n Menu de opciones ingrese una opción :"
                    + "\n 1-Agregar nodo "
                    + "\n 2-Eliminar nodos"
                    + "\n 3-Mostrar lista"
                    + "\n 4-Generar palabra"
                    + "\n 5-Salir");

            switch (opc = sc.nextInt()) { 
                case 1:  //caso uno Agregar
                    n.Agregar();  //se manda a traer el metodo agregar de la case Nodo22
                    break; 

                case 2: //caso dos Eliminar
                    n.Eliminar(); //se manda a traer el metodo eliminar de la clase Nodo22
                    break;  

                case 3: //caso tres Mostrar
                    n.Mostrar(); //se manda a traer el metodo mostrar de la clase Nodo22
                    break; 

                case 4: //caso tres Generar
                    n.Generar();
                    break;
            }
        } while (opc !=5);   
    }
    Nodo inicial = null; 

    public void Agregar() { 
        if (inicial == null) { 
            inicial = new Nodo(); 
            System.out.println("Ingrese: "); 
            inicial.Name = sc.nextLine(); 
        } else {
            Nodo post = new Nodo(); 
            System.out.println("Ingrese: "); 
            post.Name = sc.nextLine(); 
            post.next = inicial; 
            inicial = post; 
        }
    }

    public void Mostrar() { 
        Nodo post = new Nodo();
        post = inicial; 
        if (inicial != null) { 
            while (post != null) { 
                System.out.print(post.Name + "\n"); 
                post = post.next; 
            }
        } else {
            System.out.println("La lista esta vacia");
        } 
    }

    public void Eliminar() { 
        if (inicial == null) { 
            System.out.println("No hay nodos que eliminar"); 
        } else {
            System.out.print("\n Nodo eliminado"); 
            inicial = inicial.next;
        } 
    }

    public void Generar(){
        char L1,L2,L3,L4,L5;
        Random r= new Random (); 
        L1 = (char)(r.nextInt(26)+'A');
        L2 = (char)(r.nextInt(74)+48);
        L3 = (char)(r.nextInt(74)+48);
        L4 = (char)(r.nextInt(74)+48);
        L5 = (char)(r.nextInt(14)+33);
        
        if (inicial== null) { 
           inicial = new Nodo (); 
           inicial.Name = (""+L1+L2+L3+L4+L5+""); 
       } else {  Nodo post = new Nodo (); 
                 post.Name = (""+L1+L2+L3+L4+L5+""); 
                 post.next= inicial; 
                 inicial=post; 
           }
        }

}