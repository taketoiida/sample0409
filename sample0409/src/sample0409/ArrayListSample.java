package sample0409;

import java.util.List;
import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        
        places.add("Ice");
        places.add("Spe");
        places.add("Nea");
        places.add("Lis");
        places.add("Yos");
        
        String firstItem = places.get(0);
        System.out.println("1番目の要素（置換前）: " + firstItem);
        
        places.set(0,  "Swe");
        System.out.println("1番目の要素（置換後）: " + places.get(0));
        
        System.out.println("2番目の要素（削除前）: " + places.get(1));
        places.remove(1);
        System.out.println("2番目の要素（削除後）: " + places.get(1));
        
        System.out.println("拡張forループによる取得：");
        for (String place : places) {
            System.out.println(place);
        }
        
        System.out.println("forEachとラムダ式による取得：　");
        places.forEach((place) -> System.out.println(place));
        
        int size = places.size();
        System.out.println("リストのサイズ（クリア前）: " + size);
        places.clear();
        System.out.println("リストのサイズ（クリア後）: " + places.size());
        // TODO 自動生成されたメソッド・スタブ

    }

}
