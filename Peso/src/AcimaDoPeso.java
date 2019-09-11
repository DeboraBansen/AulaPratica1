
public class AcimaDoPeso {
	private float peso;
	private float altura;
	
	public AcimaDoPeso(){
		
	}
	
	public void setAltura(float altura){
		this.altura=altura;
	}
	public float getAltura(){
		return altura;
	}
	public void setPeso(float peso){
		this.peso=peso;
	}
	public float getPeso(){
		return peso;
	}
	public boolean calculaPesoAcima(float peso,float altura){
		if((peso/(altura*altura))>25){
			return true;
		}else{
			return false;
		}
	}

}
