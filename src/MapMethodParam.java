import java.util.HashMap;
import java.util.Map;

public class MapMethodParam {

    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));

    }

    public static int returnSize(Map<String, String> mapOfStr) {

        return mapOfStr.size();

    }

}