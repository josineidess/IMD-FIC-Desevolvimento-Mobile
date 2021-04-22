import java.util.*;

public class Aula4Atividade3 {
  public static void main(String[] args){
    comparar_numeros();
    mensagem_para_nota();
  }

  //atividade1
  public static void comparar_numeros() {
    System.out.println("-----Atividade 1-----");
    int n1, n2;
    Scanner leitor = new Scanner(System.in);
    System.out.println("n1: ");
    n1 = leitor.nextInt();
    System.out.println("n2: ");
    n2 = leitor.nextInt();
    if(n1 == n2){
      System.out.println("Iguais");
    }else{
      if(n1 > n2){
        System.out.println("Maior: " + n1);
      }else{
        System.out.println("Maior: " + n2);
      }
    }
  }

  //atividade2
  public static void mensagem_para_nota(){
    System.out.println("-----Atividade 2-----");
    float nota;
    System.out.println("Nota: ");
    Scanner leitor = new Scanner(System.in);
    nota = leitor.nextFloat();
    if(nota >= 0 && nota <= 3){
      System.out.println("Você precisa melhorar muito!");
    }else if(nota >= 3 && nota < 7){
      System.out.println("Você está quase conseguindo!");
    }else if(nota >= 7 && nota < 9){
      System.out.println("Você conseguiu!");
    }else if(nota >= 9){
      System.out.println("Você conseguiu com distinção!");
    }
  }
}