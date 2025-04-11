import java.util.Date; // Importação da classe Date

public class Operadores {
    public static void main(String[] args) throws Exception {

        // Atribuição: Representado pelo símbolo de igualdade (=)

        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e
        // / (divisão).

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        /*
         * Obs.: O operador de adição (+), quando utilizado em variáveis do tipo texto,
         * realizará a concatenação de textos.
         */

        String nome2 = "LINGUAGEM" + "JAVA";
        System.out.println(nome2);

        // Unários

        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        // Para ficar positivo
        numero = numero * -1;
        System.out.println(numero);

        // Inverter uma variável do tipo boolean
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        // Ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado1 = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado1);

        // Operadores relacionais

        int numeroA = 1;
        int numeroB = 2;

        if (numeroA > numeroB)
            System.out.print("Numero 1 maior que numero 2");

        if (numeroA < numeroB)
            System.out.print("Numero 1 menor que numero 2");

        if (numeroA >= numeroB)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numeroA <= numeroB)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numeroA != numeroB)
            System.out.print("Numero 1 é diferente de numero 2");

    }
}
