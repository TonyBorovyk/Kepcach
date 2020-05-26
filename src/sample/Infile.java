package sample;

import java.io.FileWriter;
import java.io.IOException;

public class Infile {
    public void Write(String text) {

        try(FileWriter writer = new FileWriter("Розвязок.txt"))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            ex.getMessage();
        }
    }
}
