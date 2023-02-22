package examen;
/**
 * En esta clase comprobaremos si una fecha es valida a traves de las variables dia, mes y anio 
 * donde siguiendo una serie de restricciones o parametros de entrada y salida para cada variable comprobaremos si es una fecha valida o no 
 * @author Rodrigo Romero
 * @version 1.1
 * @since 22/02/2023
 *
 */
public class Fecha {
	/**
	 * variable publica de tipo estatico que devuelve un booleano
	 */
	public static boolean fechaValida;
/**
 * Metodo estatico que devolvera un booleano en este caso si es True o False, refiriendose a la validacion de la Fecha al introducir las variables dia, mes y anio
 * @param anio entrara una varible de tipo entero que tiene que ser mayor que 0
 * @return devolvera un booleano diciendonos si la fecha en este caso el anio es valido o no junto a las otras variables de entrada
 * @param mes entrara una variable de tipo entero que tiene que ser menor o igual a 12
 * @return devolvera un booleano diciendonos si la fecha en este caso el mes es valido o no junto a las otras variables de entrada
 * @param dia entrara una variable de tipo entero que tiene que ser menor o igual a 31
 * @return devolvera un booleano diciendonos si la fecha en este caso el dia es valido o no junto a las otras variables de entrada
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		ValidarFecha();
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}

	public static void ValidarFecha() {
		fechaValida = false;
	}
}