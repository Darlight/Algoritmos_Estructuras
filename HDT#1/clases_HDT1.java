// Universidad del Valle de Guatemala
// Estructuras de datos y Algoritmos
// Seccion 10
// Mario Perdomo 18029
// Josue Sagastume 18173

/**
 * <h1>Radio</h1>
 * Programa completo respecto la hoja de trabajo #1. Este
 * ejercicio aplica los métodos de un radio de caro con
 * programación más formal y documentada.
 * <p>
 *
 *
 *
 * @author  Mario Perdomo 18029 y Josue Sagastume 18173
 * @version 1.0
 * @since   2019-01-18
 */


/**
 *Interfaz que permite ser impelementada en un objeto tipo Radio
 */

interface Radio{
	/**
	 * Permite cambiar el estado de la radio (ON/OFF)
	 */
	// todos los metodos del interface
	public void toggle();

	/**
	 * @return Permite recibir el estado del radio (ON/OFF)
	 */
	public boolean getState();

	/**
	 * Permite cambiar de frecuencia del radio (Am/Fm)
	 */
	public void changeFrequency();

	/**
	 * @return Permite recibir la estación actual del radio
	 */
	public double getStation();

	/**
	 * @param up Permite cambiar de estación arriba o hacia abajo. Como paramatro, utiliza boleanos. Si recibe True,
	 *           subira de estación. De lo contario bajara de estación.
	 */
	public void changeStation(boolean up);

	/**
	 * @return Permite recibir la frecuencia del radio (Am/Fm)
	 */
	public boolean getFrequency();

	/**
	 * @param numButton Permite guardar una estación en los botones. Recibe como parametro el índice del botón deseado.
	 */
	public void saveStation(int numButton);

	/**
	 * @param numButton Permite cambiar de estación guardada en uno de los botonoes.
	 *                  Recibe como parametro el índice del botón deseado.
	 */
	public void changeStationButton(int numButton);


}

