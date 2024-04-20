import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		Suma suma = new Suma();
		Resta resta = new Resta();
		Multiplicacion multi = new Multiplicacion();
		Division division = new Division();
		EcuacionGeneral ecuacion = new EcuacionGeneral();
		Scanner Scan = new Scanner(System.in);
		int n1, n2, op;
		double a, b, c;

		System.out.println("Bienvenido a la calculadora");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Ecuación Cuadrática");
		op = Scan.nextInt();

		switch(op){
		case 1:
			System.out.println("Ingrese el primer numero.");
			n1 = Scan.nextInt();
			System.out.println("Ingrese el segundo numero.");
			n2 = Scan.nextInt();
			suma.setSuma(n1 , n2);
			
			System.out.println("La suma es: " + suma.getSuma());
			break;
		
		case 2:
			System.out.println("Ingrese el primer numero.");
			n1 = Scan.nextInt();
			System.out.println("Ingrese el segundo numero.");
			n2 = Scan.nextInt();
			resta.setResta(n1 , n2);
			
			System.out.println("La diferencia es: " + resta.getResta());
			break;
		
		case 3:
			System.out.println("Ingrese el primer numero.");
			n1 = Scan.nextInt();
			System.out.println("Ingrese el segundo numero.");
			n2 = Scan.nextInt();
			multi.setMultiplicacion(n1 , n2);
			
			System.out.println("El producto es: " + multi.getMultiplicacion());
			break;
		
		case 4:
			System.out.println("Ingrese el primer numero.");
			n1 = Scan.nextInt();
			System.out.println("Ingrese el segundo numero.");
			n2 = Scan.nextInt();
			division.setDivision(n1 , n2);
			
			System.out.println("El cosiente es: " + division.getDivision());
			break;

		case 5:
			System.out.println("Considerando la forma 'ax²+bx+c' defina: ");
			System.out.println("a = ");
			a = Scan.nextInt();
			System.out.println("b = ");
			b = Scan.nextInt();
			System.out.println("c = ");
			c = Scan.nextInt();
			ecuacion.setEcuacionGeneral(a , b , c);

			System.out.print("El resultado es:"	+ ecuacion.getEcuacionGeneral());
			break;
		
		}
	}

}