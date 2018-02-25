package Model;



public class Tower {
    private String name;
    private int damage;
    private int hp;
    private int x;
    private int y;
    private int price;
    private int distance;
    
    
    
    public Tower(String name, int damage, int hp, int x, int y, int price, int distance){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.price = price;
        this.x = x;
        this.y = y;
        this.distance = distance; //casse ou elle peut attaquer
    }
    public int viewPrice(){
        return this.price;
    }
    public String viewName(){
        return this.name;
    }
    public int viewDistance(){
        return this.distance;
    }
    public int viewDamage(){
        return this.damage;
    }
    public int viewHp(){
        return this.damage;
    }
    public int viewY(){
        return this.y;
    }
    public void position(int x, int y){
        this.x = x;
        this.y = y;
    }

        
}
