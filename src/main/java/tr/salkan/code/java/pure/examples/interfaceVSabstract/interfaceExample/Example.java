package tr.salkan.code.java.pure.examples.interfaceVSabstract.interfaceExample;

import com.itextpdf.text.Document;
import tr.salkan.code.java.pure.examples.interfaceVSabstract.interfaceExample.impl.BussinessServiceImpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example {


    public static void main(String[] args) {

        Document doc = null;
        FileOutputStream file = null;


        BussinessService bussinessService1 = new BussinessServiceImpl();

        doc =  bussinessService1.createPDFFile("pathexample");

        try
        {
            file =     bussinessService1.createWordFile("pathexample");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        bussinessService1.writePDF(doc,"new String");
        bussinessService1.writeWord(file,"new string");

        System.out.println("Accepted file extensions");
        bussinessService1.getAcceptedFileExtensinons().forEach(System.out::println);

    }
}
