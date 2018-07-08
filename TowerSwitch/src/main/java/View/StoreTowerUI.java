
package View;

import Model.Player;
import Model.Tower;
import static View.startUI.window;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StoreTowerUI {
    
    private Player player1;
    private ArrayList<Tower> store_tower;
    
    
    public StoreTowerUI(Player player){
        this.player1 = player;
        this.store_tower = player.viewStoreTower().viewTowers(); //pour le joeur, voir son store, voir les tours dans le store
        
    }
     
    public void viewStore(){
        
        String[] [] infos = {};
        
        JPanel tab = new JPanel();
        tab.setLayout(new GridLayout(this.store_tower.size()+1, 4));
        
        tab.add(new JLabel("n'   HP      Damage     Price"));
        
        for(int i =0; i < this.store_tower.size(); i++){
            tab.add(new JLabel("(" + i + ")   " + this.store_tower.get(i).viewHp()+"      " + this.store_tower.get(i).viewDamage()+"         " + this.store_tower.get(i).viewPrice()));
            
        }
        
        JPanel storeTab = new JPanel();
        storeTab.add(tab , BorderLayout . NORTH);
        
        Container cp = startUI.window.getContentPane();
        cp.setVisible(false);
        cp.removeAll();
        
        cp.add(new JLabel("Store :"), BorderLayout.NORTH);
        cp.add ( storeTab , BorderLayout . CENTER );
        cp.add(new JLabel("Store :"), BorderLayout.SOUTH);
        cp.setVisible(true);
        
        
        
       //menu();
        
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
