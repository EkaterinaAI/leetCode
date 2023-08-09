package src.Practice.Day12.Task3;

public class MusicArtist {
    private String nameArtist;
    private int ageArtist;

    public MusicArtist(String nameArtist, int ageArtist) {
        this.nameArtist = nameArtist;
        this.ageArtist = ageArtist;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public int getAgeArtist() {
        return ageArtist;
    }

    public void setAgeArtist(int ageArtist) {
        this.ageArtist = ageArtist;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "nameArtist='" + nameArtist + '\'' +
                ", ageArtist=" + ageArtist +
                '}';
    }
}
