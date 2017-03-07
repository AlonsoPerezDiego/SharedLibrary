/*
 * This package is for Input methods
 */
package Inputs;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry and Diego
 */
public class Input {
    public static String inputString(String s){
        return JOptionPane.showInputDialog(s);
    }
    public static int inputInt(int s){
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }
    public static float inputFloat(float s){
       return Float.parseFloat(JOptionPane.showInputDialog(s));
    }
}
