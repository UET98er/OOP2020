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
public abstract class Shape{
    protected String color;
    protected boolean filled;


public Shape(){

}
public Shape(String color ,boolean filled){
    this.color = color ;
    this.filled = filled ;
}

public String getColor(){
    return color ;
}
public void setColor(String color){
    this.color = color ;
}
public boolean isFilled(){
    return filled;
}
public void setFilled(boolean filled){
    this.filled = filled ;
}
public double getArea(){
    return 0;
}
public double getPerimeter(){
    return 0;
}
public String toString(){
    return "Shape[color=" + color 
            + ",filled=" + filled +"]";
}
}
