package com.parametra.prueba.entity;

import java.sql.Date;

public class EmpleadoEntity {

	private int id;
	private String nombres;
	private String apellidos;
	private String tipo_documento;
	private Date fecha_nacimineto;
	private Date fecha_vinculacion_emp;
	private String cargo;
	private double salario;   
	
	public EmpleadoEntity() {
		
	}
	
	public EmpleadoEntity(int id, String nombres, String apellidos, String tipo_documento, Date fecha_nacimineto,
			Date fecha_vinculacion_emp, String cargo, double salario) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_documento = tipo_documento;
		this.fecha_nacimineto = fecha_nacimineto;
		this.fecha_vinculacion_emp = fecha_vinculacion_emp;
		this.cargo = cargo;
		this.salario = salario;
	}

	public EmpleadoEntity(String nombres, String apellidos, String tipo_documento, Date fecha_nacimineto,
			Date fecha_vinculacion_emp, String cargo, double salario) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_documento = tipo_documento;
		this.fecha_nacimineto = fecha_nacimineto;
		this.fecha_vinculacion_emp = fecha_vinculacion_emp;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public Date getFecha_nacimineto() {
		return fecha_nacimineto;
	}

	public void setFecha_nacimineto(Date fecha_nacimineto) {
		this.fecha_nacimineto = fecha_nacimineto;
	}

	public Date getFecha_vinculacion_emp() {
		return fecha_vinculacion_emp;
	}

	public void setFecha_vinculacion_emp(Date fecha_vinculacion_emp) {
		this.fecha_vinculacion_emp = fecha_vinculacion_emp;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "EmpleadoEntity [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", tipo_documento="
				+ tipo_documento + ", fecha_nacimineto=" + fecha_nacimineto + ", fecha_vinculacion_emp="
				+ fecha_vinculacion_emp + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	
}
