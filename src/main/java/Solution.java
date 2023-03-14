import java.util.ArrayList;

public class Solution {
    public int romanToInt (String s){
        int result = 0;
        ArrayList <String> array = new ArrayList<>();
        for (int i=0; i<s.length(); i++){
            array.add(String.valueOf(s.charAt(i)));
            switch (array.get(i)) {
                case "I":
                    array.set(i, "1");
                    break;
                case "V":
                    array.set(i, "5");
                    break;
                case "X":
                    array.set(i, "10");
                    break;
                case "L":
                    array.set(i, "50");
                    break;
                case "C":
                    array.set(i, "100");
                    break;
                case "D":
                    array.set(i, "500");
                    break;
                case "M":
                    array.set(i, "1000");
                    break;
            }
        }
        ArrayList <Integer> arrayConverted = new ArrayList<>();
        for (String value : array) {
            arrayConverted.add(Integer.valueOf(value));
        }
        for (int i=1; i<arrayConverted.size(); i++){
            if(arrayConverted.get(i) > arrayConverted.get(i-1)){
                int newNumber = arrayConverted.get(i) - arrayConverted.get(i-1);
                arrayConverted.set(i, newNumber);
                arrayConverted.remove(i-1);
            }
        }
        for (Integer integer : arrayConverted) {
            result += integer;
        }
        return result;
    }
}
