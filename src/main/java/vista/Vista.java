package vista;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;

public class Vista extends HBox
{
	public Vista()
	{
		super(); //?
		VBox v_menu_buttons = new VBox();
		GridPane g_user_input = new GridPane();
		Button b_search = new Button("Buscar");
		Button b_replace = new Button("Reemplazar");
		Button b_replace_all = new Button("Reemplazar todo");
		Button b_close = new Button("Cerrar");
		Button b_help= new Button("Ayuda");
		
		b_search.setMaxWidth(Double.MAX_VALUE);
		b_replace.setMaxWidth(Double.MAX_VALUE);
		b_replace_all.setMaxWidth(Double.MAX_VALUE);
		b_close.setMaxWidth(Double.MAX_VALUE);
		b_help.setMaxWidth(Double.MAX_VALUE);
		
		this.getChildren().add(g_user_input);
		this.getChildren().add(v_menu_buttons);
		
		this.setSpacing(5.0);
		this.setPadding(new Insets(10, 10, 10, 10));
		
		v_menu_buttons.getChildren().add(b_search);
		v_menu_buttons.getChildren().add(b_replace);
		v_menu_buttons.getChildren().add(b_replace_all);
		v_menu_buttons.getChildren().add(b_close);
		v_menu_buttons.getChildren().add(b_help);
		
		Label l_search = new Label("Buscar:");
		Label l_replace_with = new Label("Reemplazar con:");
		
		TextField tf_search = new TextField();
		TextField tf_replace_with = new TextField();
		
		g_user_input.add(l_search, 0, 0);
		g_user_input.add(l_replace_with, 0, 1);
		g_user_input.add(tf_search, 1, 0);
		g_user_input.add(tf_replace_with, 1, 1);
		
		g_user_input.setHgap(5.0);
		g_user_input.setVgap(5.0);
		g_user_input.setPadding(new Insets(10, 10, 10, 10));
		
		GridPane g_user_options = new GridPane();
		CheckBox cb_upper_lower_case = new CheckBox("Mayúsculas y minúsculas");
		CheckBox cb_search_backward = new CheckBox("Buscar hacia atrás");
		CheckBox cb_regular_expresion = new CheckBox("Expresión regular");
		CheckBox cb_highlight_results = new CheckBox("Resaltar resultados");
		
		g_user_input.add(g_user_options, 1, 2);
		
		g_user_options.add(cb_upper_lower_case, 0, 0);
		g_user_options.add(cb_regular_expresion, 0, 1);
		g_user_options.add(cb_search_backward, 1, 0);
		g_user_options.add(cb_highlight_results, 1, 1);
	}
}