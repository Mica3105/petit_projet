import java.util.Scanner;  
public class Calculatrice {

	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		int nbre1 = 0, nbre2 = 0;
		
		System.out.println("Entrer le nombre 1:");
		nbre1 = clavier.nextInt();
		
		System.out.println("Entrer le nombre 2:");
		nbre2 = clavier.nextInt();
		
		
		System.out.println("la somme de " + nbre1 + " et " + nbre2 + " est: " + (nbre1+nbre2));
		
		System.out.println("la différence de " + nbre1 + " et " + nbre2 + " est: " + (nbre1-nbre2));

		System.out.println("le produit de " + nbre1 + " et " + nbre2 + " est: " + (nbre1*nbre2));
