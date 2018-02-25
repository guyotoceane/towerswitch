
package Controller;

import Model.Map;
import Model.Mob;
import Model.Player;
import Model.Tower;
import View.StoreTowerUI;
import java.util.ArrayList;
import java.util.Scanner;



public class GameController {
    
    private int turn_max = 10; //tour max
    private int width = 10; //width map
    private int height = 10; //width map
    
    
    private Player player1 = new Player();
    private Map map = new Map(this.width, this.height);
    private StoreTowerUI store_tower_ui= new StoreTowerUI(player1);
    
    
    
    public GameController(int turn_max, int width, int height){
        this.turn_max = turn_max;
        this.width = width;
        this.height = height;

    }
    
    public void menu(){
        System.out.println("----------- Choice ----------");
        System.out.println("(1) Shop");
        System.out.println("(4) Next");
        
        Scanner sc = new Scanner(System.in);   
        int choice_menu = sc.nextInt();

        if(choice_menu==1){
            
            store_tower_ui.viewStore();
            
            
            
            menu();

        }else if(choice_menu==4){
            turn();
            
            
            

            menu();    
        }else{
            System.out.println("Selection problem, retry");
            menu();
        }
        
    }
    
    
    
    
    public void turn(){ 
        Mob mob = new Mob("test", 3, 2, width, 1, 1456);
        //this.player1.addTower(new Tower("test", 1, 1, 1, 1, 1456, 2), 1,1);
        
       
        
        //TURN !!!!!
        for(int turn = 0; turn<turn_max; turn++ ){
            System.out.println("----------- TURN " + (turn+1) +" ----------");
            System.out.println("HP Mob : "+ mob.viewhp());
            System.out.println("x Mob: "+ mob.viewX());
            mob.move();
        
            //boucle sur tous les mobs a faire "pour chaque mob"
            
            
            
            
                //Toutes les tours sur la meme ligne
                ArrayList<Tower> towerY = this.player1.returnTowerByY(mob.viewY());

                //pour chaque tour sur sa ligne
                for(int i = 0; i< towerY.size(); i++){
                    if(mob.viewX() <= towerY.get(i).viewDistance()){
                       mob.removeHp(towerY.get(i).viewDamage());
                    }
                }          
        }
    }
    
    
    
    
    
    
    
    
    
}
