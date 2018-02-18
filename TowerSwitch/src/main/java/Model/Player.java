package Model;

import java.util.ArrayList;


public class Player {
    private String name;
    private ArrayList<Tower> list_tower = new ArrayList();
    
    public void addTower(Tower tower){
        list_tower.add(tower);
    }
    
    public ArrayList<Tower> returnTowerByY(int y){
        
        ArrayList<Tower> towerY = new ArrayList();
        
        for(int i=0; i< list_tower.size(); i++){
            if(this.list_tower.get(i).viewY()== y){
                towerY.add(list_tower.get(i));
            }
        }        
        return towerY;
    }
    
    
    
    
    public Tower viewTower(int x){
        return list_tower.get(x);
    }
    
    
}
