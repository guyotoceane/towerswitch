
package Controller;

import Model.Map;
import Model.Mob;
import Model.Player;
import Model.Tower;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        int turn_max = 10; 
        int width = 10;
        
        
        Map map = new Map(width, 5);
        Player player1 = new Player();
        
        
        Mob mob = new Mob("test", 3, 2, width, 1, 1456);
        player1.addTower(new Tower("test", 1, 1, 1, 1, 1456, 2));
        

        for(int turn = 0; turn<=turn_max; turn++ ){
            System.out.println("-----------");
            System.out.println("HP : "+ mob.viewhp());
            System.out.println("x : "+ mob.viewX());
            mob.move();
            
            
            
            
    
        
        
        
        
        
            //boucle sur tous les mobs a faire "pour chaque mob"
            
                //Toutes les tours sur la meme ligne
                ArrayList<Tower> towerY = player1.returnTowerByY(mob.viewY());
                
                
                //pour chaque tour sur sa ligne
                for(int i = 0; i< towerY.size(); i++){
                    if(mob.viewX() <= towerY.get(i).viewDistance()){
                       mob.removeHp(towerY.get(i).viewDamage());
                    }
                }          
        }
        
        
        
        
        
        
        
    }
}
