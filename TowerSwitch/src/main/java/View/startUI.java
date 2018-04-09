package View;
import javax.swing.*;
import java.awt.Dimension;
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
        window.setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
        window.setVisible ( true );
    }
    
    private void setDim(){
        Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.height = (int)dimension.getHeight();
        this.width  = (int)dimension.getWidth();
    }
}
