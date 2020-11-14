package controller;


import vista.Vista;

public class Controlador{
	private Vista vista;
	//private Modelo modelo;
	
	public Controlador(Vista vista)
	{
		this.vista = vista;
	}
	
	public Vista getVista()
	{
		return vista;
	}
}
