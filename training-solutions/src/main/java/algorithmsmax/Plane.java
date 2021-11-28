package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    public int getLongestOcean(String map) {
        List<Integer> lengthOfOceans = getLengthOfOceans(map);
        int maxLength = lengthOfOceans.get(0);
        for (Integer length : lengthOfOceans) {
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    //    private List<Integer> getLengthOfOceans(String map) {
//        List<Integer> listOfLengths = new ArrayList<>();
//        int lengthOfOcean = 0;
//        for (Character character: map.toCharArray()) {
//            if (character == '0') {
//                lengthOfOcean++;
//            } else {
//                listOfLengths.add(lengthOfOcean);
//                lengthOfOcean = 0;
//            }
//        }
//        return listOfLengths;
//    }
//    private List<Integer> getLengthOfOceans(String map) {
//        List<Integer> listOfLengths = new ArrayList<>();
//        int lengthOfOcean = 0;
//        for (int i = 0; i < map.toCharArray().length; i++) {
//            if (map.toCharArray()[i] == '0') {
//                lengthOfOcean++;
//            } else {
//                if (i != 0 && map.toCharArray()[i - 1] == '0') {
//                    listOfLengths.add(lengthOfOcean);
//                    lengthOfOcean = 0;
//                }
//            }
//        }
//        return listOfLengths;
//    }
    private List<Integer> getLengthOfOceans(String map) {
        List<Integer> listOfLengths = new ArrayList<>();
        int lengthOfOcean = 0;
        for (int i = 0; i < map.toCharArray().length; i++) {
            if (map.toCharArray()[i] == '0') {
                lengthOfOcean++;
            } else {
                if (i != 0 && map.toCharArray()[i - 1] == '0') {
                    listOfLengths.add(lengthOfOcean);
                    lengthOfOcean = 0;
                }
            }
        }
        return listOfLengths;
    }
}
