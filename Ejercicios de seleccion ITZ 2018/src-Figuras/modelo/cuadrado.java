package modelo;

public class cuadrado extends figuras{
	
	private double cuadrado;
	
	public cuadrado(double cuadrado, double area) {
		
		super(0.0, 0.0);
		this.cuadrado=cuadrado;

	}

	public double getCuadrado() {
		return cuadrado;
	}
	public void setCuadrado(double cuadrado) {
		this.cuadrado = cuadrado;
	}
	
	
	@Override
	public double calcular_Area() {
		// TODO Auto-generated method stub
		setArea(getCuadrado()*getCuadrado());
		
		return getArea();
	}
	@Override
	public double calcular_Perimetro() {
		// TODO Auto-generated method stub
		setPerimetro(getCuadrado()*4);
		return getPerimetro();
	}

}
