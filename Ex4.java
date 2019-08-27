import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float altura=0F;
		float peso;
		int cont=0;
	    do{
		System.out.println(" Digite  uma altura e peso ");
	    altura=in.nextFloat();
	    if(altura==-1){
	    	System.out.println(""+cont+" pessoas estao acima do peso");
	    	System.exit(0);
	    }else{
		peso=in.nextFloat();
		if((peso /(altura*altura)) > 25 ){
			cont++;
		}
	    }
	    }while(altura!=-1);
		
		System.out.println(""+cont+" pessoas estao acima do peso");

	}

}
