public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /*
         * foi adicionado o recurso cast, convertendo o que era um tipo inteiro para
         * short, porque é o tipo correspondente.
         */

        /* Outro exemplo */

        int numero = 10;
        numero = 5;
        System.out.print(numero);
    }
}
