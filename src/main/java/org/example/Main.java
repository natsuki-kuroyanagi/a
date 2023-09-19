package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String,List<String>>HanshinTigersPlayersForEach = new HashMap<>();

        List <String>HanshinTigersPitcher= new ArrayList<>();
        HanshinTigersPitcher.add("村上頌樹");
        HanshinTigersPitcher.add("佐々木朗希");
        HanshinTigersPitcher.add("山本由伸");
        HanshinTigersPlayersForEach.put("阪神タイガースのピッチャー",HanshinTigersPitcher);

        List <String>HanshinTigersShortstop= new ArrayList<>();
        HanshinTigersShortstop.add("源田壮亮");
        HanshinTigersShortstop.add("木浪聖也");
        HanshinTigersShortstop.add("坂本勇人");
        HanshinTigersPlayersForEach.put("阪神タイガースのショート",HanshinTigersShortstop);

        List <String>HanshinTigersThirdbaseman= new ArrayList<>();
        HanshinTigersThirdbaseman.add("佐藤輝明");
        HanshinTigersThirdbaseman.add("岡本和真");
        HanshinTigersThirdbaseman.add("村上宗隆");
        HanshinTigersPlayersForEach.put("阪神タイガースのサード",HanshinTigersThirdbaseman);

        System.out.println("阪神タイガースの選手は"+HanshinTigersPlayersForEach.get("村上頌樹"));



        for(String key:HanshinTigersPlayersForEach.keySet()){
            String str = HanshinTigersPlayersForEach.get(key).toString();
            System.out.println(key+"の選手は"+str);

        }
    }
}

