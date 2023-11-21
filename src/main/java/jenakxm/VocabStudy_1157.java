package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class VocabStudy_1157 {
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine().replace("", " ")," ");

        HashMap<String, Integer> strMap = new HashMap<>();

        while (st.hasMoreTokens()) {
            String temp = st.nextToken().toLowerCase();
            if (strMap.containsKey(temp)) {
                strMap = incrementValue(strMap, temp);
            } else {
                strMap.put(temp, 1);
            }
        }

        String maxStr = null;
        int maxValue = 0;
        for (String key : strMap.keySet()) {
            if (maxValue < strMap.get(key)) {
                maxValue = strMap.get(key);
                maxStr = key;
            }
        }
        int count = 0;
        for (int i : strMap.values()) {
            if (maxValue == i) {
                count++;
            }
            if (count >= 2) {
                System.out.println("?");
                return;
            }
        }
        System.out.println(maxStr.toUpperCase());
    }

    public static HashMap<String, Integer> incrementValue(HashMap<String, Integer> map, String mapKey) {
        int mapValue = map.get(mapKey);
        mapValue++;
        map.put(mapKey, mapValue);
        return map;
    }
}
