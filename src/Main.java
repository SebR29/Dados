import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //codigo de Dados//

       Random aleatorio = new Random();
      int d1, d2;
      int to1 = 0, to2 = 0;
      int sumad1 = 0, sumad2 = 0;
      do{
          d1 = aleatorio.nextInt(6)+1;
          System.out.println("El dado 1 a dado: " + d1);
          d2 = aleatorio.nextInt(6)+1;
          System.out.println("El dado 2 a dado: " + d2);
          sumad1+=d1;
          sumad2+=d2;

      }while(d1!=d2);
      {
        System.out.println("la suma del dado 1 es: "+sumad1);
        System.out.println("la suma del dado 2 es: "+sumad2);
       if (sumad1>sumad2){
           System.out.println("El dado 1 es el ganado con: "+ sumad1 + "puntos");
       } else if (sumad1<sumad2) {
           System.out.println("El dado 2 es el ganado con: "+ sumad2 + "puntos");
       }
      }

      //Codigo de juego de adivinar un numero//










    }
}