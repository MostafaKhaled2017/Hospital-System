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
public class Bill {
    private int id;
    private int reciptionistId;
    private boolean billed = false;
    
        public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }    
    
    
    public int getReciptionistId(){
        return this.reciptionistId;
    }
    
    public void setReciptionistId(int reciptionistId){
        this.reciptionistId = reciptionistId;
    }  
    
    public boolean isBilled(){
        return this.billed;
    }
    
    public void setBilled(boolean billed){
        this.billed = billed;
    }    
    
}
