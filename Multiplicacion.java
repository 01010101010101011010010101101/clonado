public class Multiplicacion{
	int n1, n2, producto;
	//constructor 	
	Multiplicacion(){}

	public void setMultiplicacion(int n1 , int n2){
		this.n1 = n1;
		this.n2 = n2;

		this.producto = this.n1*this.n2;	
	}

	public int getMultiplicacion(){
		return producto;
	
	}
	

}