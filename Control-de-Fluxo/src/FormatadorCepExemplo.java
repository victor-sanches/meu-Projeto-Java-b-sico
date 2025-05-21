public class FormatadorCepExemplo {
	public static void main(String[] args) {
    	try {

        	String cepFormatado = formatarCep("69085060");
        	System.out.println(cepFormatado);

    	} catch (CepInvalidoException e) {
        	//e.printStackTrace();
         	System.out.println(" Cep informado não encontrado. Verifique novamente, por favor. ");
    	
       }
	} // Fechamento do método main
  
	static String formatarCep(String cep) throws CepInvalidoException {
    	if (cep.length() != 8)
        	throw new CepInvalidoException();
    	// Simulando um cep formatado
    	return "69085-060";
	}
}
