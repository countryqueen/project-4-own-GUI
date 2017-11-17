/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4advjava;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Owner
 * ‘******************************************************
‘***  Class Name Project4ADVjava 
‘***  Class Author (i.e. Your name)
‘******************************************************
‘*** Purpose of the class Display the GUI
‘***
‘******************************************************
‘*** Date 11/17/17
‘******************************************************

 */
public class Project4ADVjava 
{


    public static void main(String[] args) 
    {
        // TODO code application logic here
        NewGui main = new NewGui() {};
        main.setDefaultCloseOperation(mainGui.EXIT_ON_CLOSE);
        
        //width and height are in the gui
        main.setSize(1000, 1000);
        
        //now set it visible
        //main.pack();
        main.setVisible(true);
      
    }
    
}
