package tr.salkan.code.java.pure.examples.interfaceVSabstract.interfaceExample;

import com.itextpdf.text.Document;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public interface BussinessService {

    // all abstract class

    void writeWord(FileOutputStream file, String str);

    void writePDF(Document document, String str);

    FileOutputStream createWordFile(String pathName) throws FileNotFoundException;

    Document  createPDFFile(String pathName);

    //default method (JAVA 8+)
    default List<String> getAcceptedFileExtensinons() {

        List<String> listFileExtensions = new ArrayList<>();

        listFileExtensions.add("doc");
        listFileExtensions.add("docx");
        listFileExtensions.add("pdf");

        return listFileExtensions;

    }

}
