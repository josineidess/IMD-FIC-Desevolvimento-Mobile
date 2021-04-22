import java.util.Scanner;

public class Aula4Atividade4 {
  public static void main(String[] args){
    char letra;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Letra: ");
    letra = leitor.nextLine().charAt(0);
    switch(letra){
      case 'a':
        System.out.println("Alemanha");
        break;
      case 'b':
        System.out.println("Belgica");
        break;
      case 'c':
        System.out.println("Cuba");
        break;
      case 'd':
        System.out.println("Dinamarca");
        break;
      case 'e':
        System.out.println("Espanha");
        break;
      case 'f':
        System.out.println("França");
        break;
      case 'g':
        System.out.println("Grécia");
        break;
      case 'h':
        System.out.println("Honduras");
        break;
      case 'i':
        System.out.println("Índia");
        break;
      case 'j':
        System.out.println("Jamaica");
        break;
      case 'l':
        System.out.println("Lituânea");
        break;
      case 'm':
        System.out.println("Madagascar");
        break;
      case 'n':
        System.out.println("Noruega");
        break;
      case 'o':
        System.out.println("Omã");
        break;
      case 'p':
        System.out.println("Portugal");
        break;
      case 'q':
        System.out.println("Quénia");
        break;
      case 'r':
        System.out.println("Rússia");
        break;
      case 's':
        System.out.println("Síria");
        break;
      case 't':
        System.out.println("Tailandia");
        break;
      case 'u':
        System.out.println("Uruguai");
        break;
      case 'v':
        System.out.println("Venezuela");
        break;
      case 'z':
        System.out.println("Zâmbia");
        break;
      default:
        System.out.println("Esse país não existe.");
    }
  }
}