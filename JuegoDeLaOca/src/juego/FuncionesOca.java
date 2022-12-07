package juego;

public class FuncionesOca {
	static final int TAMCIRCUITO = 11;
	static int fichaJ1;
	static int fichaJ2;
	static int minDado;//el valor minimo del dado
	static int maxDado;//el valor maximo del dado

//Esta funcion se encarga de generar el numero aleatorio de los dados 
	public static int tiraDados() {
	
		return (int)(Math.random()*(maxDado-minDado)+minDado);
	}

public static void pintaPista(){
	
	/*Esta es la funcion corregida, en el examen no la terminé porque basicamente no entendia como plantear el for hasta ahora
	 * */
	
	//Esta funcion imprime la pista y el movimiento de las fichas sobre la pista 
	
	for (int i=1 ; i <= TAMCIRCUITO; i++) {
		
		System.out.print("\t" + i);	//Este for imprime el tablero, empieza con tabulador e imprime la cantidad de campos que tenga la variable TAMCIRCUITO
		}
	System.out.println("");//salto de linea
	
	for (int i = 1; i<=fichaJ1; i ++) {//este for va a imprimir los tabuladores hasta la posicion de la ficha donde este el jugador 1
		System.out.print("\t");
	}
	System.out.print("J1");// este print va a imprimir LA FICHA
	
	System.out.println(""); //salto de linea
	
	for(int i=1; i<=fichaJ2; i++){//este for imprime los tabuladores hasta el valor de la ficha del jugador 2 
		System.out.print("\t");
	}
	System.out.print("J2");//imprime la ficha del jugador2

}
public static boolean sumaDeNumerosEsPrimo(int num1, int num2) {
	
	int resultado = num1 + num2;
	boolean primo = true; //declaramos este boolean llamado primo que equivale a true
	
	for (int i = 2; i<resultado; i++) {
		
		//En cada vuelta del for va a dividir el numero introducido entre i, si en algun caso resulta ser 0 pues el numero no es primo
		if (resultado % i == 0) {
			//entonces nuestro boolean pasa a ser false
			primo = false;
		}
	}
return primo;//solicitamos que devuelva primo
}
	
	public void imprimeComoVaLaCarrera(String nombre1, String nombre2){
		//esta funcion imprime quien va ganando
		
		//si ambas fichas estan en la misma posicion entonces
		if (fichaJ1==fichaJ2) {
			System.out.println("Empate!");//se imprime el empate
		}
		else if (fichaJ1 > fichaJ2) {//si la fichaJ1 tiene un valor mas alto que la fichaJ2 entonces
			System.out.println(nombre1 + " va ganando!");//se imprime el mensaje con el jugador
		}
		else {	
			System.out.println(nombre2 + " va ganando!");//en caso de la segunda ficha
		}	
	}

	public String esGanador(String nombre1,String nombre2) {
		//Esta funcion se encarga de imprimir el ganador 
		//Esta funcion tampoco la pude terminar en el examen, carmen me ha sugerido una cosa
		/*Como necesito devolver un valor de tipo String, creo una variable de nombre ganador de tipo string y la igualo a una cadena vacia*/
		String ganador = "";
		//si la fichaJ1, es igual o mayor al tamaño del circuito entonces se iguala ganador al niombre del jugador1;
		if (fichaJ1 >= TAMCIRCUITO)  {
		ganador = nombre1;
		}
		//si la fichaJ2 es igual o mayor al tamaño del circuito entonces se iguala ganador al nombre del jugador2;
		else if (fichaJ2 >= TAMCIRCUITO){
			ganador = nombre1;
		}
		//y ya teniendo la variable de tipo String la puedo devolver en la funcion (:
	return ganador;
	//Gracias Carmen
	}
	
}


	