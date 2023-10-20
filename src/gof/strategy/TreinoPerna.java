package one.digitalinnovation.gof.strategy;

public class TreinoPerna implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Treinando Perna");
		System.out.println("* Agachamento\n* Stiff\n* Elevação do quadril\n* Afundo\n* Elevação de gêmeos\n* Cadeira adutora e abdutora");
		System.out.println("=====================");
	}

}
