/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.patron;

/**
 *
 * @author Usuario
 */
// Shapes - The Abstraction
public abstract class Shape {
    // Composition
    protected IColor color;
    protected Shape(IColor c) {
        this.color = c;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border, int increment);
}