public class ExemploForArray {
    public static void main(String[] args) {
        
        //em arrays o indice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MAERCOS"};

        for (String aluno : alunos){   // ou (int x=0; x < alunos.length; x++) {
           // System.out.println("O aluno no indice x =" + x + " é " + alunos [x]);
           System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}
