package Model;

import java.util.ArrayList;



public class StoreTower {
    private ArrayList<Tower> towers = new ArrayList();
    
    private int price[] =       {20, 15, 40, 35, 25, 60, 50}; 
    private int damage[] =      {30, 2, 50, 1, 75, 80, 90};
    private int hp[] =          {40, 1, 60, 80, 85, 90, 100};
    private int distance[] =    {3, 3, 5, 4, 3, 5, 6};
    private String name[] = {"tour 1", "tour 2", "tour 3", "tour 4", "tour 5", "tour 6", "tour 7"};
    
    
    
    public StoreTower(){
        createTowers();
        
        
    }
        
    //Create Many Towers
    public void createTowers(){
        for(int i = 0; i< name.length; i++){
            towers.add(new Tower(this.name[i], this.damage[i], this.hp[i], 2, 1, this.price[i], this.distance[i]));
        }
    }
    
    
    //Create 1 tower
    public void createTower(String name, int damage, int hp, int x, int y, int price, int distance){
        towers.add(new Tower(name, damage, hp, x, y, price, distance));
    }
    
    public ArrayList<Tower> viewTowers(){
        return this.towers;
    }
    

}

