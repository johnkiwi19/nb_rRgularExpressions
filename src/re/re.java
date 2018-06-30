/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author john
 */
class re {

    String string;
    String pattern;
    String output;


    public re(String pattern, String string) {
        this.string = string;
        this.pattern = pattern;
        Pattern p = Pattern.compile(this.pattern);
        Matcher m = p.matcher(this.string);
        
        this.output = m.group();
    }


    
    String showPattern() {
        return this.pattern;
    }

    String showString(){
        return this.string;
    }
    
    
    String showOutput(){
        return this.output;
    }
    @Override
    public String toString() {
        return String.format(""
                + "Pattern : %s%n"
                + "String  : %s%n",
                showPattern(),
                showString());
    }

}
