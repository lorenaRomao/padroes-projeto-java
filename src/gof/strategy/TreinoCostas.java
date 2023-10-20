package gof.strategy;

public class TreinoCostas implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Treinando Costas");
		System.out.println("* Barra fixa (chinup) pegada fechada\n* Barra fixa com pegada aberta\n* Remada curvada com barra e pegada pronada\n* Remada curvada com barra e pegada invertida (supinada)\n* Remada unilateral com halter (remada serrote)");
		System.out.println("=====================");
	}

}
