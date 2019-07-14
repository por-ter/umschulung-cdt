package javaquiz;

public class Player {
    
    private String name;
    private int points;
    
    public Player(){
        
    }
    
    public Player(String name, int points){
        this.name = name;
        this.points = points;
    }
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(int points){
        this.points = points;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    
    
    

}
