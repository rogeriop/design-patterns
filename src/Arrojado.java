import java.util.Random;

public class Arrojado implements Investimento {
	private Random random;

	public Arrojado() {
		this.random = new Random();
	}

	@Override
	public double calcula(Conta conta) {
		int escolhido = random.nextInt(10);
		if (escolhido >= 0 && escolhido <= 1) {
			return conta.getSaldo() * 0.05;
		} else if (escolhido >= 2 && escolhido <= 4) {
			return conta.getSaldo() * 0.03;
		} else
			return conta.getSaldo() * 0.06;
	}

}
