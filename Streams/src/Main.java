import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main{
    public static void main(String[] args){
        Path source = Paths.get("\\Users\\muhammadammar\\Desktop\\practice\\Streams\\src\\example.txt");
        Path dest = Paths.get("\\Users\\muhammadammar\\Desktop\\practice\\Streams\\src\\copy.txt");
        try {
            Files.copy(source,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}