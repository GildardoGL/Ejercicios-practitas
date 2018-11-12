import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EjemploArraylist extends persona{

	String nombre;
	int id, Id;

	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();

		String nombre;
		//int afirmacion = 0;
		int opcion = 0;
		int opcion2 = 0;

		for(afirmacion = 1; afirmacion != 0; afirmacion++){

			persona paciente = new persona("nombre");

			afirmacion = 0;
			System.out.println("Ingrese un nombre: ");
			nombre = scan.next();
		
			lista.add(nombre);

			
			System.out.println("Quiere salir e imprimir los nombre ingresados?");
			System.out.println("1.Si");
			System.out.println("2.No");
			afirmacion = scan.nextInt();

			if(afirmacion == 1){
				afirmacion = -1;
			}else if(afirmacion == 2){

			}
		
		}

		
			System.out.println("Los nombres son: "+ lista.toString());
			System.out.println("");
			System.out.println("Desea modificar esta lista?");
			System.out.println("1.Si");
			System.out.println("2.No");
			afirmacion = scan.nextInt();

			while(opcion2 != 4){

				if(afirmacion == 1){

					System.out.println("Cual de las siguientes acciones decea realizar?");
					System.out.println("1.Eliminar");
					System.out.println("2.Carmbiar nombre");
					System.out.println("3.Salir");
					opcion = scan.nextInt();

					if(opcion == 1){
					
						System.out.println("Los nombres son: "+ lista.toString());
						System.out.println("Que nombre decea eleminar ?");
						
						for (String imprimirnombres : lista ) {

							System.out.println(lista);
							
						}
					//nombre para eleminar

					}else if(opcion == 2){

						System.out.println("Los nombres son: "+ lista.toString());
						System.out.println("Que nombre desea modificar?");
						/*for ( : ) {
							
						}                    
						//modificar*/

					}else if(opcion == 3){

						System.out.println("Los nombres que escribio son: "+ lista.toString());
						opcion = 0;
					}


				}else if(afirmacion >= 3 ){

					System.out.println("Esta opcion no es valida");
					opcion2 = 4;

				}else{

				}
	}
	}
}