//https://github.com/nataliedeyonna/FileIO

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Path: directory of the file location
        // 2 types Path: relative path, absolute path

        // Absolute path: C:\Users\achakma\IdeaProjects\FileIO\src\input.txt

        // Practical Scenario
        // Verify if a file exists in a directory? If not create the file.
        // Open a file if exists and write contents.
        // Open a file if exists and read line by line

//        String path = "C://Users//achakma//IdeaProjects//FileIO_Pratice//src//input.txt";
        String file_name = "input.txt";
        File f = new File(file_name);

        try {
        if(f.createNewFile()){
                System.out.println("File is successfully created");
            } else {
                System.out.println("File already exist!");
            }

            // Write to input.txt
//            FileWriter fw = new FileWriter(f);
//            FileWriter fw = new FileWriter(f,true);
//            FileWriter fw = new FileWriter(file_name, true);

//            fw.write("We are Zen-Z!\n");
//            fw.write("\nThis is second appended content\n");
//            fw.write("We are on 11th Week!\n");
//            fw.close();

            FileReader fr = new FileReader(f);

            int val;
//            val = fr.read();
//            System.out.println((char) val);
//
//            val = fr.read();
//            System.out.println((char) val);
//
//            val = fr.read();
//            System.out.println((char) val);

//            while ((val = fr.read()) != -1){
//                System.out.print((char) val);
//            }

//            char[] cbuf = new char[255];
//            val = fr.read(cbuf);
//
//            for (int i = 0; i< cbuf.length; i++)
//                System.out.print(cbuf[i]);

            BufferedReader br = new BufferedReader(fr);

            String str;
//            str = br.readLine();
//            System.out.println(str);
//
//            str = br.readLine();
//            System.out.println(str);
//
//            str = br.readLine();
//            System.out.println(str);

//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }

            double cgp;
            double max = 0;
            String maxName = "";

            // Find the maximum CGPA
            // Find the maximum CGPA
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                String[] info = str.split(" ");

                System.out.println(info[0]);
                System.out.println(info[1]);

                // Java convert string to double
                cgp = Double.parseDouble(info[1]);

                if (cgp > max) {
                    max = cgp;
                    maxName = info[0];
                } else {
                    max = max;
                }
            }

            System.out.println("Maximum CGPA: " + max);
            System.out.println("Student Name: " + maxName);

            fr.close();
            br.close();

        } catch (IOException e) {
            System.out.println("IO Exception happened");
        }

//        // Try-Catch Block
//        try {
//            // Attempt to execute the code
//        } catch () {
//            // Catch the issue: What went wrong in trying to execute the code
//        }

    }
}