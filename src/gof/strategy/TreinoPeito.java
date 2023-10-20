package gof.strategy;

public class TreinoPeito implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Treinando Peito");
		System.out.println("* Supino inclinado com halteres\n* Supino reto com barra\n* Afundos nas barras paralelas\n* Flexões\n* Crossover com pega alta");
		System.out.println("=====================");
	}

}
