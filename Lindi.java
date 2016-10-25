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
public class Lindi extends HassanPhone{
    
    public void AutoMessage(){
        System.out.println("Ringing Implementation");
    
    }
    
    public void camera(){
        System.out.println("Camera Implementation");
    }
    
    
    public void PhoneData(){
        System.out.println("This is the second instance in Lindis class");
    
    }
    public static void main(String [] args){
    Lindi lindi = new Lindi();
    lindi.PhoneData();
    
    }


}
