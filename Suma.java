public class Suma {
    private int n1;
    private int n2;
    
    
    public Suma(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int calcularSuma() {
        return n1 + n2;
    }

    // Getter y Setter para n1
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    // Getter y Setter para n2
    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}

/*
public class Suma{
	int n1, n2, result;
	 	
	Suma(){}

	public void  setSuma(int n1 , int n2){
		this.n1 = n1;
		this.n2 = n2;

		this.result = this.n1+this.n2;	
	}

	public int getSuma(){
		return  result;
	
	}
	

}


} */