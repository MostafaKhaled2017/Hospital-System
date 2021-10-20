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
public class Doctor extends User{
    public Doctor(String name, int id){
       this.setName(name);
       this.id = id;
   }
    
    ArrayList checkPatient(int patientId, ArrayList<User> users, int doctorId){
        for(int i = 0; i < users.size();i++){
            User user = users.get(i);
            if(((Patient)user).getId() == patientId){
                ((Patient)user).setChecked(true);
                ((Patient)user).setDoctorId(doctorId);
                System.out.println("Operation done successfully");
                return users;
            }
        }
        
        System.out.println("This patient is not in the database");
        return users;    }
}
