
package subsistema;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome,String treino, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo de Treino: " + treino);
		System.out.println("CEP: " + cep);
		System.out.println("Cidade: " +cidade);
		System.out.println("Estado: " + estado);
		System.out.println("===================");
	}
}