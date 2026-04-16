import java.util.Scanner;

public class controle_temperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Leia uma temperatura em graus Celsius e classifique:

        - Abaixo de 0 → `"Muito frio"`
        - De 0 até 15 → `"Frio"`
        - De 16 até 25 → `"Agradável"`
        - Acima de 25 → `"Quente"`

        Regra extra:

        - Se a temperatura for maior que 45 ou menor que -20, mostrar
        `"Temperatura fora da faixa segura"`*/

        System.out.println("Tempera em Celsius: ");
        double celsius = sc.nextDouble();

        String classificacao;

        if (celsius >= -19 && celsius < 0){
            classificacao = "Muito frio";
        }

        else if (celsius >= 0 && celsius <= 15) {
            classificacao = "Frio";
        }

        else if (celsius >= 16 && celsius <= 25) {
            classificacao = "Agradavel";
        }

        else if (celsius >= 26 && celsius <= 45) {
            classificacao = "Quente";
        }

        else {
            classificacao = "Temperatura fora da faixa segura";
        }

        System.out.println(classificacao);

    }
}
