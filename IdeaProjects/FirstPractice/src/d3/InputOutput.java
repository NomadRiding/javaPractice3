package d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class InputOutput {
    public static void main(String[] args) throws IOException {

        // SCANNER CLASS

//        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        int age;
//
//        do{
//
//        System.out.println("Please write your name: ");
//        name = scanner.nextLine();
//        } while(name.length() <= 3);
//
////        System.out.println("Please write your age");
////        int age = scanner.nextInt();
//
//        //Proper way
//        do {
//            scanner = new Scanner(System.in);
//            System.out.println("Please write your age: ");
//        } while (!scanner.hasNextInt());
//
//            age = scanner.nextInt();
//
//        // Try it with a for loop
////        for(i = 0; i < 1; i++){
////
////        }
//
//
//        System.out.println("I see, your name is " + name);
//        System.out.println("Cool, you're " + age + " years old.");
//        scanner.close();

    //FILE HANDLING

        String filePath = "d3.InputOutput";
        File file = new File("src/d3/file.ext");

        FileWriter fileWriter = new FileWriter(file, true);

        fileWriter.write("This is a line \n");
        fileWriter.write("This is another line \n");
        fileWriter.close();


        Scanner fileScanner = new Scanner(file);
        String str = "";
        while (fileScanner.hasNextInt()){
            str += fileScanner.nextLine() + "\n";
        }
        fileScanner.close();
        System.out.println(str);
    }

}
