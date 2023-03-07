package numeros1aNV2;

import java.util.Scanner;

public class Numeros1aNV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numero;
        Scanner entrada = new Scanner(System.in);
		System.out.println("Indica un número: ");
		numero=entrada.nextInt();
		int i=0;
		while(i<numero) {
			i++;	
			System.out.println(i);
		}
		
		entrada.close();	
	}

}
