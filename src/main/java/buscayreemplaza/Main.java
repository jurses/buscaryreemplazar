package buscayreemplaza;

import controller.Controlador;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vista.Vista;

public class Main extends Application
{
	private Controlador controlador;
	
	public Main()
	{
		controlador = new Controlador(new Vista());
	}
	
	public static void main(String []args)
	{
		launch(args);
	}

	public void start(Stage s)
	{
		Scene sc = new Scene(controlador.getVista(), 400, 200);
		s.setScene(sc);
		s.setTitle("Buscar y reemplazar");
		s.setMinHeight(s.getMinHeight());
		s.setMinWidth(600);
		s.show();
	}
}
