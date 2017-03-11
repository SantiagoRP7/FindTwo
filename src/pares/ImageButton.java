package pares;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ImageButton extends JButton{
	
	private int x;
	private int y;
	private Icon value;
	
	public ImageButton(int X, int Y){
	x=X;
	y=Y;
	value = new ImageIcon("src/Pokeball.png");
	Dimension dim = new Dimension (100,100);
	setPreferredSize(dim);
	setIcon(value);
	
	}
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Icon getValueIcon(){
		return value;
	}
	public void setValueIcon(Icon v){
		value = v;
		
	}
	
}
