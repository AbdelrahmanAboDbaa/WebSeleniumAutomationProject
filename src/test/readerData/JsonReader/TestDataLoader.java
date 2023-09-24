package JsonReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataLoader {

    @DataProvider(name = "JoinAsSpecialistFormData")
    public static Object[][] testJoinAsSpecialistFormData() {
        return provideTestData("src/JsonFiles/TestDataJoinAsSpecialist.json");
    }
    @DataProvider(name = "RegistrationAcademyForm")
    public static Object[][] testRegistrationAcademyFormData() {
        return provideTestData("src/JsonFiles/RegistrationAcademyForm.json");
    }
    @DataProvider(name = "LoginAcademyForm")
    public Object[][] testLoginAcademyFormData() {
        return provideTestData("src/JsonFiles/LoginAcademyForm.json");
    }

    @DataProvider(name = "SuccessLoginAcademyForm")
    public Object[][] SuccessLoginAcademyFormData() {
        return new Object[][] {
                {  "Abod", "Abod1234567890*"}
        };
    }


    @DataProvider(name = "ExistSpecialistNamesToSearch")
    public Object[][] ExistSpecialistNamesToSearch() {
        return new Object[][] {
                {"محمد"}, //Expect a match
        };
    }
    @DataProvider(name = "Non-ExistSpecialistNamesToSearch")
    public Object[][] NonExistSpecialistNamesToSearch() {
        return new Object[][] {
                {"محمد القحطاني"}, //Expect a match
                {"Abdelrahman"},  //Expect no match
                {"Abod"},
        };
    }

    private static Object[][] provideTestData(String jsonFilePath) {
        List<Object[]> testDataList = new ArrayList<>();

        try {
            // Read JSON data from the file
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(jsonFilePath));

            for (Object obj : jsonArray) {
                JSONObject testData = (JSONObject) obj;
                testDataList.add(new Object[]{testData});
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return testDataList.toArray(new Object[0][0]);
    }


}
