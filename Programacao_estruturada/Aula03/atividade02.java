import java.util.Scanner;

public class ProgramaLeitorTeclado2 {
	public static void main(String[] args) {
    //Atividade 1
    System.out.println("-----Atividade 1-----");
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String nome = leitor.nextLine();
		System.out.println("Olá, " + nome + ", digite agora sua idade:");
		int idade = leitor.nextInt();
		System.out.println(idade + " anos, muito bem!");
		System.out.println("Digite agora sua altura:");
		double altura = leitor.nextDouble();
		System.out.println("Ok, entendi, você tem " + altura + "m de altura.");
	  imprimir_frases();
    imprimir_info_aluno();
  }

  //atividade 2
  public static void imprimir_frases() {
     Scanner leitor = new Scanner(System.in);
     System.out.println("-----Atividade 2-----");
     System.out.println("Frase1: ");
     String frase1 = leitor.nextLine();
     System.out.println("Frase2: ");
     String frase2 = leitor.nextLine();
     System.out.println("Frase3: ");
     String frase3 = leitor.nextLine();
     System.out.println(frase3);
     System.out.println(frase2);
     System.out.println(frase1);
  }

  //atividade 3
  public static void imprimir_info_aluno() {
    Scanner leitor = new Scanner(System.in);
    System.out.println("-----Atividade 3-----");
    System.out.println("Nome do aluno: ");
    String nome = leitor.nextLine();
    System.out.println("Nome da disciplina: ");
    String disciplina = leitor.nextLine();
    System.out.println("Nota1: ");
    float nota1 = leitor.nextFloat();
    System.out.println("Nota2: ");
    float nota2 = leitor.nextFloat();
    System.out.println("Nota3: ");
    float nota3 = leitor.nextFloat();
    System.out.println("Nota4: ");
    float nota4 = leitor.nextFloat();
    float media = (nota1+nota2+nota3+nota4)/4;
    System.out.println("Aluno: " + nome + "\n" + "Disciplina: " + disciplina + "\n" + "Média: " + media);
  }
}

