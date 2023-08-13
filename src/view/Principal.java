package view;
import controller.FatorialController;
public class Principal {

	public static void main(String[] args) {
	FatorialController pc = new FatorialController();
	int n = 5;
	int fat = pc.fatorial(n);
	System.out.println("fatorial de " +n+ " = " +fat);
	}
}
