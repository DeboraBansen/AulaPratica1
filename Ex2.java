import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("digite um numero");
		int x=in.nextInt();
		if(x>=0 && x<5){
			System.out.println("f(x) = "+x);
		}
		else{
			if(x>=5 && x<10)System.out.println("f(x) = "+(2*x+1));
		}
		if(x>=10){
			System.out.println("f(x) = "+(x-3));
		}
		

	}

}
