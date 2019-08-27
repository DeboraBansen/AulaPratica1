import java.util.Scanner;

public class Ex6 {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int i=0;
            System.out.println("digite o valor do saque");
            int nota=in.nextInt();
            while(nota<10){
                System.out.println("informe um valor maior que 10");
                nota=in.nextInt();
            }
            while(nota>600){
                System.out.println("informe um valor menor que 600");
                nota=in.nextInt();
            }
            int n50=nota/50;
            int n20=(nota%50)/20;
            int n10=((nota%50)%20)/10;
            int n5=(((nota%50)%20)%10)/5;
            int n1=((((nota%50)%20)%10)%5)/1;
            if(n50>0) {
                System.out.println("" + n50 + " notas de 50");
            }
            if(n20>0) {
                System.out.println("" + n20 + " notas de 20");
            }
            if(n10>0) {
                System.out.println("" + n10 + " notas de 10");
            }
            if(n5>0) {
                System.out.println("" + n5 + " notas de 5");
            }
            if(n1>0) {
                System.out.println("" + n1 + " notas de 1");
            }
           
        }

    }
