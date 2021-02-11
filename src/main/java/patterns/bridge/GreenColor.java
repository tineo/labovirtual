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
public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border.");
    }
}