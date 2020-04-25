package tr.salkan.code.java.pure.examples.errorVsexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args) {
        File file = new File("D:/ExampleJava.txt");
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            while (fileInputStream.read()!=-1){
                System.out.println(fileInputStream.read());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
