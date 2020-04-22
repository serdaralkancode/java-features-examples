package tr.salkan.code.java.pure.examples.interfaceVSabstract.abstractExample;

import com.itextpdf.text.Document;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOperationsClsImpl extends FileOperationscCls  {


    @Override
    public void writeWord(FileOutputStream fileOutputStream,String str) {

        // New context to word file code
        System.out.println("New context to word file code");
    }

    @Override
    public void writePDF(Document document, String str) {

        // New context to pdf file code
        System.out.println("New context to pdf file code");

    }

    @Override
    public FileOutputStream createWordFile(String pathName) throws FileNotFoundException {
        return super.createWordFile(pathName);
    }

    @Override
    public Document createPDFFile(String pathName) {
        return super.createPDFFile(pathName);
    }

    // not need getFileCreatedDate(), getFileSizeMegaBytes() override
}
