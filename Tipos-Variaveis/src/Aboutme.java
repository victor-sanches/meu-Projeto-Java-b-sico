public class Aboutme {
    public static void main(String[] args) {

        String primeiroNome = args [0];
        String segundoNome = args [1]; 
        String sobrenome = ar.gs[2];
        int idade = Integer.valueOf(args[3]);
        double altura = Double.valueOf(args[4]);

        /*
         * args[] armazena os argumentos passados no terminal.
         * args[] ocorre porque, em Java (e em muitas outras linguagens de programação), os índices de arrays começam do 0. Ou seja:
         * args[0] é o primeiro argumento passado.
         * args[1] é o segundo argumento.
         * E assim por diante...
         * Integer.valueOf() e Double.valueOf() são usados para converter Strings em números.
         */

        System.out.println("Olá, me chamo: " + primeiroNome + " " + segundoNome + " " + sobrenome);
        /*
         * As aspas (" ") antes e depois do + no Java indicam que você está trabalhando com uma String (texto).
         * Tudo entre aspas é considerado texto literal (exemplo: "Olá, me chamo:", " ").
         * O + serve para concatenar (juntar) uma String com outra String ou String com variáveis.
         */
        System.out.println("Idade: " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        }
}
