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
public class Subtraction extends BinaryExpression{
    public Subtraction(Expression left,Expression right){
            super(left,right);
    }
    public String toString() {
    return "(" + left.toString() + " - " + right.toString() + ")";
}
    public double evaluate(){
    return left.evaluate() - right.evaluate();
    }
}
