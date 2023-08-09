package src.Practice.Day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("1",1));
        members1.add(new MusicArtist("1",1));

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("2",2));
        members2.add(new MusicArtist("2",2));

        MusicBands mb1 = new MusicBands("1", 2005, members1);
        MusicBands mb2 = new MusicBands("2", 1996, members2);

        mb1.printMembers();
        mb2.printMembers();

        MusicBands.joinMembers(mb1, mb2);

        mb1.printMembers();
        mb2.printMembers();
    }
}
