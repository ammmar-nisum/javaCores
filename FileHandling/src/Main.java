import java.io.*;

public class Main {
    public static void main(String[] args){
        File file = new File("myFolder");
        file.mkdir();
        file = new File("myFolder/text.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
            bufferedWriter.write("Ammar");
            bufferedWriter.newLine();
            bufferedWriter.write("Shaiq");
            bufferedWriter.newLine();
            bufferedWriter.write("Aoun Ammar");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line;
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
