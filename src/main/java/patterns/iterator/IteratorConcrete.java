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
public class IteratorConcrete implements Iterator{
    private CursoConcrete curso;
    private int current_position = 0;
    
    public IteratorConcrete( CursoConcrete curso )
    {
         this.curso = curso;
    }
    
    @Override
    public Object first() {
        Object obj = null;
        if( this.curso.data.isEmpty() == false )
        {
            this.current_position = 0;
            obj = this.curso.data.firstElement();
        }
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if( (this.current_position ) < this.curso.data.size() )
        {
            obj = this.curso.data.elementAt(this.current_position);
            this.current_position = this.current_position + 1;
        }
        return obj;
    }

    @Override
    public boolean hasMore() {
        boolean ok = false;
        if( this.current_position < (this.curso.data.size() ) )
        {
            ok = true;
        }
        return ok;
    }

    @Override
    public Object current() {
        Object obj = null;
        if( this.current_position < this.curso.data.size() )
        {
            obj = this.curso.data.elementAt( this.current_position );
        }
        return obj;
    }
    
}
