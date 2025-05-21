import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
               tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " " + "NA " + tentativasRealizadas + " TENTATIVA");
        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }
    //método auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;

    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        
        System.out.println("Imprimindoa lista de candidatos informando o indeice do elemento");

        for(int indice=0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de № " + (indice+1) + " é " + candidatos[indice]); 
            
        }

        System.out.println("Forma abreviadade interação for each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos(){ 
      String [] candidatos = {"FELIPE", "EDUARDO","FABIANA","PAULO","AUGUSTO","ROBERTO","MONICA"};

      int candidatosSelecionados = 0;
      int candidatoAtual = 0;
      double salarioBase= 2000.0;
      while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + "solicitou este valor de salario" + salarioPretendido);
        if(salarioBase >= salarioPretendido){
            System.out.println("O candidato" + "foi selecioado para a vaga");
            candidatosSelecionados++;
        }
        candidatoAtual++;
      }
    }
    static double valorPretendido ()  {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido)
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");        
    }
}

}