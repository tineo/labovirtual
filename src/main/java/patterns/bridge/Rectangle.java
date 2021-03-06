/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.bridge;

/**
 *
 * @author Usuario
 */
public class Rectangle extends Shape {
    public Rectangle(IColor c) {
        super(c);
    }
    // Implementer-specific method
    @Override
    void drawShape(int border) {
        color.fillWithColor(border);
    }
    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        border = border * increment;
        drawShape(border);
    }
}
