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
class re {

    String string;
    String pattern;


    public re(String pattern, String string) {
        this.string = string;
        this.pattern = pattern;
    }


    
    String showPattern() {
        return this.string;
    }

    String showString(){
        return this.string;
    }
    
    @Override
    public String toString() {
        return String.format("Pattern :%s%n"
                + "String  : %s%n",
                showPattern(),
                showString());
    }

}
