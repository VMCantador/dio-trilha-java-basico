package metodos;

public class SmartTV {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;

	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando volume para: " + volume);
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo volume para: " + volume);
	}
}
