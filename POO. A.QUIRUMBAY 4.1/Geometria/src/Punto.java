
public class Punto {//creamos la clase
	//atributos
	private double x = 0;//public es constante y private es restringido
	private double y = 0;
	
	public Punto(double x, double y)//contructor
	{
		this.x = x;
		this.y = y;
	}//get permite obtener los datos
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void imprimir()
	{
		System.out.println("Este punto esta en x: " + this.x + " y " + this.y);
	}
}
