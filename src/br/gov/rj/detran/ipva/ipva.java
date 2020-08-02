package br.gov.rj.detran.ipva;

public class ipva extends veiculo{
    private static double valorIpva;
    private static double taxaLicenciamento;

    public ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
        super(modelo, placa, combustivel, valorVeiculo);
        this.taxaLicenciamento = taxaLicenciamento;
    }

    public double getValorIpva() {
        return valorIpva;
    }
    
    public static double settaxaLicenciamento() {
    	return taxaLicenciamento;
    }
    
    public static double setvalorIpva() {
    	return valorIpva;
    }
    
    public void calculaIpva() {	    
    	if (combustivel.equalsIgnoreCase("GNV")){
        	valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;        	
        }else if(combustivel.equalsIgnoreCase("FLEX")) {
        	valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
        }else if(combustivel.equalsIgnoreCase("GASOLINA")){
        	valorIpva = (valorVeiculo * 0.04) + taxaLicenciamento;
        }else {
        	System.out.println("Combustivel Inválido"); 
        }
    }

    /*@Override
	public String toString() {
		return "Modelo: "+ modelo +  "\nPlaca: " + placa + "\nCombustivel: " + combustivel + "\nValor do Veiculo: " + valorVeiculo + "\nTx. Licenciamento: " + taxaLicenciamento + "\nValor Ipva: " + valorIpva + "\n";
	}*/   
	
}
