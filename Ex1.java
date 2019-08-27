import java.util.Scanner;


public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("digite um numero inteiro");
		int x=in.nextInt();
		System.out.println("os multiplos do numero sao:");
		for(int i=0;i<=10;i++){
			System.out.println(""+x+"x"+i+"="+x*i);
		}
	}

}
