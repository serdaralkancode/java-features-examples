package tr.salkan.code.java.pure.examples.interfaceVSabstract.interfaceExample.impl;

import com.itextpdf.text.Document;
import tr.salkan.code.java.pure.examples.interfaceVSabstract.interfaceExample.BussinessService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BussinessServiceImpl implements BussinessService {


    @Override
    public void writeWord(FileOutputStream file,String str) {

        System.out.println("writeWord code str : " + str);
    }

    @Override
    public void writePDF(Document document, String str) {

        System.out.println("writePDF code str : " + str);
    }

    @Override
    public FileOutputStream createWordFile(String pathName) throws FileNotFoundException {

        System.out.println("createWordFile pathname : " + pathName);

        return new FileOutputStream(new File(pathName));
    }

    @Override
    public Document createPDFFile(String pathName) {

        System.out.println("createPDFFile pathname : " + pathName);

        Document document = new Document();

        return document;
    }
}
