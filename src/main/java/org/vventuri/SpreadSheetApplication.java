package main.java.org.vventuri;




import main.java.org.vventuri.services.SpreadSheetManipulation;

import java.io.IOException;

/**
 * The type Spread sheet application.
 */
public class SpreadSheetApplication {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        SpreadSheetManipulation ssm = new SpreadSheetManipulation();
        ssm.readAndWriteSheet();
    }
}