package org.vventuri.services;

import com.google.api.services.sheets.v4.model.ValueRange;
import org.vventuri.authentication.Authentication;
import org.vventuri.models.entities.Student;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


import static java.util.logging.Logger.*;
import static org.vventuri.models.constants.Commons.RANGE;
import static org.vventuri.models.constants.Commons.SPREADSHEET_ID;

/**
 * The type Spread sheet manipulation.
 */
public class SpreadSheetManipulation {
    Student student = new Student();
    List<List<Object>> values;
    static Logger logger = getLogger("Log Info");

    /**
     * Read and write the sheet.
     *
     * @throws IOException the io exception
     */
    public void readAndWriteSheet() throws IOException {
        logger.info(",,,,,,,,,Starting read the spreadsheet,,,,,,,,,");
        ValueRange response = Authentication.service().spreadsheets().values()
                .get(SPREADSHEET_ID, RANGE)
                .execute();
        values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
            for (int i = 0, valuesSize = values.size(); i < valuesSize; i++) {
                List<Object> row = values.get(i);
                student.setAbsences(Double.parseDouble((String) row.get(0)));
                student.setP1(Double.parseDouble((String) row.get(1)));
                student.setP2(Double.parseDouble((String) row.get(2)));
                student.setP3(Double.parseDouble((String) row.get(3)));

                logger.info("Calculating the grades and the situation of the student..." + (i+1) +"\n " + student.getSituation() );
                ValueRange body = new ValueRange().setMajorDimension("COLUMNS")
                        .setValues(Arrays.asList(Collections.singletonList(student.getSituation()),
                                List.of(student.getGradeForFinalExam())));
                Authentication.service().spreadsheets().values().update(SPREADSHEET_ID,
                                "G" + (4 + i), body)
                        .setValueInputOption("USER_ENTERED")
                        .execute();
            }
            logger.info("End of application, successful update");
        }
    }
}






