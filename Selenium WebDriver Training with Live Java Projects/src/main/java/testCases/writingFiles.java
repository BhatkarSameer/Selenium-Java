package testCases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingFiles {

    public static void main(String[] args) {

        writeTextFile();
        writeHTMLFile ();

    }

    public static void writeTextFile(){

        File txtFile = new File ("src/main/resources/myTxtFile.txt");
        try {
            FileWriter fileWriter = new FileWriter (txtFile);
            BufferedWriter buffWrite = new BufferedWriter (fileWriter);

            //writing inside a text file
            buffWrite.write ("First line");
            buffWrite.newLine ();
            buffWrite.write ("India");
            buffWrite.newLine ();
            buffWrite.write ("Selenium WebDriver training with Live Java projects");

            //closing buffered writer and FileInputStream
            buffWrite.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

    public static void writeHTMLFile(){

        File htmlFile = new File ("src/main/resources/myHTMLFile.html");
        try {
            FileWriter fileWriter = new FileWriter (htmlFile, false);
            BufferedWriter buffWrite = new BufferedWriter (fileWriter);

            //writing inside a HTML file

            buffWrite.write ("<!DOCTYPE html> <html> <body> <p>I am normal</p> <p style='color:red;'>I am red</p> <p style='color:blue;'>I am blue</p> <p style='font-size:50px;'>I am big</p> <p>Browsers usually indent blockquote elements.</p> <blockquote cite='http://www.worldwildlife.org/who/index.html'>             'For nearly 60 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by more than one million members in the United States and close to five million globally.' </blockquote> </body> </html>");

//            for(int i = 0; i < 10; i++){
//
//                for(int j = 0; j <= i; j++){
//
//                    int number = (int)(Math.random ()*10);
//                    buffWrite.write (number+ ",");
//                }
//                buffWrite.newLine ();
//            }

            //closing buffered writer and FileInputStream
            buffWrite.close ();

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }

}
