/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author QTV
 */
public class Square extends Rectangle{
	protected double side;
	public Square(){

	}
	public Square(double side){
		this.side = side ;
	}
	public Square(double side,String color,boolean filled){
		this.color = color;
                this.filled = filled ;
		this.side = side ;
	}
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side = side;
	}
	public void setWidth(double side){
		super.setWidth(width);
	}
	public void setLength(double side){
		super.setLength(length);
	}
	public String toString(){
		return "Square[side= " + side 
                        + super.toString() +
                "]";
	}

}
