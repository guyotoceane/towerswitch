/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Listener;
import Model.Mob;
import Model.Player;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import static jdk.nashorn.internal.objects.NativeRegExp.test;

/**
 *
 * @author oguyot
 */
public class Windows {
    JFrame jf ;

    public static JLayeredPane LPane =new JLayeredPane();
    
    public static Player player = new Player();
            
    public static ArrayList<Mob> listMob = new ArrayList();


    background bg = new background();
    

    public void game ()

    {
         jf =new JFrame("Tower Switch");
         jf.setSize(1045,626);

         jf.getContentPane().add(LPane);
        

         bg.setBounds(0,0,4000 , 626);

         //grille.setBounds(0,0,2000, 600);
         bg.addMouseListener(new Listener());
        

         LPane.add(bg, new Integer(1));

         //LPane.add(grille, new Integer(2));


         jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

         jf.setVisible(true);

     }
}
