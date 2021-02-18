  import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception { 
    Scanner scanner = new Scanner(System.in);
    boolean d =(false);
    int proba = 1;
    int random = (int)(Math.random() * 101);
    

    while(proba < 6){
      System.out.println("Podaj liczbe");
    int a = scanner.nextInt();
    if(a > random){
      System.out.println("podałes za wysoka liczbe");
    }else if(a < random){
      System.out.println("Podałes za niska liczbe");
    }else if(a == random){
        System.out.println("Brawo");
        d =true;
        break;
      
      

        
      }
      proba++;
      

    } 
    if(d){
      System.out.println("Brawo wygrałes");
    }else{
      System.out.println("Niestety przegrałes/as");
      System.out.println("Liczba ktora mialem na mysli to "+(random));
    }

   
  
  }
}