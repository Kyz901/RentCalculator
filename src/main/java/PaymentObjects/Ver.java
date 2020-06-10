package PaymentObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Ver {
    public final static String name = "Ver";
    public static double prise;

    static Map verMap = new TreeMap();


    public static Map initMap(){
        verMap.clear();

        verMap.put("name",name);
        verMap.put("prise",prise);

        //System.out.println(verMap);
        return verMap;
    }


}
