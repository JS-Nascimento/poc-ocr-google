package dev.jstec;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;


public class Main {

    public static void main(String[] args) {
        File imageFile = new File("src/main/resources/prolagos.jpg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        instance.setDatapath("src/main/resources/tessdata");
        instance.setLanguage("por");

        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
