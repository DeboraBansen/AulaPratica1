import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Fatorial x=new Fatorial();
		
		System.out.println("Digite o numero:");
		x.setX(in.nextInt());
		System.out.println("o fatorial do numero é "+(x.fatorial(x.getX())));

	}

}
