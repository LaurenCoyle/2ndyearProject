/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;
import UserGUI.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author X00121654
 */
public class StartWindow extends JFrame{
    
    //editor-fold defaultstste="collapsed" desc="Panels Created">
    loginPanel LoginPanel = new loginPanel();//creates panels
    RegisterPanel regPanel = new RegisterPanel();
    PasswordPanel passPanel = new PasswordPanel();
    AdminPanel  adPanel = new AdminPanel();
    WelcomeAdminPanel wadPanel = new WelcomeAdminPanel();
    //</editor-fold>
    
    JPanel panelCont = new JPanel();//creates container
    
    CardLayout c1 = new CardLayout();//sets card layout
    
    public StartWindow(){
        setTitle("Easy-Stay Reservation System");
        setSize(600, 400);
        setLocation(580, 380);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelCont.setLayout(c1);
        
        panelCont.add(LoginPanel, "LoginPanel");//adds panel
        panelCont.add(regPanel, "RegisterPanel");
        panelCont.add(passPanel, "PasswordPanel");
        panelCont.add(wadPanel, "WelcomeAdminPanel");
        panelCont.add(adPanel, "AdminPanel");
        
        c1.show(panelCont, "LoginPanel");//current panel showing
        this.add(panelCont);
        
        LoginPanel.registerButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                c1.show(panelCont, "RegisterPanel");
            }
         });
//        LoginPanel.loginButtonActionListener(new ActionListener(){ Admin Access Hard coding
//            public void actionPerformed(ActionEvent event){
//                c1.show(panelCont, "WelcomeAdminPanel");
//            }
//        });
        
        LoginPanel.passwordButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                c1.show(panelCont, "PasswordPanel");
            }
        });
        
        LoginPanel.exitButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        adPanel.ExitActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        wadPanel.ExitActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        wadPanel.ContinueActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                c1.show(panelCont,"AdminPanel");
            }
        });
        
    }
}
