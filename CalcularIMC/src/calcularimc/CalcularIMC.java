package calcularimc;
import java.util.Scanner;
public class CalcularIMC {	
	private static double peso;
	private static double altura;
	
	public static void main(String[] args){
		double peso, altura;
		Scanner input = new Scanner(System.in);
		
		if(args.length<2){

			System.out.println("Calculo IMC");
			System.out.println("Informe o peso:");
			peso=input.nextDouble();
			System.out.println("1) Informe a altura (Em decimal Ex 1,70):");
			altura=input.nextDouble();
		}else{
			peso=Double.parseDouble(args[1]);
			altura=Double.parseDouble(args[2]);			
		}
		System.out.println("Seu IMC é: "+Calculo(peso, altura));
	}
	public static double  Calculo(double peso, double altura){
		CalcularIMC.peso=peso;
		CalcularIMC.altura=altura;
		return CalcularIMC.peso/(CalcularIMC.altura*CalcularIMC.altura);
	}

}
