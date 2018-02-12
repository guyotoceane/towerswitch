package Model;

import java.util.ArrayList;



public class StoreTower {
    private ArrayList<Tower> store = new ArrayList();
    private int price[] = {20, 15, 40, 35, 25, 60, 50}; 
    private int damage[] = {30, 30, 50, 45, 35, 50, 60};
    private int hp[] = {30, 30, 50, 45, 35, 50, 60};
    private int distance[] = {3, 3, 5, 4, 3, 5, 6};
    private String name[] = {"tour 1", "tour 2", "tour 3", "tour 4", "tour 5", "tour 6", "tour 7"};
    
    
    
    public StoreTower(){
        
    }
        
    public void createTowers(){
        for(int i = 0; i< name.length; i++){
            store.add(new Tower(this.name[i], this.price[i], this.damage[i], 2, 1, this.price[i], this.distance[i]));
        }
    }
    
    public void createTower(String name, int damage, int hp, int x, int y, int price, int distance){
        store.add(new Tower(name, damage, hp, x, y, price, distance));
    }
    
}

