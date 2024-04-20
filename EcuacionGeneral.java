public class EcuacionGeneral{
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double exp;
	double disc;
	double raiz;
	String result;

	EcuacionGeneral(){}

	public void setEcuacionGeneral(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	
		this.exp = Math.pow((this.b), 2);
		this.disc = (exp)-(4*(this.a)*(this.c));
		this.raiz = Math.sqrt(disc);
		this.x1 = (((-(this.b)+raiz)/(2*(this.a))));
		this.x2 = (((-(this.b)-raiz)/(2*(this.a))));
		this.result = ("\n	" + x1 + "\n	" + x2);
	}
	
	public String getEcuacionGeneral(){
		return result;
	}
			
}						