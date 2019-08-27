import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("digite um numero:");
		int fatorial=in.nextInt();
		for(int i=fatorial-1;i>=1;i--){
			fatorial*=i;	
		}
		System.out.println("fatorial = "+fatorial);
	}

}
