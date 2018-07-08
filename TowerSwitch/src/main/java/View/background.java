/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GameController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author oguyot
 */
public class background extends JPanel{
public void paintComponent(Graphics g){
    //x1, y1, width, height
    
    
        try {
            Image img = ImageIO.read(new File("img/fond.jpg"));
            g.drawImage(img, 0, 0, this);
            //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException ex) {
          
        }
  } 
    
}
