package sample0409;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add ("ICE");
        places.add ("SPE");
        places.add ("NEA");
        places.add ("LIS");
        places.add ("YOS");
        
        System.out.println("■Stream forEachによる取得：");
        places.stream().forEach(place -> System.out.println(place));
        
        System.out.println("■「ン」で終わる場所のみ抽出：");
        places.stream()
            .map(place -> place + " の長さ: " + place.length())
            .forEach(place -> System.out.println(place));
        
        System.out.println("■ソート：");
        places.stream()
            .sorted()
            .forEach(place -> System.out.println(place));
        
        List<String> filteredPlaces = places.stream()
                .filter(place -> place.contains("S"))
                .collect(Collectors. toList());
        System.out.println("「ス」を含む場所：" + filteredPlaces);
        
        
            
        // TODO 自動生成されたメソッド・スタブ

    }

}
