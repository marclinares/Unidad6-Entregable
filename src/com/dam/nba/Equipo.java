package com.dam.nba;

public class Equipo {
	
	private String nombre;
	private int id, posicion, victorias, derrotas, puntosafavor, puntosencontra;
	
	Jugador[] arrayJugadores = new Jugador[15];
	
	//-----------------------------------------------------------------------------------------------
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getPuntosafavor() {
		return puntosafavor;
	}
	public void setPuntosafavor(int puntosafavor) {
		this.puntosafavor = puntosafavor;
	}
	
	public int getPuntosencontra() {
		return puntosencontra;
	}
	public void setPuntosencontra(int puntosencontra) {
		this.puntosencontra = puntosencontra;
	}
	
	public Jugador[] getJugadores() {
		return arrayJugadores;
	}
	public void setJugadores(Jugador[] arrayJugadores) {
		this.arrayJugadores = arrayJugadores;
	}
	
	//-------------------------------------------------------------------------------------------
	
	public Equipo() {}
	
	public Equipo(String nombre, int id, int posicion, int victorias, int derrotas, int puntosafavor, int puntosencontra, Jugador[] arrayJugadores) {
		this.nombre = nombre;
		this.id = id;
		this.posicion = posicion;
		this.victorias = victorias;
		this.derrotas = derrotas;
		this.puntosafavor = puntosafavor;
		this.puntosencontra = puntosencontra;
		this.arrayJugadores = arrayJugadores;
	}
	
	

}
