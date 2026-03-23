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

        /*Set<Integer> → Estrutura que não aceita valores repetidos*/
        Set<Integer> conjunto = new HashSet<>();

        /*Para cada valor dentro de valores, coloque esse valor na variável v*/
        for (int v : valores){
            if (!conjunto.add(v)){ /*conjunto recebe valores um de cada vez e verifica se
            há repetição → Valores NÃO repetidos retornam TRUE e não entram no if
                           Valores REPETIDOS retornam FALSE e não entram no   if

            "    !    "  antes de conjunto.add significa negação e invente a lógica

            Agora valores REPETIDOS retornam TRUE, o codigo executa o if que é:  */
                System.out.println("Valores Inválidos");
                return; /* → Para o programa*/
            }
        }
        int maior = valores[0]; /*Declaração e de uma variavel que recebe o primeiro valor
        do ARRAY "valores" */

        for (int v : valores){ /* "v" recebe um valor de valor de "valores a cada repetição*/

            if (v > maior){ /*Se o valor lido em valores naquele momento for maior que o
            primeiro valor da lista do ARRAY então a variavel "maior" recebe esse valor*/

                maior = v;
            }
        }
        if (maior < 0){
            System.out.println("Maior Inválido");
        }
        else {
            System.out.println("Maior: " + maior);
        }
    }
}
