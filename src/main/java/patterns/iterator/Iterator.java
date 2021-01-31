/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.iterator;

/**
 *
 * @author GERSON
 */
public interface Iterator {
    public Object first();
    public Object next();
    public boolean hasMore();
    public Object current();
}
