package Model;


public class Mob {
    
    
    private String name;
    private int x;
    private int y;
    private int damage;
    private int price;
    private int hp;
    private int vitesse; //on verra
    
    
    public Mob(String name, int damage, int hp, int x, int y, int price){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.price = price;
        this.x = x;
        this.y = y;
    }
        
    //GET
    public int viewDamage(){
        return this.damage;
    }
    public int viewPrice(){
        return this.price;
    }
    public int viewhp(){
        return this.hp;
    }
    public String viewName(){
        return this.name;
    }
    public int viewX(){
        return this.x;
    }
    public int viewY(){
        return this.y;
    }

    //SET
    public void removeHp(int hp){
        this.hp -= hp;
    }
    public void move(){
        this.x -= 1;
    }
    
    
    //OTHER





}
