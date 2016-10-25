/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author lindy
 */
public abstract class IPhone {
    
    public void Flash(){
        System.out.println("Flash Implementation");
    
    }
    
    public void Vibration(){
        System.out.println("Vibration Implementation");
    
    }
        
    public void GeoLocation(){
        System.out.println("GeoLocation Implementation");
    
    }
    
    public abstract void AutoMessage();
    
    public abstract void Calling();
    
    public abstract void Ring();

    public abstract void camera();
   
    
}
