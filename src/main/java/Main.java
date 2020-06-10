import PaymentObjects.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        final String settingPath = "D://Igor/Igor Project/eclipse/RentCalculator/RentCalculatorModulee/src/main/resources/RentCalculatorSettings.json";
        FileReader.parseMapToVars(settingPath);
        FileWriter.writeToJson(settingPath);
        // Frame.constructFrame();


    }
}
