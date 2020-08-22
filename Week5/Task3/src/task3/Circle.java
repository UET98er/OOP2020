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
public class Circle extends Shape{
	protected double radius ;
	public Circle(){

	}
	public Circle(double radius){
		this.radius = radius ;
	}
	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getPerimeter(){
		return 2*radius*Math*PI;
	}
	public String toString(){
		return "Circle[radius="  + radius
			+ super.toString()
			+"]" ;
	}
}

