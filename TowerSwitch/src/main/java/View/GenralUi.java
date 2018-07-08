package View;


import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;


/**
 *
 * @author oguyot
 */
public class GenralUi {
    Image towerImage;
    Image fireImage;
    
    ArrayList zombies= new ArrayList();
    ArrayList fire = new ArrayList();

    
    public GenralUi(){
        towerImage = new ImageIcon(this.getClass().getResource("img/tower.gif")).getImage();
        fireImage = new ImageIcon(this.getClass().getResource("img/fire.png")).getImage();
        
        zombies.add(new ArrayList<>()); //line 1
        zombies.add(new ArrayList<>()); //line 2
        zombies.add(new ArrayList<>()); //line 3
        zombies.add(new ArrayList<>()); //line 4
        zombies.add(new ArrayList<>()); //line 5
        
        
        fire.add(new ArrayList<>()); //line 1
        fire.add(new ArrayList<>()); //line 2
        fire.add(new ArrayList<>()); //line 3
        fire.add(new ArrayList<>()); //line 4
        fire.add(new ArrayList<>()); //line 5
        
        
    }
    
}
