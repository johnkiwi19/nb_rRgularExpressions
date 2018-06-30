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

    public re() {
        this.string = null;
        this.pattern = null;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    String showPattern() {
        return "This is the pattern ";
    }

    @Override
    public String toString() {
//        return "re{" + "string=" + string + ", pattern=" + pattern + '}';
        return String.format("Pattern :%s%n"
                + "aaa%n",
                showPattern());
    }

}
