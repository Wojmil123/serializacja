import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readFile {
    public static void main(String[] args) {
        Player mario;
        try {
            FileInputStream fileInMario = new FileInputStream("mario.txt");
            ObjectInputStream inMario = new ObjectInputStream(fileInMario);
            mario = (Player) inMario.readObject();
            inMario.close();
            fileInMario.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
