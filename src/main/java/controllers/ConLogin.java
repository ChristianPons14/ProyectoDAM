package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

import models.LoginVariables;
import views.Vlogin;

/**
 * 
 * @author Grupo 5
 * 
 *         Llama a la ventana Vlogin, la muestra y permite iniciar sesi�n en el programa si
 *         los datos son correctos.
 *
 */
public class ConLogin implements ActionListener{
	
	private Vlogin window;
	private LoginVariables var;

	public static void main(String[] args) {	
		new ConLogin();
	}
	
	public ConLogin() {
		var = new LoginVariables();
		prepareLoginWindow();
	}

	private void prepareLoginWindow() {
		window = new Vlogin(var);
		window.getEnter().addActionListener(this);
		window.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean filledFields = checkFields();
		
		if(filledFields) {
			//User user = 
			
		}
	}

	/**
	 * Comprueba que los datos campos hayan sido rellenados
	 * @return
	 */
	private boolean checkFields() {
		boolean allFilled = true;
		
		if(window.getUserName().getText().isBlank()) {
			window.getUserName().setBorder(new LineBorder(Color.red));
			allFilled = false;
			
		}else {
			window.getUserName().setBorder(new LineBorder(null));
		}
		
		if(window.getPassword().getPassword().length <= 0) {
			window.getPassword().setBorder(new LineBorder(Color.red));
			allFilled = false;
			
		}else {
			window.getUserName().setBorder(new LineBorder(null));
		}
		return allFilled;
	}
	
	// Pendiente de desarrollar.
	/*
	private boolean checkDb() {
		
		return null;
	}*/
}
