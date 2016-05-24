/**
 * Esta clase crea un circulo a traves de un punto
 * @author Paul
 */
public class Circulo {
	//atributos/propiedades
		private double radio = 1;
		public static final double pi = 3.1415926535;//static para acceder afura de la clase
		private Punto p;
		
		//constructor
		public Circulo(Punto centro, double r)
		{
			p = centro;
			radio = r;
		}
		/**
		 * este metodo calcula el area del circulo
		 * @return Double Area
		 */
		public double calcularArea()
		{
			/*return pi * radio * radio;*/
			return pi * Math.pow(radio, 2);
		}
		/**
		 * Este metodo calcula el perimetro
		 * @return Double perimetro
		 */
		public double calcularCircunferencia()
		{
			return 2 * pi * radio;
		}
		public void imprimirCirculo()
		{
			String salida ="El circulo tiene radio" + this.radio +
					"centrado en " + p.getX() + "," + p.getY();
			salida = ("El area del circulo es:" + calcularArea()
					 + "   su circunferencia es:"+ calcularCircunferencia() );
			
			System.out.println(salida);
			
		}
	}
}
