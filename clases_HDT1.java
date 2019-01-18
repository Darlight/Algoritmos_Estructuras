// Universidad del Valle de Guatemala
// Estructuras de datos y Algoritmos
// Seccion 
// Mario Perdomo 18029
// Josue Sagastume 18173


import java.util.List;

interface Radio{
	// todos los metodos del interface
	public void toggle();
	public boolean getState();
	public void changeFrequency();
	public double getStation();
	public void changeStation(boolean up);
	public boolean getFrequency();
	public void saveStation(int numButton);
	public void changeStationButton(int numButton);


}

public class MyRadio implements Radio{
	private static double changeFmFrequency = 0.2;
	private static double changeAmFrequency = 10;
	private static double limitSuperiorFm = 107.9; 
	private static double limitInferiorFm = 87.9;
	private static double limitSuperiorAm = 1610;
	private static double limitInferiorAm = 530;

	private double frequency; // Tomar en cuenta los numeros
	private double is_Am;
	private double [] buttons;
	private boolean status; 

	public Radio(){
		//Atributos del radio
		this.status = false;
		this.frequency = 0.0;
		this.is_Am = null;
		this.buttons = new float [12];
	}

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
	public boolean getState(){
		return this.status;
	}
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
	public boolean getFrequency(){
		return this.frequency;
	}

	public void saveStation(int numButton){
		this.buttons[numButton-1] = this.station;

	}
	public void changeStationButton(int numButton){
		this.station = this.buttons[numButton-1];
		if (this.station > limitInferiorAm && this.station < limitSuperiorAm) {
			this.is_Am = true;
		}
		else if (this.station > limitInferiorFm && this.station < limitSuperiorFm) {
			this.is_Am = false;
		}
	}
	public double getStation(){
		return this.is_Am;
	}


	
}