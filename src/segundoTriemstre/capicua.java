package segundoTriemstre;
import java.util.Scanner;
public class capicua {

	public static void main(String[] args) {
		int num=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero de 5 cifras");
		num=entrada.nextInt();
		
		if ((num>99999)||(num<=10000)) {
			System.out.println("Error vuelve a introducir un numero:");
			num=entrada.nextInt();
		}else {
			System.out.println("hola");
			num=entrada.nextInt();
			
		}
	}

}
