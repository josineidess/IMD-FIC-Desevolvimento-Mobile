

public class Main {
	public static void main(String[] args) {
	int x = 10;
	double y = 10.2;
  //Atividade 01
	System.out.println("Esta mensagem será impressa na tela!");
	System.out.println("O valor da variável x é " + x);
	System.out.println("Os valores de x e y são " + x + " e " + y);
	System.out.println("Linha 1\nLinha 2");
 
  imprimir_nome("Josi");
  
  calcular_retangulo(20,30);
	}
  
   //Atividade 02
  public static void imprimir_nome(String nome) {
    System.out.println("Meu nome é " + nome);
  }
  
  //Atividade 03
  public static void calcular_retangulo(int l1, int l2){
    System.out.println("A area do retangulo é " + (l1 * l2));
  }
}


