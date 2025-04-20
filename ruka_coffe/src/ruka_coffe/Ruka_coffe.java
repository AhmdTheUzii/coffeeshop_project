/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruka_coffe;

/**
 *
 * @author User
 */
public class Ruka_coffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       login loginFrame = new login();
       loginFrame.setVisible(true);
       loginFrame.pack() ;
       loginFrame.setLocationRelativeTo( null) ;
    }
    
}
