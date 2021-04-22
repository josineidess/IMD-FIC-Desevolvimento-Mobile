import java.util.Scanner;

public class Aula4Atividade1 {
  public static void main(String[] args) {
    atividade1();
    eh_triangulo();
  }

  //atividade 1
  public static void atividade1() {
    System.out.println("-----Atividade 1-----");
    Scanner leitor = new Scanner(System.in);
    System.out.println("N1: ");
    int n1 = leitor.nextInt();
    System.out.println("N2: ");
    int n2 = leitor.nextInt();
    System.out.println("N3: ");
    int n3 = leitor.nextInt();
    System.out.println("N4: ");
    int n4 = leitor.nextInt();
    System.out.println("N5: ");
    int n5 = leitor.nextInt();
    if((n1+n2+n3+n4+n5)% 2 == 0) {
      System.out.println("Multiplo de 2.");
    } else {
      System.out.println("Não é multiplo de 2.");
    }
  }

  //atividade 2
  public static void eh_triangulo(){
    System.out.println("-----Atividade 2-----");
    Scanner leitor = new Scanner(System.in);
    System.out.println("peça 1: ");
    int peca1 = leitor.nextInt();
    System.out.println("peça 2: ");
    int peca2 = leitor.nextInt();
    System.out.println("peça 3: ");
    int peca3 = leitor.nextInt();
    if(peca1 < (peca2 + peca3) && peca2 < (peca1 + peca3) && peca3 < (peca1 + peca2)) {
      System.out.println("É triangulo.");
    }else {
      System.out.println("Não é triangulo.");
    }
  }
}