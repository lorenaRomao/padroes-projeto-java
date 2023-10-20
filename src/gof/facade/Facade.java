
package gof.facade;

import subsistema.CrmService;
import subsistema2.CepApi;

public class Fpackage

	public void migrarCliente(String nome, String treino, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, treino, cep, cidade, estado);
	}
}
