package Hierarchy;

public class Horse extends Animal {
	boolean veloz;
	
	public Horse() 
	{
		this.veloz=true;
	}
	
	public void status() {
		System.out.println("O nome do animal é " + this.nome);
		System.out.println("Sua idade é " + this.idade);
		System.out.println("Faz barulho? "+this.som);
		System.out.println("Pode correr? "+this.veloz);
	}

}
