package Semana2.Viernes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("D:\\InnovaccionVirtual\\JavaMision\\untitled\\src\\Semana2\\Viernes\\hola.txt");
            fos.write(65);
            fos.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
