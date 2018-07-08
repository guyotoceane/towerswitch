
package Controller;

import Model.Map;
import Model.Mob;
import Model.Player;
import Model.Tower;
import java.util.ArrayList;
import View.*;


public class Start {
    
    public static GameController game_controller = new GameController(10, 10, 3);
    
    public static void main(String[] args) {
        //startUI StartUI = new startUI();
        //StartUI.start();
        
        Windows window = new Windows();
        window.game();
        
        
    }
}
