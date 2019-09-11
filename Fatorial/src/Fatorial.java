
public class Fatorial {
	private int x;
	
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public int fatorial(int x){
		for(int i=(x-1);i>0;i--){
			x=x*i;
		}
		return x;
	}

}
