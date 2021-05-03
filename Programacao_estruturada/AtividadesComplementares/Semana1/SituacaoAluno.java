import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Media: ");
        float media = leitor.nextFloat();
        System.out.println(situacao(media));
    }
    
    static String situacao(float media){
        if(media >= 7){
            return "Aprovado";
        }else if(media < 7 && media >= 3){
            return "Recuperação";
        }else{
            return "Reprovado";
        }
    }
}

