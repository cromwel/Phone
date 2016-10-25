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
public class EncapsMain {
    private String name;
    private String username;
    private String password;
    private String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    
    
    
   
    public static void main(String[]args){
    
        EncapsMain obj = new EncapsMain();
        EncapsSimpleImplementation.Data();
        System.out.println(obj.getLastname());
    }
 
    
}
