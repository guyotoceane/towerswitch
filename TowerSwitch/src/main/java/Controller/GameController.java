
package Controller;

import Model.Map;
import Model.Mob;
import Model.Player;
import Model.Tower;
import View.StoreTowerUI;
import View.startUI;
import java.util.ArrayList;
import java.util.Scanner;



public class GameController {
    
    private int turn_max = 15; //tour max
    private int width = 10; //width map
    private int height = 10; //width map
    
    
    private Player player1 = new Player();
    private Map map = new Map(this.width, this.height);
    private StoreTowerUI store_tower_ui= new StoreTowerUI(player1);
    
    private ArrayList<Mob> list_mob = new ArrayList();
    
    public GameController(int turn_max, int width, int height){
        this.turn_max = turn_max;
        this.width = width;
        this.height = height;
        CreationMob();

    }
    
    public void CreationMob(){
        this.list_mob.add(new Mob("test", 10, 5, width, 1, 1456));
    }
    
    public void menu(){
        
        startUI StartUI = new startUI();
        
        //Scanner sc = new Scanner(System.in);   
        int choice_menu = StartUI.getChoice();
        

        if(choice_menu==1){
            System.out.println("je veux etre ici");
            store_tower_ui.viewStore();
            menu();

        }else if(choice_menu==4){

        }else{
            System.out.println("Selection problem, retry");
            menu();
            
        }
        
    }
    
    
    
    
    public void turn(){
        //TURN !!!!!
        for(int turn = 0; turn<turn_max; turn++ ){
            //boucle sur tous les mobs a faire "pour chaque mob"
            for(int m = 0; m<this.list_mob.size(); m++){                                             
                //Toutes les tours
                ArrayList<Tower> towers = this.player1.viewTowers();
                        this.list_mob.get(m).move();
            System.out.println("----------- TURN " + (turn+1) +" ----------");
            System.out.println("HP Mob : "+ this.list_mob.get(0).viewhp());
            System.out.println("x Mob: "+ this.list_mob.get(0).viewX());
            
                //pour chaque tower sur sa ligne
                for(int i = 0; i < towers.size(); i++){
                    if(towers.get(i).viewY() == this.list_mob.get(m).viewY()){                          //toutes les towers sur la meme ligne
                        if(this.list_mob.get(m).viewX() <= towers.get(i).viewDistance()){               //si le mob est a porter
                           this.list_mob.get(m).removeHp(towers.get(i).viewDamage());                   //  alors le mob pert des hp
                        }                       
                        if(towers.get(i).viewX()+1 == this.list_mob.get(m).viewX()){                    //si le mob est devant la tour
                            towers.get(i).removeHp(this.list_mob.get(m).viewDamage());                  //  alors la tour perd des hp
                            System.out.println("tape");                                                                       
                            if(towers.get(i).viewHp()<=0){                                               //si la tower a 0 hp
                                //towers.remove(i);                                     //  alors on la delete
                                System.out.println("Tower destroy");
                            }
                        }
                    }
                }          
                if(this.list_mob.get(m).viewhp()<=0){                                               //si le mob a 0 hp
                    this.list_mob.remove(m);                                                        //  alors on le delete
                    System.out.println("dead");
                }else if(this.list_mob.get(m).viewX() == 1){ 
                     System.out.println("Loose");    
                }
            }
            if(this.list_mob.size()<=0){                                                            //si il n'y a plus de mob alors 
                end("You win !");                                                                   //  alors fin  
            }else{
                menu();                                                                             //sinon continu
            }
        }
    }
    
    public void end(String msg){ 
        System.out.println(msg);
    }
}
