package tr.salkan.code.java.pure.examples.interfaceVSabstract.abstractExample;

import com.itextpdf.text.Document;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example {

    public static void main(String[] args)  {

        Document doc = null;
        FileOutputStream file = null;

         FileOperationscCls fileOperationscCls = new FileOperationsClsImpl();

         doc = fileOperationscCls.createPDFFile("pathName1");

        try
        {
            file = fileOperationscCls.createWordFile("pathName2");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("error " + e.fillInStackTrace());
        }


        fileOperationscCls.writePDF(doc,"new string");
        fileOperationscCls.writeWord(file,"new string");


    }
}
