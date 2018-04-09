package View;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/**
 *
 * @author licence
 */
public class startUI {
    
    private int height;
    private int width;
    
    
    public void start() {
        JFrame window = new JFrame ( " Tower Switch " );
        setDim();
        window.setSize (this.width , this.height);
        window.add ( new JLabel("Tower Switch"), BorderLayout . NORTH );
        window.add ( menuUi(), BorderLayout . CENTER );
        window.setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        window.setVisible ( true );
    }
    
    private void setDim(){
        Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.height = (int)dimension.getHeight();
        this.width  = (int)dimension.getWidth();
    }
    
    private JPanel hpUi(int hpNumber){
        JPanel hp = new JPanel();
        JLabel text = new JLabel("HP " + hpNumber);
        hp.add(text);
        
       return hp;
        
        
    }
    
    private JPanel menuUi(){
        JPanel menu = new JPanel();
        menu. setLayout (new GridLayout(2,1));
        
        
        JPanel play = new JPanel();
        play.add(new JButton ("Play !"));
        
        JPanel shop = new JPanel();
        play.add(new JButton ("Shop"));
        
        menu.add(play);
        menu.add(shop);
        
      
        
        return menu;
    }
}
