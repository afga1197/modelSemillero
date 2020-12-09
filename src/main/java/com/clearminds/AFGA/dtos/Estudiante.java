package com.clearminds.AFGA.dtos;

public class Estudiante {

	private String Nombre;
	private String Apellido;
	private int id;

	public Estudiante(String nombre, String apellido, int id) {
		Nombre = nombre;
		Apellido = apellido;
		this.id = id;
	}

	public Estudiante(String nombre, String apellido) {
		Nombre = nombre;
		Apellido = apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Estudiante [Nombre=" + Nombre + ", Apellido=" + Apellido + ", id=" + id + "]";
	}

}