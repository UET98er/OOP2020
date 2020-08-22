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
public class Division extends BinaryExpression{
	public Division(Expression left,Expression right){
		super(left,right);
	}
	public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }
    public double evaluate() throws ArithmeticException{
    	double l = left.evaluate();
    	double r = right.evaluate();
    	if(r == 0){
    		throw new ArithmeticException("Loi chia cho 0");
    	} else{
    		return 1/r ;
    	}
    }
}
