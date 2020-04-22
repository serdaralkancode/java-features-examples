package tr.salkan.code.java.pure.examples.interfaceVSabstract.abstractExample;

import com.itextpdf.text.Document;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;

public abstract class FileOperationscCls {

    /*
            Important rules for abstract methods:

            Any class that contains one or more abstract methods must also be declared abstract
            The following are various illegal combinations of other modifiers for methods
            with respect to abstract modifier :

                final
                abstract native
                abstract synchronized
                abstract static
                abstract private
                abstract strictfp

     */


    public abstract void writeWord(FileOutputStream fileOutputStream,String str);

    public abstract void writePDF(Document document, String str);

    public FileOutputStream createWordFile(String pathName) throws FileNotFoundException {

        // create word file code and return file
        // FileOutputStream

        System.out.println("FileOperationscCls createWordFile : " + pathName);

        return new FileOutputStream(new File(pathName));
    }

    public Document  createPDFFile(String pathName)
    {
        System.out.println("FileOperationscCls createPDFFile : " + pathName);
        Document document = new Document();
        // create PDF file code and return file

        return document;
    }

    //concrete method
    public LocalDate getFileCreatedDate (File file)
    {
        // get file
        // get file created time

        return LocalDate.now();
    }

    //concrete method
    public String getFileSizeMegaBytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";
    }
}