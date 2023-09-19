package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> hanshinTigersPlayersForEach = new HashMap<>();

        List<String> hanshinTigersPitcher = new ArrayList<>();
        hanshinTigersPitcher.add("村上頌樹");
        hanshinTigersPitcher.add("岩崎優");
        hanshinTigersPitcher.add("伊藤将司");
        hanshinTigersPitcher.add("大竹耕太郎");
        hanshinTigersPlayersForEach.put("阪神タイガースのピッチャー", hanshinTigersPitcher);

        List<String> hanshinTigersCatcher = new ArrayList<>();
        hanshinTigersCatcher.add("梅野隆太郎");
        hanshinTigersCatcher.add("坂本誠志郎");
        hanshinTigersPlayersForEach.put("阪神タイガースのキャッチャー", hanshinTigersCatcher);

        List<String> hanshinTigersInfielder = new ArrayList<>();
        hanshinTigersInfielder.add("木浪聖也");
        hanshinTigersInfielder.add("中野拓夢");
        hanshinTigersInfielder.add("大山悠輔");
        hanshinTigersInfielder.add("佐藤輝明");
        hanshinTigersPlayersForEach.put("阪神タイガースの内野手", hanshinTigersInfielder);

        List<String> hanshinTigersOutfielder = new ArrayList<>();
        hanshinTigersOutfielder.add("近本光司");
        hanshinTigersOutfielder.add("ノイジー");
        hanshinTigersOutfielder.add("森下翔太");
        hanshinTigersPlayersForEach.put("阪神タイガースの外野手", hanshinTigersOutfielder);

        System.out.println("阪神タイガースの選手は" + hanshinTigersPlayersForEach.get("村上頌樹"));


        for (String key : hanshinTigersPlayersForEach.keySet()) {
            String str = hanshinTigersPlayersForEach.get(key).toString();
            System.out.println(key + "の選手は" + str);

        }
    }
}

