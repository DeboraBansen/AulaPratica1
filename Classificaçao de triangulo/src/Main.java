import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner in=new Scanner(System.in);
    	int[] v=new int[3];
    	for(int i=0;i<3;i++){
    		System.out.println("Digite o lado "+(i+1)+" do triangulo:");
    		v[i]=in.nextInt();
    	}
    	ClassificaTriangulo n=new ClassificaTriangulo();
    	if(n.verificaSeTriangulo(v)){
    		n.classificaTriangulo(v);
    	}else{
    		System.out.println("ERRO! Lados não formam triângulo");
    	}
}                                    
}
