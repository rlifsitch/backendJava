package br.gov.rj.detran.ipvateste;

import br.gov.rj.detran.ipva.*;

public class testeipva {
	public static void main(String[] args) {
		ipva veiculo1 = new ipva("CIvic", "KGB-5687", "gasolina", 60000, 500);
		veiculo1.calculaIpva();
		System.out.println(veiculo1);
		
		ipva veiculo2 = new ipva("Uno", "MIT-5007", "flex", 40000, 120);		
		veiculo2.calculaIpva();
		System.out.println(veiculo2);
		
		ipva veiculo3 = new ipva("Sandero", "LPT-5268","gnv", 50000, 125);
		veiculo3.calculaIpva();
		System.out.println(veiculo3);
	}

}
