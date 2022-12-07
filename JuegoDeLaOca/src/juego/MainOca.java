package juego;

import java.util.Scanner;

public class MainOca {

	public static void main(String[] args) {
		
		String pausa;
		int suma;
		int suma2;
		int tirada1;
		int tirada2;
		String nomj1;
		String nomj2;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		//Creamos el objeto dados de donde sacaremos la funcion tiraDados
		
		FuncionesOca dados = new FuncionesOca();
		FuncionesOca carrera = new FuncionesOca(); 
		FuncionesOca ganador = new FuncionesOca();
		
		//mensaje del nombre del juego
		System.out.println("¡El juego de la oca!");
		//solicitud del minimo del daod
		System.out.print("Por favor introduzca el numero minimo del dado: ");
		
		FuncionesOca.minDado = lee.nextInt();
		//solicitud del maximo del dado
		System.out.print("Por favor introduzca el numero maximo del dado: ");
		
		FuncionesOca.maxDado = lee.nextInt();
		//solicitud de los nombres de los jugadores
		System.out.println("Jugador 1 introduzca su nombre: ");
		nomj1 = lee.next();
		
		System.out.println("Jugador 2 introduzca su nombre : ");
		nomj2 = lee.next();
		
		//mientras los nombres sean iguales se solicita un nombre nuevo
		while (nomj1 .equals(nomj2)) {
			System.err.println("Por favor introduzca un nombre distinto al jugador 1");
		
			nomj2 = lee.next();
				
			}
		
		//mensaje del inicio del juego
		System.out.println("Comienza el juego.");
		
		//se utiliza la funcion que pinta la pista
		FuncionesOca.pintaPista();
		
		System.out.println("");
		
		System.out.println("Por favor introduzca un caracter para continuar.");
		pausa = lee.next();	
		
		//En este While mientras la cadena de la funcion es ganador este vacia se continua con la ejecucion
		while(ganador.esGanador(nomj1, nomj2) == "") {
			
	//TURNO DEL JUGADOR 1
	System.out.println("Es el turno de " + nomj1);
	tirada1 = dados.tiraDados();
	tirada2 = dados.tiraDados();
	
	System.out.println(FuncionesOca.sumaDeNumerosEsPrimo(tirada1, tirada2));//aqui se verifica que la suma de las dos tiradas sea primo, e
	 
	if (FuncionesOca.sumaDeNumerosEsPrimo(tirada1, tirada2) == false) {//si la suma de las 2 tiradas no es primo entonces
		System.out.println("Tirada no valida!");
		System.out.println("La suma de ambos numeros no es un numero primo, entonces no avanzas en esta ronda :(");
		System.out.println("");
	}
	else {
		 suma = tirada1+tirada2;
	FuncionesOca.fichaJ1 += suma; //en caso de que sea primo se le suma al valor de la fichaJ1
	}
	carrera.imprimeComoVaLaCarrera(nomj1, nomj2);//funcion que imprime si van ganando alguno de los 2 jugadores o si van empatados
	
	FuncionesOca.pintaPista();
	
	System.out.println("");
	System.out.println("Por favor introduzca un caracter para continuar.");
	pausa = lee.next();
	
	
	
	//TURNO DEL JUGADOR 2
	
	
	System.out.println("Es el turno de " + nomj2); //Turno del segundo jugador
	tirada1 = dados.tiraDados();
	tirada2 = dados.tiraDados();
	
	System.out.println(FuncionesOca.sumaDeNumerosEsPrimo(tirada1, tirada2));//se verifica que la suma de los numeros de la tirada sea un numero primo
	 
	if (FuncionesOca.sumaDeNumerosEsPrimo(tirada1, tirada2) == false) {// en caso de no ser primo se imprime lo de abajo
		System.out.println("Tirada no valida!");
		System.out.println("La suma de ambos numeros no es un numero primo, entonces no avanzas en esta ronda :(");
		System.out.println("");
	}
	else {
		 suma2 = tirada1 + tirada2;// en caso de ser primo se le suma al valor de la posicion de la ficha del jugador 2
		FuncionesOca.fichaJ2 +=suma2;
	}
	
	carrera.imprimeComoVaLaCarrera(nomj1, nomj2);//imrpime como va la carrera
	
	FuncionesOca.pintaPista();
	
	System.out.println("");
	System.out.println("Por favor introduzca un caracter para continuar.");
	pausa = lee.next();
	/*este if llama a las fichas y en caso de que alguna sea mayor o igual al tamaño del tablero imprimirá la funcion de es ganador */
	if(FuncionesOca.fichaJ1 >= FuncionesOca.TAMCIRCUITO || FuncionesOca.fichaJ2 >= FuncionesOca.TAMCIRCUITO) {
		
		System.out.println("El ganador es " + ganador.esGanador(nomj1, nomj2)); 
	}
	
		}
		
		//cerramos el scanner, se me olvidó cerrarlo en el examen tambien
		lee.close();
		
	}

}
