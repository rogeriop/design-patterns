
public class CalculadorDeImpostosTest {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(50);
		
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();
		
		new CalculadorDeImpostos().calcula(orcamento, iss);
		new CalculadorDeImpostos().calcula(orcamento, icms);
		new CalculadorDeImpostos().calcula(orcamento, iccc);
		
	}
}
