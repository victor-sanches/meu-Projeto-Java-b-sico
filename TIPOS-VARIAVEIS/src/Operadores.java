public class Operadores {
    public static void main(String[] args) {
      String nomeUm = "Mariana";
      String nomeDois = new String("Mariana");

      System.out.println(nomeUm.equals(nomeDois));

      int numero1 = 1;
      int numero2 = 2;

      boolean simNao = numero1 == numero2;


      if (numero1 == numero2){
          System.out.println("a nossa condição é verdadeira");
      }
      
      System.out.println("numeroUm é igual a numeroDois? " + simNao);
      
      simNao = numero1 != numero2;

      System.out.println("numeroUm é igual a numeroDois " + simNao);

      simNao = numero1 > numero2;
      System.out.println("numeroUm é maior que o numeroDois " + simNao);

    }
    
}