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
public class UserImpl implements User{
    private String name;
    private String last_name;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
}
