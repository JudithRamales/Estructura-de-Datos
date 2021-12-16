package nodolista;

import java.util.Scanner;

/**
 * @author Judith Ramales
 */
public class NodoLista {

    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);

    static class Nodo {
        int id;
        float Precio;
        String Marca;
        String Tipo;
        Nodo sig;
    }
    
    Nodo Inicio = null;
    Nodo Fin = null;
    int i=1;
    
    public void Agregar() {

        Nodo temp=new Nodo();

        temp.id=i;        
        System.out.print("Ingrese marca: ");
        temp.Marca = sc.nextLine();
        System.out.print("Ingrese tipo de ropa: ");
        temp.Tipo = sc.nextLine();
        System.out.print("Ingrese precio: ");
        temp.Precio = sd.nextFloat();
        if (Inicio == null) {
            Inicio = temp;
            Inicio.sig = null;
            Fin = temp;
        } else {
            Fin.sig=temp;
            temp.sig=null;
            Fin=temp;
            System.out.println("Dato agregado " + Fin.id);
        }
        i++;
    }
    public void Mostrar() {

        Nodo actual=new Nodo();
        actual=Inicio;
        if (Inicio !=null) {
            while (actual != null) {
                System.out.println(" " + "[" + actual.id + "] " + "[" + actual.Marca + "] " + " [" + actual.Tipo + "]"
                        + " [" + actual.Precio+ "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\nLista vacia");
        }
    }

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int opt = 0;

        NodoLista n = new NodoLista();

        do {
            System.out.println("\n1 Add"
                  + "\n2 Show" 
                  + "\n3 Exit");

            switch (opt = sn.nextInt()) {

                case 1:

                    n.Agregar();

                    break;

                case 2:

                    n.Mostrar();

                    break;
            }
        } while (opt != 3);
    }
}