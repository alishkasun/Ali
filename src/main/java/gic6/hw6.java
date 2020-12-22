package gic6;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class hw6 {
    static String TEXT = "0123456789qwertyuiopasdfghjklzxcvbnm";
    static Random RND = new Random();

    public static void main(String[] args) {
        createFile("1.txt", createString(51));
        createFile("2.txt", createString(99));
    }

    public static String createString(int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(TEXT.charAt(RND.nextInt(TEXT.length())));
        }
        return sb.toString();
    }

    public static void createFile(String fileName, String text) {
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.write(text);
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
