/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mob;
import Model.Player;
import View.Tower;
import View.Windows;
import static View.Windows.player;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Math.ceil;
import static java.lang.Math.round;
import javax.swing.JOptionPane;

/**
 *
 * @author oguyot
 */
public class Listener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getPoint());
        
        //Graphic towerUI
        Tower towerUI = new Tower();
        
        
        towerUI.setOpaque(false);
        
        int nbX = (int) ceil((e.getX()-265)/69);
        
        System.out.println(nbX);
        
        int nbY = (int) ceil((e.getY()-79)/81);
        
        System.out.println(nbY);

        Model.Tower tower = new Model.Tower("tour 1", 30, 40, nbX, nbY, 20, 3);
        
        String response = Windows.player.addTower(tower, nbX, nbY);
        
        if(response.equals("Tower addded")){
            towerUI.setBounds((int) (69*nbX)+265,(79*nbY)+80,69 , 80);
            Windows.LPane.add(towerUI, new Integer(2));
            
            Windows.listMob.add(new Mob("zombi", 10, 5, (69*9)+265, (79*nbY)+80, 1456));
            
        } else{
           JOptionPane.showMessageDialog(null,"Vous n'avez pas assez d'argent ...");

        }
        
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
