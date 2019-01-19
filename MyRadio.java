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

	/**
	 * Construye el radio con los siguientes atributos: status, station, is_AM y Buttons.
	 */
	public MyRadio(){
		//Atributos del radio
		this.status = false;
		this.station = 0.0;
		this.is_Am = true;
		this.buttons = new double [12];
	}

	/**
	 * {@inheritDoc}
	 */
	//@Override
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
			this.is_Am = true;
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
			if (this.is_Am == true) {
				this.is_Am = false;
				this.station = limitInferiorFm;
			}
			else{
				this.is_Am = true;
				this.station = limitInferiorAm;
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
			else{
				if (this.getStation() > limitSuperiorFm) {
					this.station = limitInferiorFm;
				}
				else if(this.getStation() < limitInferiorFm) {
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
