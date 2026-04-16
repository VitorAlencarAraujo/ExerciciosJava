import java.util.Scanner;

public class verificacao_votacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*## 8. Verificação de votação

        Leia a idade de uma pessoa.

        Regras:

        - Menor de 16 → `"Não vota"`
        - De 16 a 17 → `"Voto opcional"`
        - De 18 a 69 → `"Voto obrigatório"`
        - 70 ou mais → `"Voto opcional"`*/

        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        String situacao;
        if (idade >= 0 && idade <= 15){
            situacao = "Não vota";
        }

        else if (idade >= 16 && idade <= 17 || idade >= 70) {
            situacao = "Voto opcional";
        }

        else if (idade >= 18 && idade <= 69) {
            situacao = "Voto obrigatório";
        }

        else {
            situacao = "Idade Inválida";
        }

        System.out.println(situacao);
    }
}
