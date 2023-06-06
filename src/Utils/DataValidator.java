/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * 
 */
public class DataValidator {
    public static void validateEmpty(JTextField field,StringBuilder sb,String errorMS){
        if(field.getText().equals("")){
            sb.append(errorMS).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
            
    }
    public static void validateEmpty(JPasswordField field,StringBuilder sb,String errorMS){
        String passWord=new String(field.getPassword());
        if(passWord.equals("")){
            sb.append(errorMS).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }
        else{
            field.setBackground(Color.white);
        }
            
    }
    
}
