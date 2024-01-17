package c;

import java.io.*;
import java.util.Scanner;

public class BasicFileOperation {

    public static void main(String[] args) throws IOException {
        //Read && Write Code
        File file = new File("C:\\Users\\baps\\IdeaProjects\\DSA\\src\\c\\sample.txt");

        FileWriter writer = new FileWriter(file);

        writer.write("Hello How are you?");
        writer.close();

        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            System.out.println(line);
        }

        //Code for copy
        copy("C:\\Users\\baps\\IdeaProjects\\DSA\\src\\c\\sample.txt","C:\\Users\\baps\\IdeaProjects\\DSA\\src\\c\\sample2.txt");
    }

    public static  void copy(String file1,String file2) throws IOException {

        File f1 = new File(file1);
        File f2 = new File(file2);

        FileInputStream inputStream = new FileInputStream(f1);
        FileOutputStream outputStream = new FileOutputStream(f2);

        byte [] buffer = inputStream.readAllBytes();

        outputStream.write(buffer);

        inputStream.close();
        outputStream.close();

    }

}
