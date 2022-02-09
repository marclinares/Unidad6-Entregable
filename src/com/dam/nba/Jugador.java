package com.dam.nba;

public class Jugador {

	private String nombre;
	private int dorsal, edad, posicion;
	private double salario, altura;
	private boolean estado;
	
	public static final boolean estado_disponible = true;
	public static final boolean estado_lesionado = false;
	
	public static final int posicion_base = 1;
	public static final int posicion_escolta = 2;
	public static final int posicion_alero = 3;
	public static final int posicion_ala_pivot = 4;
	public static final int posicion_pivot = 5;
	
	//--------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombe(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	//---------------------------------------------------------------------------------------
	
	public Jugador() {}
	
	public Jugador(String nombre, int dorsal, int edad, double salario, double altura, boolean estado, int posicion) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.edad = edad;
		this.salario = salario;
		this.altura = altura;
		this.estado = estado;
		this.posicion = posicion;
	}
	
	
	
}
