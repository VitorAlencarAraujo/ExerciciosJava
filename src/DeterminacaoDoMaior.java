import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeterminacaoDoMaior {
    public static void main(String[] args) {

       /* Leia três números inteiros.

        Regras:

        - Se houver empate entre quaisquer dois valores → `"Valores inválidos"`
        - Caso contrário, exibir o maior
        - Se o maior for negativo → `"Maior inválido"`*/

        Scanner sc = new Scanner(System.in);

       /* int → uma caixa pronta 📦
        int[] → um conjunto de caixinhas que precisa ser construído 📦📦📦

        new = "construa isso pra mim"*/


        int[] valores = new int[3];
        for (int i = 0; i < 3; i++){ /*Enquanto essa condição for verdade, ele faz as operações
        do bloco e depois +1 na variavel i → quando i == 3 ele para a repetição e continua
        com o código*/

            System.out.print("Digite um número: ");
            valores[i] = sc.nextInt();
        }
        Set<Integer> conjunto = new HashSet<>();

        for (int v : valores){
            if (!conjunto.add(v)){
                System.out.println("Valores Inválidos");
                return;
            }

        }

    }
}
