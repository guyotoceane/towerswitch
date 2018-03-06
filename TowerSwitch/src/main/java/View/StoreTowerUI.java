
package View;

import Model.Player;
import Model.Tower;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreTowerUI {
    
    private Player player1;
    private ArrayList<Tower> store_tower;
    
    
    public StoreTowerUI(Player player){
        this.player1 = player;
        this.store_tower = player.viewStoreTower().viewTowers(); //pour le joeur, voir son store, voir les tours dans le store
    }
     
    public void viewStore(){
        System.out.println("SHOP : ");
        
        System.out.println("n'   HP      Damage     Price");
        
        for(int i =0; i < this.store_tower.size(); i++){
            System.out.println("(" + i + ")   " + this.store_tower.get(i).viewHp()+"      " + this.store_tower.get(i).viewDamage()+"         " + this.store_tower.get(i).viewPrice());
 
        }
        
       menu();
        
    }
    
    
    //menu pour ajouter une tour
    public void menu(){
        System.out.println("n' to buy ?");
        Scanner sc = new Scanner(System.in);   
        int choice_menu = sc.nextInt();

        
        for(int i =0; i < store_tower.size(); i++){
            if(choice_menu==i){ 
                System.out.println("x ?");
                Scanner scx = new Scanner(System.in);   
                int x = scx.nextInt();
                System.out.println("y ?");
                Scanner scy = new Scanner(System.in);   
                int y = scy.nextInt();
                
                
                System.out.println(this.player1.addTower(store_tower.get(i), x, y));
                    

                
                System.out.println("GOLD : " + this.player1.viewGold());
                
                

            }
        }
    }
}
