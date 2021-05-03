import java.util.Scanner;

public class AnoBissexto {
   public static void main(String[] args){
       Scanner leitor = new Scanner(System.in);
       int ano = leitor.nextInt();
       System.out.println(ehBissexto(ano) ? ano + " é bissexto" : ano + " não é bissexto");
   }
   
   static boolean ehBissexto(int ano){
       if((ano % 400 == 0 || ano % 4 == 0) && ano % 100 != 0){
           return true;
       }else{
           return false;
       }
   }
}
