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
public class ExpressionTest extends Expression {
    @Override
    public String toString() {
        return "((((10) ^ 2 + -3) + (4 * 3))) ^ 2";
    }
    
    public double evaluate(){
        return 109*109;
    }

}
