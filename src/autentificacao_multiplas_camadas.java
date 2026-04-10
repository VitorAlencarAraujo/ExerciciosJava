import java.util.Scanner;

public class autentificacao_multiplas_camadas {
    public static void main(String[] args) {

       /* 4. Sistema de autenticação com múltiplas camadas

        Leia:
        - senha (`int`)
        - nível de acesso (`int`)

        Regras:

        - senha correta (`1234`) e nível ≥ 5 → `"Acesso total"`
        - senha correta e nível < 5 → `"Acesso parcial"`
        - senha incorreta e nível ≥ 5 → `"Acesso suspeito"`
        - caso contrário → `"Acesso negado"`*/

        int senha_correta = 1234;

        Scanner sc = new Scanner(System.in);

        System.out.println("Senha: ");
        int tentativa_senha = sc.nextInt();

        System.out.println("Nivel de acesso: ");
        int nivel_acesso = sc.nextInt();


        String tipo_de_acesso;

        if (tentativa_senha == senha_correta && nivel_acesso >=5){
            tipo_de_acesso = "Acesso total";
        }

        else if (tentativa_senha == senha_correta && nivel_acesso <5) {
            tipo_de_acesso = "Acesso parcial";
        }

        else if (tentativa_senha != senha_correta && nivel_acesso >= 5) {
            tipo_de_acesso = "Acesso suspeito";
        }

        else {
            tipo_de_acesso = "Acesso negado";
        }

        System.out.println(tipo_de_acesso);

    }
}
