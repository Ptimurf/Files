import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.DataOutputStream;

/*
AmigoOutputStream
*/

public class FileReader{
    public static void main(String[] args) {
        File originalFile = new File("C:\\Users\\Tim\\Desktop\\сериализация\\1.txt");

//объект-директория
        File folder = originalFile.getParentFile();

//печать списка файлов на экран
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
        }
    }
}
