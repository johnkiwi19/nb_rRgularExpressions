/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package re;

/**
 *
 * @author john
 */
public class AAAMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        re r = new re();
        r.setString("Ok so this will be the string that is matched");
        r.setPattern("*");
        System.out.println(r);
        
    }
    
}