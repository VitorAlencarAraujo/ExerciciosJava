import java.util.Scanner;

public class ClassificacaoNumerica {
    public static void main(String[] args) {

       /* ## 1. Classificação numérica avançada

        Leia um número inteiro e classifique:

        - Par e múltiplo de 10 → `"Classe A"`
        - Par, mas não múltiplo de 10 → `"Classe B"`
        - Ímpar e maior que 50 → `"Classe C"`
        - Caso contrário → `"Classe D"`*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Insire um número inteiro:");

        int num = sc.nextInt();

        String situacao;

        if (num % 10 == 0){
            situacao = "Classe A"; // Par e múltiplo de 10
        }

        else if (num % 2 == 0) {
            situacao = "Classe B"; // Par, mas não múltiplo de 10

        }

        else if (num > 50) {
            situacao = "Classe D"; // Ímpar e maior que 50

        }

        else {
            situacao = "Classe E"; // Caso contrário
        }

        System.out.println(situacao);

    }
}
