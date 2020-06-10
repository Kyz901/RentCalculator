import PaymentObjects.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FileWriter {



    public boolean FileCreate(){
        File data = new File("C://SettForKP");
        try {
            if (data.mkdir()) {
                System.out.println("Directory Created");
                FileWriter.writeToFile("C://SettForKP//WATER_1m3.txt","0");

                FileWriter.writeToFile("C://SettForKP//CANALIZ.txt","0");

                FileWriter.writeToFile("C://SettForKP//GAZ.txt","0");

                FileWriter.writeToFile("C://SettForKP//MUSOR.txt","0");

                FileWriter.writeToFile("C://SettForKP//VER.txt","0");
            } else {
                System.out.println("Directory is not created");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    public static void writeToFile(String filepaths,String text){
        BufferedWriter writer = null;
        try{

            writer = new BufferedWriter(new java.io.FileWriter(filepaths));
            writer.write(text);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static List<Map> priseList(){
        List<Map> priseList = new LinkedList();
        priseList.add(Water.initMap());
        priseList.add(Gas.initMap());
        priseList.add(Ver.initMap());
        priseList.add(Canalization.initMap());
        priseList.add(Rubbish.initMap());
        //System.out.println(priseList);
        return priseList;
    }
    public static boolean writeToJson(String FilePath){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String priseToJson = gson.toJson(priseList());
        writeToFile(FilePath,priseToJson);
        return true;
    }
}
