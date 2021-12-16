package letras;
import java.util.Scanner;
import java.util.Random;

public class Letras {
Scanner sc= new Scanner (System.in);

  public class Nodo {
      char Dato1,Dato2,Dato3,Dato4, name;
      Nodo Next;
  }
  Nodo inicio= null;
  Nodo fin = null;
  char rd;
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
        Letras n= new Letras ();
        int opc;
        do {
            
            System.out.println("\n Menú de opciones:"
                    + "\n 1- Llenar "
                    + "\n 2- Mostrar"
                    + "\n 3- Ordenar "
                    + "\n 4- Salir");
            
            switch(opc = sc.nextInt ()){
                case 1:
                    n.Llenar();
                    break;
                case 2:
                    n.Mostrar();
                    break;
            }
       } while ( opc != 3);
    }
   public void Llenar (){
        int cont;
        Random rd= new Random ();   
        
         for (cont=1;cont<=100;cont++) {
         Nodo temp =new Nodo();
     
        if (inicio == null) {
         temp.Dato1 = (char)(rd.nextInt(26)+'a');   
         temp.Dato2 = (char)(rd.nextInt(25)+'a');   
         temp.Dato3= (char)(rd.nextInt(25)+'a');   
         temp.Dato4 = (char)(rd.nextInt(25)+'a');
           inicio=temp;   
           inicio.Next=null;  
           fin=temp;
          
        } else {  
            
         temp.Dato1 = (char)(rd.nextInt(26)+'a');  
         temp.Dato2 = (char)(rd.nextInt(25)+'a');  
         temp.Dato3= (char)(rd.nextInt(25)+'a');  
         temp.Dato4 = (char)(rd.nextInt(25)+'a');
           fin.Next=temp;
           temp.Next=null;
           fin=temp;   
        }
    }  System.out.println("Los datos se han agregado");
    }
    
    public void Mostrar (){
         Nodo actual  =new Nodo ();
        actual = inicio;
 
        
        if(inicio!= null){
        while(actual!= null){
                System.out.println(" [ "+actual.Dato1+actual.Dato2+actual.Dato3+actual.Dato4+" ] ");
                actual=actual.Next;
                //cont++;
        }
        } else {
            System.out.println ("No hay datos ");
        }
    }
}