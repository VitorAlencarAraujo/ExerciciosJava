import java.util.Scanner;

public class verificacao_idade {
    public static void main(String[] args) {


       /* ## 6. Verificação de faixa etária inteligente

        Leia a idade de uma pessoa e classifique:

        - Menor que 12 → `"Criança"`
        - De 12 até 17 → `"Adolescente"
        - De 18 até 59 → `"Adulto"`
        - 60 ou mais → `"Idoso"`

        Regra extra:

        - Se a idade for negativa, mostrar `"Idade inválida"`*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        String classificacao;
        if (idade > 0 && idade <= 11) {
            classificacao = "Criança";
        }

        else if (idade >= 12 && idade < 17) {
            classificacao = "Adolescente";
        }

        else if (idade >= 18 && idade < 59) {
            classificacao = "Adulto";
        }

        else if (idade >= 60) {
            classificacao = "Idoso";
        }

        else {
            classificacao = "Idade Inválida!";
        }

        System.out.println("Classificação: " + classificacao);
    }
}