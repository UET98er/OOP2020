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
public class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;
    public BinaryExpression(Expression left,Expression right){
            this.left = left;
            this.right = right;
    }
    public String toString(){
            return null;
    }
    public double evaluate(){
            return 0;
    }
}