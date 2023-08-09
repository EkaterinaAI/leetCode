package src.Practice.Day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBands {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBands(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBands(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBands{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void joinMembers(MusicBands mb1, MusicBands mb2) {
        mb2.members.addAll(mb1.members);

        /*for (String member : mb1.getMembers())
            mb2.getMembers().add(member);*/
        mb1.members.clear();
    }

    public void printMembers() {
        System.out.println(getMembers());
    }
}
