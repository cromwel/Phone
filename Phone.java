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
public class Phone {
    
    public void PhoneData(){
        System.out.println("This is the first instance");
    
    }

    public void PhoneData(int x, int y){
        int sum = x+y;
        System.out.println("This is the first instance with a return type of sum : " +sum);
    
    }

    public static void main(String[] args) {
       IPhone iPhone = new Lindi();
       iPhone.Flash();
       Phone phone = new Phone();
       phone.PhoneData(7,10);
    }
    
}
