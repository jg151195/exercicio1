package exercicio1;

import java.util.Locale;
import java.util.Scanner;

import entitties.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", ret.Area(),ret.Perimeter(),ret.Diagonal());
		
	}

} 
