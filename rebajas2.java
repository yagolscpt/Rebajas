package cap_Dos;



	
		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class rebajas2 {

			public static double descubrePorcentaje(double original, double actual){
				return(original-actual)*100/original;
			}
			//escribir el metodo descubrirOriginal al que se le pasara el precio actual y el descuento en porcentaje
			//y devolver el precio original
			public static double descubreOriginal(double actual, double porcentaje){
				return actual/(1-(porcentaje/100));
			}
			
			public static double descubreActual(double original, double porcentaje){
				return (original-(porcentaje/100)*original);
			}
			
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				double original=0d, actual=0d, porcentaje=0d, resultado=0d;
				int op=23;
				int exit=0;
				
				while(exit==0){
				
					System.out.println("Introduzca 1 para saber el porcentaje");
					System.out.println("Introduzca 2 para saber el precio original");
					System.out.println("Introduzca 3 para saber el precio actual");
					System.out.println("Introduzca 0 para salir");
					op=sc.nextInt();
					
					switch(op){
						 
						case 1:
							System.out.println("Por favor introduzca el precio original: ");
							original=sc.nextDouble();
							
							System.out.println("Por favor introduzca el precio actual: ");
							actual=sc.nextDouble();
							
							resultado=descubrePorcentaje(original, actual);
							
							System.out.println("El porcentaje descontado es: "+resultado+"%");
							System.out.println();
							System.out.println("///////////////////////////////////////");
							System.out.println();
						break;
						
						case 2:
							System.out.println("Por favor introduzca el precio actual: ");
							actual=sc.nextDouble();
							
							System.out.println("Por favor introduzca el porcentaje: ");
							porcentaje=sc.nextDouble();
							
							resultado=descubreOriginal(actual, porcentaje);
							
							System.out.println("El precio original es: "+resultado);
							System.out.println();
							System.out.println("///////////////////////////////////////");
							System.out.println();
						break;
						
						case 3:
							System.out.println("Por favor introduzca el precio original: ");
							original=sc.nextDouble();
							
							System.out.println("Por favor introduzca el porcentaje: ");
							porcentaje=sc.nextDouble();
							
							resultado=descubreActual(original, porcentaje);
							
							System.out.println("El precio actual es: "+resultado);
							System.out.println();
							System.out.println("///////////////////////////////////////");
							System.out.println();
						break;
						
						case 0:
							exit=1;
							System.out.println("Fin del programa");
						break;
						
						default:
							System.out.println("Por favor introduzca un valor correcto");
							System.out.println();
					}	
				}
				sc.close();
			}
		}
	


