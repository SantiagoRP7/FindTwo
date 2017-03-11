package pares;

 import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

 
public class ParesGUI extends JFrame{
	JPanel frame;
	ImageButton cards[][];
	private static final int SIZE = 6;
	private Container contenedor;
	
	//Biblioteca De Iconos Pokemons
	
	private static final Icon POKEBALL = new ImageIcon("src/Pokeball.png");
	private static final Icon POKEMON1 = new ImageIcon("src/Pokemons/1.png");
	private static final Icon POKEMON2 = new ImageIcon("src/Pokemons/2.png");
	private static final Icon POKEMON3 = new ImageIcon("src/Pokemons/3.png");
	private static final Icon POKEMON4 = new ImageIcon("src/Pokemons/4.png");
	private static final Icon POKEMON5 = new ImageIcon("src/Pokemons/5.png");
	private static final Icon POKEMON6 = new ImageIcon("src/Pokemons/6.png");
	private static final Icon POKEMON7 = new ImageIcon("src/Pokemons/7.png");
	private static final Icon POKEMON8 = new ImageIcon("src/Pokemons/8.png");
	private static final Icon POKEMON9 = new ImageIcon("src/Pokemons/9.png");
	private static final Icon POKEMON10 = new ImageIcon("src/Pokemons/10.png");
	private static final Icon POKEMON11 = new ImageIcon("src/Pokemons/11.png");
	private static final Icon POKEMON12 = new ImageIcon("src/Pokemons/12.png");
	private static final Icon POKEMON13 = new ImageIcon("src/Pokemons/13.png");
	private static final Icon POKEMON14 = new ImageIcon("src/Pokemons/14.png");
	private static final Icon POKEMON15 = new ImageIcon("src/Pokemons/15.png");
	private static final Icon POKEMON16 = new ImageIcon("src/Pokemons/16.png");
	private static final Icon POKEMON17 = new ImageIcon("src/Pokemons/17.png");
	private static final Icon POKEMON18 = new ImageIcon("src/Pokemons/18.png");
	
	
//Donde los Valores De "s" seran 1 o 0 dependiendo de la seleccion del juador.
	public ParesGUI(int s) {
	initGUI(s);
	setTitle ("¡Concentrate!");
	setLocationRelativeTo (null);
	setResizable (false);
	setVisible (true);
	pack();
	}
	
	public void initGUI(int S){
		contenedor = this.getContentPane();
		frame = new JPanel();
		frame.setLayout(new GridLayout(SIZE,SIZE));
	cards = new ImageButton [SIZE][SIZE];
	ListenerAction l = new ListenerAction();
	
//inicializa cada ImageButton del Array y agrega el listener a cada uno.
	
	for(int y=0;y<SIZE;y++){
		for(int x=0;x<SIZE;x++){
			cards[x][y] = new ImageButton(x,y);
			cards[x][y].addActionListener(l);
			//System.out.println(revision(asignadorP(numero)));
				cards[x][y].setValueIcon(POKEBALL);
				
				//System.out.println(cards[x][y].getValueIcon());
				
			
		}
	}
	//System.out.println(asignadorP(randomSinRepetir()));
	
	switch(S){
	case 1:{
		
		for(int y=0;y<SIZE;y++){
			for(int x=0;x<SIZE;x++){
					cards[x][y].setValueIcon(asignadorP(randomSinRepetir()));
						
					
				
				
				frame.add(cards[x][y]);
			}
		}
	}
	case 2:{
		for(int y=0;y<SIZE;y++){
			for(int x=0;x<SIZE;x++){
				
		//			cards[x][y].setValueIcon(asignadorY(randomSinRepetir()));
			
				
				frame.add(cards[x][y]);
			
		}
	}
	}
	
	contenedor.add(frame, BorderLayout.CENTER);
	
	}
	}
	
public int randomSinRepetir(){
		
		int numero = (int) (Math.random() * 18) + 1;
		if(revision(asignadorP(numero))){
		return numero;
		}else{
			return randomSinRepetir();
		}
	}
	
  private class ListenerAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ImageButton clk = (ImageButton)e.getSource();
			clk.setIcon(clk.getValueIcon());
			
			
			
			
				
			
				}
	}
	
	
	public boolean revision(Icon img){
		int counter=0;
		
		//String r_img  = img.toString();
		for(int y=0;y<SIZE;y++){
			for(int x=0;x<SIZE;x++){
				
				//System.out.println(cards[y][x].getValueIcon());
				
				if(img.equals(cards[x][y].getValueIcon())){
					counter++;
					//System.out.println(counter);
				}
			}
		}
		if(counter>1){
			return false;
		}else{
			return true;
		}
	}
	
	public Icon asignadorP(int num){
		
		switch(num)
		{
		case 1:
			return POKEMON1;
		case 2:
			return POKEMON2;
		case 3:
			return POKEMON3;
		case 4:
			return POKEMON4;
		case 5: 
			return POKEMON5;
		case 6:
			return POKEMON6;
		case 7:
			return POKEMON7;
		case 8:
			return POKEMON8;
		case 9:
			return POKEMON9;
		case 10:
			return POKEMON10;
		case 11:
			return POKEMON11;
		case 12: 
			return POKEMON12;
		case 13: 
			return POKEMON13;
		case 14: 
			return POKEMON14;
		case 15:
			return POKEMON15;
		case 16:
			return POKEMON16;
		case 17:
			return POKEMON17;
		case 18:
			return POKEMON18;
		default:
			return new ImageIcon("src/Pokemons/006.png");
		}
	}
	public Icon asignadorY(int num){
		return POKEMON1;
	}
	
	
}

