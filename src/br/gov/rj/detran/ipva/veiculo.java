package br.gov.rj.detran.ipva;

public class veiculo {
    protected String modelo, placa, combustivel;
    protected double valorVeiculo;

    public veiculo(String modelo, String placa, String combustivel, double valorVeiculo) {
        this.modelo = modelo;
        this.placa = placa;
        this.combustivel = combustivel;
        this.valorVeiculo = valorVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }
      
    @Override
	public String toString() {
		return "Modelo: "+ modelo +  "\nPlaca: " + placa + "\nCombustivel: " + combustivel + "\nValor do Veiculo: " + valorVeiculo + "\nTx. Licenciamento: " + ipva.settaxaLicenciamento() + "\nValor Ipva: " + ipva.setvalorIpva() + "\n";
	}
/* 
 Professor, a unica maneira que encontrei de colocar a string aqui foi transformar a taxaLicenciamento e o valorIpva em statics. 
 De acordo com o diagrama era isso que foi solicitado, mas acredito que a solução melhor seria colocar a string dentro de IPVA onde
 constam todas as informações. Deixei a forma que considero mais correta comentada na aba classe IPVA.
 */
}
