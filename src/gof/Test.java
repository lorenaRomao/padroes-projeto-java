
packagepackage one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.TreinoPeito;
import one.digitalinnovation.gof.strategy.TreinoCostas;
import one.digitalinnovation.gof.strategy.TreinoPerna;
import one.digitalinnovation.gof.strategy.Aluno;

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
