import java.io.Serial;
import java.io.Serializable;
public class Player implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String leftArm;
    private String rightArm;
    private int hp;
    private int level;

    Player(String name, int hp, int level) {
        this.name = name;
        this.hp = hp;
        this.level = level;
    }

    public void useLeftArm(String item){
        this.leftArm = item;
    }

    public void useRightArm(String item){
        this.rightArm = item;
    }

    @Override
    public String toString(){
        return "name: " + this.name + "\r\nhp: " + this.hp + "\r\nlevel: " + this.level + "\r\nright arm: " + this.rightArm + "\r\nleft arm: " + this.leftArm;
    }
}
