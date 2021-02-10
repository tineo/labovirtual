/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.iterator;

import java.util.Vector;

/**
 *
 * @author GERSON
 */
public class CursoConcrete implements ICurso {
    protected Vector data = new Vector();

    public CursoConcrete(){
        this.getData();
    }
    @Override
    public Iterator getIterator() {
        return new IteratorConcrete(this);
    }
    
    private void getData(){
        
    }
}
