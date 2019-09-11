import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		CaixaEletronico v=new CaixaEletronico();
		
		System.out.println("Digite o valor do saque:");
		v.setValor(in.nextFloat());
		v.contaNotas(v.getValor());

	}

}
