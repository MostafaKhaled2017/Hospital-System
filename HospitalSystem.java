/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.system;

import java.util.*;

/**
 *
 * @author mosta
 */
public class HospitalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Bill> bills = new ArrayList<>();
        
        User user = new User();


        while(true){
        System.out.println("Are you a patient, Reciptionist or doctor?");
        boolean newUser = false;

        String type = sc.next();
           
       
        
        System.out.println("Please enter your name");
        String name = sc.next();
        
        System.out.println("Hello " + name + " are you a new user? Type Yes or No");
        String response = sc.next();
        if(response.equalsIgnoreCase("Yes")){
           newUser = true;   
        }
       
        
        if (type.equalsIgnoreCase("patient")){
            if(newUser){
            user = new Patient(name, User.id);
            users.add(user);
            System.out.println("Your id is " + User.id);
            User.id += 1;
            }
            System.out.println("Please enter the ID of the Bill you want to pay");
            int billId = sc.nextInt();
           bills = ((Patient)user).payBill(billId, bills);
        } else if (type.equalsIgnoreCase("Reciptionist")){
            if(newUser){
            user = new Reciptionist(name, User.id);
            users.add(user);
            System.out.println("Your id is " + User.id);
            User.id += 1;
            }
            
            System.out.println("Please enter the id of the user you want to give an appointment to then write your ID");
            int userId = sc.nextInt();
            int reciptionistId = sc.nextInt();
           users = ((Reciptionist)user).giveAppointment(userId, users, reciptionistId);
        } else if(type.equalsIgnoreCase("doctor")){
          if(newUser){
            user = new Doctor(name, User.id);
            users.add(user);
            System.out.println("Your id is " + User.id);
            User.id += 1;
            }
           System.out.println("Write the ID of the patient you want to check then write your ID");
            int patientId = sc.nextInt();
            int doctorId = sc.nextInt();
            users = ((Doctor) user).checkPatient(patientId, users, doctorId);
        } else {
            System.out.println("Invalid input");
        }
        
            System.out.println("Do you want to continue or exit?");
            String result = sc.next();
            if(result.equalsIgnoreCase("Exit")){
                break;
            }
    }
        
    }
    
}
