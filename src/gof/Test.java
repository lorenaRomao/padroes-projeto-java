
package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.Comportamento;
import gof.strategy.TreinoPeito;
import gof.strategy.TreinoCostas;
import gof.strategy.TreinoPerna;
import gof.strategy.Aluno;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento TreinoCostas = new TreinoCostas();
		Comportamento TreinoPerna = new TreinoPerna();
		Comportamento TreinoPeito = new TreinoPeito();
		
		Aluno aluno = new Aluno();
		aluno.setComportamento(TreinoPerna);
		aluno.mover();
		aluno.mover();
		aluno.setComportamento(TreinoCostas);
		aluno.mover();
		aluno.setComportamento(TreinoPeito);
		aluno.mover();
		aluno.mover();
		aluno.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton","Musculação", "14801788");
		facade.migrarCliente("Diego","Corrida", "14801788");
		facade.migrarCliente("Andre","Atletismo", "14801788");
		facade.migrarCliente("Luide","Musculação/Funcional", "14801788");
		facade.migrarCliente("Daniel","Funcional", "14801788");
		facade.migrarCliente("Lucas","Futebol", "14801788");
	}

}
