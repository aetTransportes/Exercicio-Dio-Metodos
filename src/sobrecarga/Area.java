package sobrecarga;

public class Area {
	
	public static void area(double lado) {
			double area = lado*lado;
			System.out.println("�rea do Quadrado: "+area);
	}

	public static void area(double base, double altura) {
		double area = base*altura/2;
		System.out.println("�rea do Triangulo: "+area);
	}
	public static void area(double baseMaior, double baseMenor, double altura) {
		double area = ((baseMaior+baseMenor)/2)*altura;
		System.out.println("�rea do Trap�zio: "+area);
	}

}
