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
public class Patient extends User{
   private int reciptionistId, doctorId, id;
   private boolean hasAppointment = false, checked = false;
   
   public Patient(String name, int id){
       this.setName(name);
       this.id = id;
   }
   
   
    public ArrayList payBill(int billID,ArrayList<Bill> bills){
        for(int i = 0; i < bills.size(); i++){
            Bill bill = bills.get(i);
            if(bill.getId() == billID){
                if (bill.isBilled()){
                    System.out.println("This Bill is already paid");
                    return bills;
                } else {
                    System.out.println("Bill payed successfully");
                    bill.setBilled(true);
                    return bills;
                }
            }
        }
        
        System.out.println("Bill not found. Please check your data and try again");
        return bills;
    }
    
        public int getReciptionistId(){
        return this.reciptionistId;
    }
    
    public void setReciptionistId(int reciptionistId){
        this.reciptionistId = reciptionistId;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getDoctorId(){
        return this.doctorId;
    }
    
    public void setDoctorId(int doctorId){
        this.doctorId = doctorId;
    } 
      
    public boolean hasAppointment(){
        return this.hasAppointment;
    }
    
    public void sethasAppointment(boolean hasAppointment){
        this.hasAppointment = hasAppointment;
    }   
    
    public boolean isChecked(){
        return this.checked;
    }
    
    public void setChecked(boolean checked){
        this.checked = checked;
    }   
}
