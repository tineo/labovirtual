/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.null_object;

/**
 *
 * @author GERSON
 */
public class NullUser implements User{

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLast_name() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }
    
}
