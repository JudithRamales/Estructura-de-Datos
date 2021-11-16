
package lista1;
import java.util.Scanner; 

public class Lista1 {

    Scanner sc= new Scanner (System.in); 
    
    static class Nodo{  //Clase plantilla nodo
        String Name;   //Declaramos string como Name 
        Nodo next;     //Declaramos Nodo como next 
        
    }  
    public static void main(String[] args) { 
        Scanner sc= new Scanner (System.in); 
        int opc; //se declara variable de opcion para el menu
        Lista1 n= new Lista1 (); 
        
        do{ //se abre un do while para nuestro menu
           
System.out.println ("\n Menu de opciones :" + "\n 1-Agregar nodo "+ "\n 2-Eliminar nodos" + "\n 3-Mostrar lista" + "\n 4-Salir ");  //menu de opciones
//Menu de opciones
            
            switch (opc = sc.nextInt()){ //Se abre un switch para evaluar lo que elija el usuario de a cuerdo al menu
                
                case 1:  //caso uno Agregar
                    n.Agregar ();  //se manda a traer el metodo agregar de la case Nodo22
                    break; //cierra caso uno
                    
                    
                case 2: //caso dos Eliminar
                    n.Eliminar (); //se manda a traer el metodo eliminar de la clase Nodo22
                    break; //cierra caso dos 
                    
                    
                 case 3: //caso tres Mostrar
                    n.Mostrar (); //se manda a traer el metodo mostrar de la clase Nodo22
                    break; //cierra caso tres  
                    
                    
            }  
        } while (opc != 4);   
    } Nodo inicial=null; 
    
    
    //METODO PEDIR AL USUARIO AGREGAR UN NODO
    public void Agregar (){ 
        if (inicial== null) { 
            inicial = new Nodo (); //si inicial es nulo entonces
            System.out.println ("Ingrese: "); 
            inicial.Name = sc.nextLine(); 
        } else {  Nodo post = new Nodo (); 
                  System.out.println ("Ingrese: "); 
                  post.Name = sc.nextLine(); 
                  post.next= inicial; 
                  inicial=post; 
            }
    }
     
     
    //METODO MOSTRAR LISTA
    public void Mostrar(){ //se crea el metodo Mostrar
        Nodo post = new Nodo (); post=inicial; 
        if(inicial!= null){ 
        while(post != null){ 
            System.out.print(post.Name + "\n"); //se mostrara el dato
            post = post.next; 
        }
        } else{ System.out.println ("La lista esta vacia");} //Si no, entonces mandara el mensaje 
    }
    
    
     //METODO ELIMINAR NODOS
     public void Eliminar(){ //se crea el metodo Eliminar 
        if(inicial == null){ 
            System.out.println ("No hay nodos que eliminar"); //mandara mensaje
        } else{ System.out.print("\n Nodo eliminado"); 
            inicial = inicial.next;} 
    }    
}  
