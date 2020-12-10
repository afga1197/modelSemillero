package com.clearminds.AFGA.dtos;

public class Estudiante {

	private int id;
	private String Nombre;
	private String Apellido;
	private Integer edad;

	public Estudiante() {
	}

	public Estudiante(int id, String nombre, String apellido, Integer edad) {
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}

	public Estudiante(int id, String nombre, String apellido) {
		this.id = id;
		Nombre = nombre;
		Apellido = apellido;
	}

	public Estudiante(String nombre, String apellido, Integer edad) {
		Nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
	}

	public Estudiante(String nombre, String apellido) {
		Nombre = nombre;
		Apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + "]";
	}
}