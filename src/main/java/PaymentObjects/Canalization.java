package PaymentObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Canalization {
    public final static String name = "Canalization";
    public static double prise;

    static Map canalizationMap = new TreeMap();

    public static Map initMap(){
        canalizationMap.clear();

        canalizationMap.put("name",name);
        canalizationMap.put("prise",prise);

        //System.out.println(canalizationMap);
        return canalizationMap;
    }


}
