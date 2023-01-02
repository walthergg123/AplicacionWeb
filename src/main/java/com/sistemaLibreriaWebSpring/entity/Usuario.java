package com.sistemaLibreriaWebSpring.entity;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="idUsuario")
	private int idUsuario;
	
	@Column (name="correo")
	private String correo;
	
	@Column (name="password")
	private String password;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="apellidoPaterno")
	private String apellidoPaterno;
	
	@Column (name="apellidoMaterno")
	private String apellidoMaterno;
	
	@Column (name="direccion")
	private String direccion;
	//metodo
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
