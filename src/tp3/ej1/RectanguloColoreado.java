package tp3.ej1;

import java.awt.Color;
import java.awt.Graphics;

public class RectanguloColoreado {
	int x, y, width, height;
	Color color;
	
	public RectanguloColoreado(){
		setColor(Color.BLACK);
		setX(1);
		setY(1);
		setWidth(100);
		setHeight(40);
	}
	
	public int getPerimeter(){
		return width*2+height*2;
	}
	
	public int getSurface(){
		return width*height;
	}
	
	public void doubleSize() {
		width*=2;
		height*=2;
	}
	
	public void rotate() {
		int swap;
		swap = height;
		height = width;
		width = swap;
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}
	
	@Override
	public String toString() {
		return "x:"+x+", y:"+y+", w:"+width+", h:"+height+
			   ", srf:"+getSurface()+", perim:"+getPerimeter();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
