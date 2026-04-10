import java.util.Scanner;

public class credito_bancario_avancado {
    public static void main(String[] args) {

     /*   ## 5. Sistema de elegibilidade para crédito bancário avançado

        Um banco avalia clientes com base em 4 critérios:

        - renda mensal (`int`)
        - score de crédito (`int` de `0` a `1000`)
        - número de dependentes (`int`)
        - histórico (`int`: `1 = bom`, `0 = ruim`)

        Regras:

        - Cliente é `"Aprovado Premium"` se:
        - renda ≥ 10000
                - score ≥ 800
                - histórico = 1
                - Cliente é `"Aprovado Padrão"` se:
        - renda ≥ 5000
                - score ≥ 600
                - histórico = 1 **ou** dependentes ≤ 2
                - Cliente é `"Risco Moderado"` se:
        - score entre 400 e 599
                - ou renda ≥ 5000 e histórico = 0
                - Cliente é `"Negado"` nos demais casos
                - Se dependentes > 5 e score < 700 → `"Negado por excesso de risco"`*/

        //Declaração de variaveis
        int renda;
        int score;
        int dependentes;
        int historico;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a renda: ");
        renda = sc.nextInt();

        do{ // Faça:
            System.out.println("Score (0 - 1000): ");
            score = sc.nextInt();
        }while /*Enquanto:*/ (score < 0 || score > 1000);

        System.out.println("Dependentes: ");
        dependentes = sc.nextInt();

        do{
            System.out.println("Histórico  0 = ruim | 1 = Bom:");
            historico = sc.nextInt();
        }while (historico < 0 || historico > 1);

        String tipo_cliente;
        if (renda >= 10000 && score >= 800 && historico == 1){
            tipo_cliente = "Aprovado Premium";
        }

        else if (renda >= 5000 && score <= 600 && historico == 1 || dependentes >= 2) {
            tipo_cliente = "Cliente Padrão";
        }
        


    }
}
