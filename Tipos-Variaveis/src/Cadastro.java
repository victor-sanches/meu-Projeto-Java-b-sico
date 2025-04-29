import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /*
         * Scanner	É uma classe do Java usada para ler entradas do teclado, arquivos, etc.
         * scanner	É o nome da variável que você está criando para usar o Scanner.
         * new Scanner(System.in)	Cria um novo objeto Scanner, que vai ler o que o usuário digitar no teclado (System.in).
         * .useLocale(Locale.US)	Define o padrão de formatação para números, datas etc., usando o formato dos EUA (por exemplo: usar . para separação decimal em vez de ,).
         * Sobre Locale.US: Em países como o Brasil, o separador de decimal é vírgula , (ex: 1,75).
         * Nos EUA, é ponto . (ex: 1.75).
         * Usar Locale.US garante que o Scanner interprete números decimais corretamente se você digitar usando ponto.
         */

         System.out.println("Digite o seu nome completo");
         String nomeCompleto = scanner.nextLine();
         //A finalidade do System.out.println em Java é exibir informações no terminal (ou console) para o usuário.
         //Captura espaços: ideal para ler nomes completos, frases, endereços etc.
         //Lê até o ENTER: não para na primeira “palavra” (ao contrário de next()).
         
         System.out.println("Qual é sua idade");
         int idade = scanner.nextInt();
         scanner.nextLine(); // consome o "\n" pendente
         //scanner.nextInt() lê do teclado um número inteiro digitado pelo usuário.
         //Esse valor é então armazenado na variável "idade".
         //Se essas chamadas vierem logo após um nextInt() ou nextDouble(), você precisa primeiro consumir o ENTER que ficou no buffer.
         
         System.out.println("Informe a sua cidade");
         String cidade = scanner.nextLine();

         System.out.println("Qual seria o curso que deseja cursar");
         String curso = scanner.nextLine();

         System.out.println("Para comprovar que você não é um robô responda qual é a metade de 5 sem usar vírgula");
         double testeSegurança = scanner.nextDouble();
         //scanner.nextDouble() lê do teclado um número decimal (com ponto, exemplo: 1.75).
         //Esse número é armazenado na variável testeSegurança do tipo "double".

         System.out.println("Ola, me chamo " + nomeCompleto);
         System.out.println("Sou natural de " + cidade);
         System.out.println("Tenho " + idade + " anos" );
         System.out.println("Meu curso de interesse é " + curso);
         System.out.println("Resultado: " + testeSegurança);
    }
}