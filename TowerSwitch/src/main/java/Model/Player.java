package Model;

import java.util.ArrayList;


public class Player {
    private String name;
    private ArrayList<Tower> list_tower = new ArrayList();
    private StoreTower store_tower = new StoreTower();
    private int gold = 50;
    
    
    
    public Player(){
        
    }
    
    public int viewGold(){
        return this.gold;
    }
    
    public String addTower(Tower tower, int x, int y){
        //add tower on map with x and y
        
        if(tower.viewPrice() <= this.gold){
            tower.position(x, y);
            list_tower.add(tower);
            this.gold-= tower.viewPrice();
            return "Tower addded";
        }else{
            return "No money";
        }
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
    
    public ArrayList<Tower> returnTowerByYAndTower(ArrayList<Tower> towers, int y){
        ArrayList<Tower> towerY = new ArrayList();
        
        for(int i=0; i< towers.size(); i++){
            if(towers.get(i).viewY()== y){
                towerY.add(towers.get(i));
            }
        } 
        return towerY;
    }
    
    public Tower viewTower(int x){
        return list_tower.get(x);
    }
    public ArrayList<Tower> viewTowers(){
        return list_tower;
    }
    
    public StoreTower viewStoreTower(){
        return this.store_tower;
    }



}
