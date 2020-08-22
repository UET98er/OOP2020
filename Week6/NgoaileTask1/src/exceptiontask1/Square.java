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
public class Square extends Expression{
    private Expression expression;
    public Square(Expression expression){
            this.expression = expression;
    }
    public String toString(){
            return "(" + expression + ")" + " ^2";
    }
    public double evaluate(){
            return expression.evaluate() * expression.evaluate();
    }
}
