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
public class RedColor implements IColor {
    // consola para propósitos de depuración
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + " inch border");
    }
}