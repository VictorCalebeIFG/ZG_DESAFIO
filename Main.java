import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){

		System.out.println("Quantos pitinhos a mamãe patinho tinha ?");

		Scanner scanner = new Scanner(System.in);

		int patinhos = scanner.nextInt();

		FuncTools tools = new FuncTools();

		tools.cantar_ref(patinhos);

		scanner.close();

	}
}