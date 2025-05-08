public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double ValorSolicitado = 50.0;

        if(ValorSolicitado < saldo){

            saldo = saldo - ValorSolicitado;
            System.out.println("Saque autorizado no valor de: " + ValorSolicitado);
            System.out.println("Novo saldo: " + saldo);

        }
        else {
        System.out.println("Saldo insuficiente");
        System.out.println("Saldo disponivel: " + saldo);

        }
    }
}