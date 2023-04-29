import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Player mario = new Player("Mario", 200, 15);
        Player luigi = new Player("Luigi", 100, 1);
        setPlayer(mario, "sword", "shield");
        setPlayer(luigi, "stick", "");
        System.out.println(mario);
        System.out.println(luigi);
        serializePlayer(mario, "mario.txt");
        serializePlayer(luigi, "luigi.txt");
    }

    private static void setPlayer(Player player, String right, String left){
        player.useRightArm(right);
        player.useLeftArm(left);
    }

    private static void serializePlayer(Player player, String fileName){
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(player);
            out.close();
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
