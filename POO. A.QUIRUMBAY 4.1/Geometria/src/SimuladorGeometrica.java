
public class SimularGeometrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p= new Punto(5,8);
	
		 
		 Circulo c =new Circulo(p, 5);
		 double area=c.calcularArea();
		 double perimetro=c.calcularCircunferencia();
		 
		 System.out.println("El area del circulo es:" + area
		 + "   su circunferencia es:"+ perimetro );
		  p.imprimir();
		  c.imprimirCirculo();
	}
	
}