/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.system;

/**
 *
 * @author mosta
 */
public class User {
    private String name;
    public static int id = 0;
    
    public User() {
    
}
    public User(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
   
}
