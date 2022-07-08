package org.vventuri;


import org.vventuri.services.SpreadSheetManipulation;

import java.io.IOException;

public class SpreadSheetApplication {
    public static void main(String[] args) throws IOException {
        SpreadSheetManipulation ssm = new SpreadSheetManipulation();
        ssm.readAndWriteSheet();
    }
}