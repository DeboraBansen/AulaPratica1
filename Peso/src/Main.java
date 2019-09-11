import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int cont=0,a=0;
		AcimaDoPeso p=new AcimaDoPeso();
		
		
		do{
		System.out.println("digite a altura:");
		p.setAltura(in.nextFloat());
		if(p.getAltura()==-1){
			break;
		}
		System.out.println("digite o peso:");
		p.setPeso(in.nextFloat());
		if(p.calculaPesoAcima(p.getPeso(),p.getAltura())){
			cont++;
		}
		}while(p.getAltura()!=-1);
		
		
		System.out.println(""+cont+" pessoas estão acima do peso");
	}
 
}
