import java.util.Scanner;

public class SistemaAvaliacao {
    public static void main(String[] args) {

      /*  Leia:

        - Nota (`0` a `10`)
                - Frequência (`%`)

        Regras:

        - Nota ≥ 7 e frequência ≥ 75 → `"Aprovado"`
        - Nota ≥ 5 ou frequência ≥ 75 → `"Recuperação"`
        - Nota < 5 e frequência < 75 → `"Reprovado"`
        - Caso especial: se nota = 10 → `"Aprovado com excelência"`*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota:");
        float nota = sc.nextFloat();

        System.out.print("Informe a frequência:");
        int frequencia = sc.nextInt();

        String situacao;

        if (nota == 10){
            situacao = "Aprovado com excelência";
        }

        else if (nota >= 7 && frequencia >= 75){
            situacao = "Aprovado";
        }

        else if (nota >=5 || frequencia >= 75) {
            situacao = "Recuperação";

        } else /* Nota < 5 e frequência < 75 */ {
            situacao = "Reprovado";
        }

        System.out.println(situacao);

    }
}
