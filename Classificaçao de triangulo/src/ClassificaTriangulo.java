
public class ClassificaTriangulo {
	
	public boolean verificaSeTriangulo(int[] v){
		if(v[0]>0&&v[1]>0&&v[2]>0){
			if(v[0]>(v[1]+v[2])||v[1]>(v[0]+v[2])||v[2]>(v[1]+v[0])){
				return false;
			}else{
			return true;
			}
		}else{
		return false;
		}
	}
	
    public void classificaTriangulo(int[] v){
    	  if(v[0]==v[1]&&v[0]==v[2]){
    		  System.out.println("É um triângulo equilátero");
    	  }
    	  if(v[0]==v[1]&&v[0]!=v[2]||v[0]==v[2]&&v[0]!=v[1]||v[1]==v[2]&&v[1]!=v[0]){
    		  System.out.println("É um triângulo isósceles");
    	  }
    	  if(v[0]!=v[1]&&v[0]!=v[2]&&v[1]!=v[2]){
    		  System.out.println("É um triângulo escaleno");
    	  }
    }
}
