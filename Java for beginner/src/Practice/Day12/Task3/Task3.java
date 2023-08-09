package src.Practice.Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBands mb1 = new MusicBands("1", 2019);
        MusicBands mb2 = new MusicBands("2", 1995);
        MusicBands mb3 = new MusicBands("3", 1990);
        MusicBands mb4 = new MusicBands("4", 1973);
        MusicBands mb5 = new MusicBands("5", 2005);
        MusicBands mb6 = new MusicBands("6", 1997);
        MusicBands mb7 = new MusicBands("7", 2018);
        MusicBands mb8 = new MusicBands("8", 2023);
        MusicBands mb9 = new MusicBands("9", 2001);
        MusicBands mb10 = new MusicBands("10", 1963);

        List<MusicBands> mbList = new ArrayList<>();

        mbList.add(mb1);
        mbList.add(mb2);
        mbList.add(mb3);
        mbList.add(mb4);
        mbList.add(mb5);
        mbList.add(mb6);
        mbList.add(mb7);
        mbList.add(mb8);
        mbList.add(mb9);
        mbList.add(mb10);

        System.out.println(mbList);

        Collections.shuffle(mbList);

        System.out.println(mbList);

        List<MusicBands> mbList2 = new ArrayList<>();
//        for(int i = 0;  i < mbList.size(); i++) {
//            if (mbList.get(i).getYear() > 2000)
//                mbList2.add(mbList.get(i));
//        }

        for(MusicBands band : mbList) {
            if (band.getYear() > 2000)
                mbList2.add(band);
        }

        System.out.println(mbList2);
    }


}
