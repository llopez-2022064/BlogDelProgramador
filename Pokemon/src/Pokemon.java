package src;

import java.util.Random;

public class Pokemon {

	// Instancia Random
	Random random = new Random();

	// Vida
	int min_v = 50;
	int max_v = 100;
	int valor_v = random.nextInt(max_v + min_v) + min_v;

	// Ataque
	int min_a = 5;
	int max_a = 20;
	int valor_a = random.nextInt(max_a + min_a) + min_a;

	private String nombre;
	private int vida = valor_v;
	private int ataque = valor_a;
	private String estado = "Vivo";

	public Pokemon() {}

	public Pokemon(String nombre, int vida, int ataque, String estado) {
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.estado = estado;
	}

	// Get and Set

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getVida() {
		return vida;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}