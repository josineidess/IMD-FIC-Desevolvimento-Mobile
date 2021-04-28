public class Atividade01{
  public static void main(String[] args){
    programa_for_asterisco();
  }
  public static void programa_for_asterisco(){
    String texto = "*";
		for (int i = 10; i < 10; i++) {
			System.out.println(texto);
		texto = texto + "*";
		}
  }
}