
package Controller;

import Model.Map;
import Model.Mob;
import Model.Player;
import Model.Tower;
import java.util.ArrayList;
import View.*;
import javax.swing.*;

public class Start {
    public static void main(String[] args) {
        //GameController game_controller = new GameController(10, 10, 3);
        //game_controller.turn();
        startUI StartUI = new startUI();
        StartUI.start();
        
    }
}
