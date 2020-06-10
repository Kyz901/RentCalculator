import PaymentObjects.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.DoubleBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class FileReader {



    public static String readFromFile(String path) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines( Paths.get(path), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public static List<Map> readFromJsonToMap(String filePath){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Map> jsonMap;
        String json = readFromFile(filePath);
        return jsonMap = gson.fromJson(json, List.class);
    }

    public static void parseMapToVars(String filePath){

        List<Map> priseMap= readFromJsonToMap(filePath);
        Water.prise = (Double) priseMap.get(0).get("prise");
        Gas.prise = (Double) priseMap.get(1).get("prise");
        Ver.prise = (Double) priseMap.get(2).get("prise");
        Canalization.prise = (Double) priseMap.get(3).get("prise");
        Rubbish.prise = (Double) priseMap.get(4).get("prise");
//        for(int i = 0; i<priseMap.size();i++) {
//
//
//
//
//            Set<String> set = priseMap.get(i).keySet();
//            for (String keys : set) {
//                System.out.println(keys + " " + priseMap.get(i).get(keys));
//            }
//
//
//        }

    }


}
