package PaymentObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Water {
    public final static String name = "Water";
    public static double prise;

    static Map waterMap = new TreeMap();

    public static Map initMap(){
        waterMap.clear();

        waterMap.put("name",name);
        waterMap.put("prise",prise);

        //System.out.println(waterMap);
        return waterMap;
    }
}
