/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontask1;

/**
 *
 * @author QTV
 */
public class Numeral extends Expression{
    private int value;
    public Numeral(){

    }
    public Numeral(int value){
            this.value = value ;
    }
    public String toString(){
            return " " + value ;
    }
    public double evaluate(){
            return 0;
    }
}
