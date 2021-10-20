/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.system;

import java.util.ArrayList;

/**
 *
 * @author mosta
 */
public class Reciptionist extends User{
    public Reciptionist(String name, int id){
       this.setName(name);
       this.id = id;
   }
    
    ArrayList giveAppointment(int patientId, ArrayList<User> users,int reciptionistId){
        for(int i = 0; i < users.size();i++){
            User user = users.get(i);
            if(((Patient)user).getId() == patientId){
                ((Patient)user).sethasAppointment(true);
                ((Patient)user).setReciptionistId(reciptionistId);
                System.out.println("Operation done successfully");
                return users;
            }
        }
        
        System.out.println("This patient is not in the database");
        return users;
    }
    
    
}
