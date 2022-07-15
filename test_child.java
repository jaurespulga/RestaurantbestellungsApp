mport java.util.Scanner;

public class GGT {
	public static void main(String[] args) {
		   Scanner lesen = new Scanner (System.in);
		
		   int a = 2 ;
		   int b = 1 ; 
		   do {
			   System.out.print("Geben Sie eine erste positive Zahl ein : ");
			   a = lesen.nextInt();
			   if (a < 0) {
				   System.out.println("Die Zahl muss positiv sein ");
			   }
		   } while (a < 0);
		   do {
			   System.out.print("Geben Sie eine zweite positive Zahl ein : ");
			   b = lesen.nextInt();
			   if (b < 0) {
				   System.out.println("Die Zahl muss positiv sein ");
			   }
			  
		   } while (b < 0);
		   
		   int c = a;
		   int d = b ;
		   
		   while (c != d) {
			   if (c > d) {
				  c = c - d ;
			   }else {
				    d = d - c ;
				}
			   }
		   System.out.println("Der größe Gemeinsam Teiler zwischen " + a + " und " + b + " ist " + c);
		
