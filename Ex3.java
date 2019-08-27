import java.util.Scanner;


public class Ex3 {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Digite os lados do triangulo:");
		int ladoA=in.nextInt();
		int ladoB=in.nextInt();
		int ladoC=in.nextInt();
		if(ladoA>0 && ladoB>0 && ladoC>0 && ladoA<=(ladoB+ladoC) && ladoB<=(ladoA+ladoC) && ladoC<=(ladoB+ladoA)){
				if(ladoA==ladoB && ladoA==ladoC){
					System.out.println("equilatero");
				}
				else{
					if(ladoA==ladoB||ladoA==ladoC){
						System.out.println("isoceles");
					}
					else{
						if(ladoA!=ladoB && ladoA!=ladoC){
							System.out.println("escaleno");
						}
					}
				}
			}else{
			System.out.println("seus lados nao formam um triangulo!! ");
		}

	}

}
