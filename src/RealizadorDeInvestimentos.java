
public class RealizadorDeInvestimentos {
	public void investe(Conta conta, Investimento investimento) {

		conta.deposita(investimento.calcula(conta));
	}
}
