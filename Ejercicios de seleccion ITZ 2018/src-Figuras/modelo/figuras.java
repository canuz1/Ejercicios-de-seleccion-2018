package modelo;


public abstract class figuras {
	protected double area;
	protected double perimetro;

	public figuras(double area1, double perimetro1) {	
		super();
		this.area=area1;
		this.perimetro=perimetro1;
	}		
	
	
	public double getArea() {
		return area;
	}
	
	
	public double setArea(double area) {
		return this.area=area;
		
	}
	
	
	public double getPerimetro() {
		return perimetro;
	}
	
	
	public double setPerimetro(double perimetro) {
		return this.perimetro=perimetro;
		
		
	}

	
	public abstract double calcular_Area();
	
	public abstract double calcular_Perimetro();
	
		
	}