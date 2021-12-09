package producto;

import java.util.Scanner;

public class Producto {
 Scanner sc = new Scanner(System.in);

 
 static class Nodo{
     String DatoNom;
     String DatoMar; 
     String DatoPre;
     Nodo Sig;
 }
 Nodo Inicio;
 Nodo Fin;
 
 public void Agregar(){
     Nodo Temp = new Nodo();
     System.out.println("Agrege el nombre del Producto:");
     Temp.DatoNom=sc.nextLine();
     System.out.println("Agrege la marca del Producto:");
     Temp.DatoMar=sc.nextLine();
     System.out.println("Agrege el precio del Producto:");
     Temp.DatoPre=sc.nextLine();
     if(Inicio==null){
       Inicio=Tem;
       Inicio.Sig=null;
       Fin=Tem;

       System.out.println("Datos Agregados...");
     }else {
         Fin.Sig=Tem;
         Temp.Sig=null;
         Fin=Tem;
         System.out.println("Datos Agregados...");
     }
 }
 public  void Mostrar(){
     Nodo Actual = new Nodo();
     int con=1;
     Actual = Inicio;
     if(Inicio!=null){
        while(Actual!=null){
            System.out.println("Numero de lista:["+ con + "]" +" "+ "Nombre:["+Actual.DatoNom+"] "+"Marca:["+Actual.DatoMar+"] "+"Precio:["+Actual.DatoPre+"]");
            Actual=Actual.Sig;
            con++;
        }
     }else{
         System.out.println("\n La lista esta vacia...");
     }
 }
 public void Buscar(){
    int cont = 0;
    Nodo Sig = new Nodo();
    Boolean Encontrado = true;
    String valor;
    Sig = Inicio;

    if (Inicio != null) {
        System.out.println("Ingrese el nodo a buscar");
        valor = sc.nextLine();
        
        if (Sig != null && Encontrado != true) {

            if (Sig.DatoNom == valor) {
                Encontrado = true;
                cont++;
                System.out.println("El dato encontrado es: " + valor + "en posición: " + cont);
            } else {
                Sig = Sig.DatoNom;
            }
        } else {
            System.out.println("El dato a buscar si se encuentra es: " + valor );
        }
    } else {
        System.out.println("Lista vacia");
     
 }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Ope=0;
        Producto n = new Producto();
        System.out.println("Bienvenidos a la aplicacion de listas doblemente enlazadas\n"
        +"Elija de las siguientes opciones:");
        do{
            System.out.println("1.-Agregar a la lista.\n"
            +"2.-Mostrar la lista.\n"
            +"3.-Salir de la lista.");
            switch(Ope=sc.nextInt())
            {
                case 1:
                    n.Agregar();
                    break;
                case 2:
                    n.Mostrar();
                    break;
                case 3:
                    n.Buscar();
                    break;
            
                default: System.out.println("No existe la opción");
        }
        }while(Ope!=3);
    }
    
}
