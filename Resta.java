public class Resta{
	int n1, n2, diferencia;
	//constructor 	
	Resta(){}

	public void  setResta(int n1 , int n2){
		this.n1 = n1;
		this.n2 = n2;

		this.diferencia = this.n1-this.n2;	
	}

	public int getResta(){
		return  diferencia;
	
	}
	

}