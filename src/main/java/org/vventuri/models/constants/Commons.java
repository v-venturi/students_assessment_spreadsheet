package main.java.org.vventuri.models.constants;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.sheets.v4.SheetsScopes;

import java.util.Collections;
import java.util.List;

/**
 * The type Commons.
 */
public class Commons {
    public static final String SPREADSHEET_ID = "1sAmmMvlHU21gJytwR466Wke8pyncKEIyojeWwGhLW48";
    public static final String RANGE = "engenharia_de_software!C4:H27";
    public static final String APPLICATION_NAME = "StudentsSheets";
    public static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
    public static final String TOKENS_DIRECTORY_PATH = "tokens";
    public static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS);
    public static final String CREDENTIALS_FILE_PATH = "/credentials.json";
    public static final Integer RANGE_START = 4;


}
