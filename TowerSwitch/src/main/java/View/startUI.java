package View;
import Controller.Listener;
import Controller.Start;
import Model.Player;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JLayeredPane;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
/**
 *
 * @author licence
 */
public class startUI extends JLayeredPane implements MouseMotionListener {
    
    private int height;
    private int width;
    private int choice = 4;
    private Player player1 = new Player();
    private StoreTowerUI store_tower_ui= new StoreTowerUI(player1);
    public static JFrame window = new JFrame ( " Tower Switch 2 " );
    public JLabel background;
    public JPanel bg = new JPanel();
    

    
    
    public void start() { 
        setDim();
        window.setSize (1024 , 626);
        JLayeredPane view = new JDesktopPane();
        view.setOpaque(false);
        
       background bg = new background();
       
       
        
        
        //GrilleJeu grille = new GrilleJeu();
        //grille.addMouseListener(new Listener());
        
        //view.add(grille, new Integer(1));
        view.add(bg, new Integer(2));
        window.add(view);
       
        
        
        window.setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        window.setVisible ( true );
    }
    
    private void setDim(){
        Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.height = (int)dimension.getHeight();
        System.out.println(height);
        this.width  = (int)dimension.getWidth();
    }
    
    private JPanel hpUi(int hpNumber){
        JPanel hp = new JPanel();
        JLabel text = new JLabel("HP " + hpNumber);
        hp.add(text);
        
       return hp;
        
        
    }

    
    private void setChoice(int choice){
        this.choice = choice;
    }
    
    public int getChoice(){
        return this.choice;
    }
    
    public void playButton(JPanel jPanel){
        JButton button = new JButton ("Play !");
        jPanel.add(button);
        
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Début du jeu");
                Start.game_controller.turn();
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
        
    }
    
     public void storeButton(JPanel jPanel){
        JButton button = new JButton ("Store");
        jPanel.add(button);
        
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Boutique");
                store_tower_ui.viewStore();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
        
    }
    

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
