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

    String matcher_string;
    String pattern_string;
    String output;

    Pattern pattern;
    Matcher matcher;

    public re(String pattern, String string) {
        this.matcher_string = string;
        this.pattern_string = pattern;
        this.pattern = Pattern.compile(this.pattern_string);
        this.matcher = this.pattern.matcher(this.matcher_string);

//        this.output = m.group(0);
    }

    String showPattern() {
        return this.pattern_string;
    }

    String showString() {
        return this.matcher_string;
    }

    String showOutput() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            count++;
            sb.append(String.format("Found :%2d at %3d - %3d  (%s)%n",
                    count,
                    matcher.start(),
                    matcher.end(),
                    matcher.group()));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format(""
                + "Pattern : %s%n"
                + "String  : %s%n"
                + "Output  %n%s%n",
                showPattern(),
                showString(),
                showOutput());
    }

}
