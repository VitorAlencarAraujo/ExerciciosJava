import java.util.Scanner;

public class classificacao_senha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* Leia uma senha numérica.

        Regras:

        - Se for igual a `2026` → `"Senha mestra"`
        - Se for maior que `999` e diferente de `2026` → `"Senha comum"`
        - Se for menor que `1000` → `"Senha fraca"`*/

        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();

        String situacao;
        if (senha >= 999 && senha != 2026){
            situacao = "Senha Comum";
        }

        else if (senha == 2026) {
            situacao = "Senha Mestra";
        }

        else {
            situacao = "Senha Fraca";
        }

        System.out.println(situacao);
    }
}
