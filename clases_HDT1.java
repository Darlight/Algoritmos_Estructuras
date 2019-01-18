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
import java.util.List;

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
	public void changeStatino(boolean up);

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

public class MyRadio implements Radio{
	private static double changeFmFrequency = 0.2;
	private static double changeAmFrequency = 10;
	private static double limitSuperiorFm = 107.9; 
	private static double limitInferiorFm = 87.9;
	private static double limitSuperiorAm = 1610;
	private static double limitInferiorAm = 530;

	private double station; // Tomar en cuenta los numeros
	private boolean is_Am;
	private double [] buttons;
	private boolean status; 

	public MyRadio(){
		//Atributos del radio
		this.status = false;
		this.station = 0.0;
		this.is_Am = null;
		this.buttons = new float [12];
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toggle(){
		//encenderlo
		if (this.status == false) {
			this.status = true;
			this.station = limitInferiorAm;
			this.is_Am = true;
		}
		//apagarlo
		else{
			this.status = false;
			this.station = 0.0;
			this.is_Am = null;
		}
	}

	/**
	 * {@inheritDoc}
	 * @return Devuelve el estado
	 */
	public boolean getState(){
		return this.status;
	}

	/**
	 * {@inheritDoc}
	 */
	public void changeFrequency(){
		if (this.getState() != false) {
			if (this.getStation() == true) {
				this.is_Am = false;
			}
			else{
				this.is_Am = true;
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @param up Recibe como parametro boleanos. Se suma o resta la estación con la frecuencia adecuada
	 */
	public void changeStation(boolean up){
		if (up == true) {
			if (this.getFrequency() != false) {
				if (this.getStation() > limitSuperiorAm) {
					this.station = limitInferiorAm;
				}
				else if (this.getStation() < limitInferiorAm) {
					this.station = limitSuperiorAm;
				}
				else{
					this.station += changeAmFrequency;
				}

			}
			else{
				if (this.getStation() > limitSuperiorFm) {
					this.station = limitInferiorFm;
				}
				else if (this.getStation() < limitInferiorFm) {
					this.station = limitSuperiorFm;
				}
				else{
					this.station += changeFmFrequency;
				}
			}
		}
		else{
			if (this.getFrequency() != false) {
				if (this.getStation() > limitSuperiorAm) {
					this.station = limitInferiorAm;
				}
				else if (this.getStation() < limitInferiorAm) {
					this.station = limitSuperiorAm;
				}
				else{
					this.station -= changeAmFrequency;
				}

				}
			}
			else{
				if (this.getStation() > limitSuperiorFm) {
					this.station = limitInferiorFm;
				else if (this.getStation() < limitInferiorFm) {
					this.station = limitSuperiorFm;
				}
				else{
					this.station -= changeFmFrequency;
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @return Devuelve la frecuencia del radio.
	 */
	public boolean getFrequency(){
		return this.is_Am;
	}

	/**
	 * {@inheritDoc}
	 * @param numButton El índice del botón deseado que quiera el usuario guardar la estación actual.
	 */
	public void saveStation(int numButton){
		this.buttons[numButton-1] = this.station;

	}

	/**
	 * {@inheritDoc}
	 * @param numButton El indice del botón deseado.
	 */
	public void changeStationButton(int numButton){
		this.station = this.buttons[numButton-1];
		if (this.station > limitInferiorAm && this.station < limitSuperiorAm) {
			this.is_Am = true;
		}
		else if (this.station > limitInferiorFm && this.station < limitSuperiorFm) {
			this.is_Am = false;
		}
	}

	/**
	 * {@inheritDoc}
	 * @return Devuelve la estación actual del radio presente
	 */
	public double getStation(){
		return this.station;
	}


	
}