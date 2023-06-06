/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MessageDialog {
    public static void showMessage(Component parent,String content,String title){
        JOptionPane.showMessageDialog(parent, content, title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorMessage(Component parent,String content,String title){
        JOptionPane.showMessageDialog(parent,content, title, JOptionPane.ERROR_MESSAGE);
    }
    public static int showConfirm(Component parent,String content,String title){
       int chosse= JOptionPane.showConfirmDialog(parent, content, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
       return chosse;
    }
}
