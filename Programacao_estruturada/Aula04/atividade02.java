import java.util.Scanner;

public class Aula4Atividade2 {
  public static void main(String[] args){
    eh_par_ou_impar();
    pessoa_mais_velha();
  }

  //atividade 1
  public static void eh_par_ou_impar() {
    System.out.println("-----Atividade 1-----");
    System.out.println("Número: ");
    Scanner leitor = new Scanner(System.in);
    int numero = leitor.nextInt();

    if(numero % 2 == 0){
      System.out.println("É par");
    }else {
      System.out.println("É ímpar");
    }
  }

  //atividade 2
  public static void pessoa_mais_velha() {
    String pessoa1, pessoa2;
    int idade1, idade2;
    System.out.println("-----Atividade 1-----");
    System.out.println("Pessoa 1: ");
    Scanner leitor = new Scanner(System.in);
    pessoa1 = leitor.nextLine();
    System.out.println("Idade 1: ");
    idade1 = leitor.nextInt();
    System.out.println("Pessoa 2: ");
    pessoa2 = leitor.nextLine();
    System.out.println("Idade 2: ");    
    idade2 = leitor.nextInt();
    if(idade1 > idade2) {
      System.out.println(pessoa1);
    }else{
      System.out.println(pessoa2);
    }
  }
}