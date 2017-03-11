package pares;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectorGUI extends JFrame{
	
	private JPanel frame;
	private JButton pokemon, yugi;
	private JLabel title;	
	private ParesGUI game;
	private Container contenedor;
	
	public SelectorGUI(){
		initGUI();
		setTitle ("Selecciona Un Tema");
		setLocationRelativeTo (null);
		setResizable (false);
		setVisible (true);
		pack();
		
	}
	public void initGUI(){
		contenedor = this.getContentPane ();
		title = new JLabel ("Primero, Selecciona el tema con el que deseas *perder* Jugar.");
		contenedor.add(title,BorderLayout.PAGE_START);
		
		frame = new JPanel();
		
		pokemon = new JButton();
		pokemon.setText("Pokemon Theme");
		
		yugi = new JButton();
		yugi.setText("Yugi-oh Theme");
		
		ListenerActionS listen = new ListenerActionS();
		pokemon.addActionListener(listen);
		yugi.addActionListener(listen);
		
		frame.add(yugi);
		frame.add(pokemon);
		
		contenedor.add(frame, BorderLayout.CENTER);
		
		
	}
	private class ListenerActionS implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton SButton= (JButton)e.getSource();
			String mode= SButton.getText();
			if(mode.equals("Pokemon Theme")){
				game= new ParesGUI(1);
				setVisible(false);
				dispose();
				
			}else{
				game= new ParesGUI(2);
				setVisible(false);
				dispose();
			}
			
		}
		
	} 
}
