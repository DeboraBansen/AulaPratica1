
public class CaixaEletronico {
	/*Construa um programa em Java que simule um caixa eletrônico. O programa deverá perguntar ao 
	 * usuário o valor do saque e como resultado informar quantas notas de cada valor serão fornecidas.
	 *  As notas disponíveis são as de 1, 5, 10, 20 e 50 reais. O valor mínimo de saque em um dia é de 
	 *  10 reais e o máximo de 600 reais. O algoritmo não deve considerar se há ou não quantidade suficiente
	 *   de notas na máquina. Além disso, o programa deve informar o menor número de notas possível para 
	 *   cada saque. Segue abaixo os exemplos:

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece cinco notas de 50, uma nota de 5 reais 
e uma nota de 1 real.

Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece sete notas de 50, duas notas de 20, uma 
nota de 5 reais e quatro notas de 1 real.*/
	private float valor;
	
	public void setValor(float valor){
		this.valor=valor;
	}
	public float getValor(){
		return valor;
	}
	public void contaNotas(float valor){
		float n=0;
		if(valor>=10&&valor<=600){
			n=valor/50;
			valor=valor%50;
			if((int)n!=0)System.out.println(""+(int)n+" notas de 50 reais");
			n=valor/20;
			valor=valor%20;
			if((int)n!=0)System.out.println(""+(int)n+" notas de 20 reais");
			n=valor/10;
			valor=valor%10;
			if((int)n!=0)System.out.println(""+(int)n+" notas de 10 reais");
			n=valor/5;
			valor=valor%5;
			if((int)n!=0)System.out.println(""+(int)n+" notas de 5 reais");
			n=valor/1;
			valor=valor%1;
			if((int)n!=0)System.out.println(""+(int)n+" notas de 1 real");
			
		}
	}


}
