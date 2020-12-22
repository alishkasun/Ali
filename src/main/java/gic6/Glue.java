package gic6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;


public class Glue {

    static String TEXT = "0123456789qwertyuiopasdfghjklzxcvbnm";
    static Random RND= new Random();

    public static void main(String[] args) {
        createFile("1.txt",createString(100));
        createFile("2.txt",createString(100));
        glueFiles (new String[]{"1.txt","2.txt"},"3.txt");
    }
    public static void glueFiles(String[] names, String distinationName){
        try{
            FileOutputStream fos = new FileOutputStream(distinationName);
            for (String name: names){
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if(i != -1){
                        fos.write(i);
                    }
                }while (i != -1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String createString(int len){
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++){
            sb.append(TEXT.charAt(RND.nextInt(TEXT.length())));
        }
        return sb.toString();
    }

    public static void createFile(String fileName, String text){
        try{
            PrintWriter fos = new PrintWriter(fileName);
            fos.write(text);
            fos.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
