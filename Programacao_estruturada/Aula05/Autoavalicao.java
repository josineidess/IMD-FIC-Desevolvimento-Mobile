import java.util.Scanner;

public class Autoavalicao{
  public static void main(String[] args){
   nums_impares();
   intervalo();
   gerar_saida();
  }

  public static void nums_impares(){
    int cont = 0,atual;
    Scanner num = new Scanner(System.in);
    while(cont < 10){
      atual = num.nextInt();
      if(atual % 2 != 0){
        System.out.println(atual);
      }
      cont ++;
    }
  }
  
  public static void intervalo(){
    Scanner num = new Scanner(System.in);
    System.out.println("Digite um numero, entre 1 e 4");
    float n = num.nextFloat();
    if(n > 1 && n < 4){
      System.out.println(n);
    }else{
      System.out.println("Número inválido");
    }
  }

  public static void gerar_saida(){
    for(int e = 0;e <= 14;e+=2){
      System.out.print(e != 14 ? e + ", " : e); 
    }
  }
}