package AudioPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AudioController {

    private List<Song> songsLibrary;
    private int id;

    AudioController() {
        songsLibrary = new ArrayList<>();
        id = 1;
    }

    private boolean isSongAlreadyPresent(String songName, String songDuration, String movieName) {
        for (Song currentSongObj: this.songsLibrary) {
            if (currentSongObj.getSongName().equals(songName) && 
            currentSongObj.getSongDuration().equals(songDuration) &&
            currentSongObj.getMovieName().equals(movieName)
            ) {
                return true;
            }
        }
        return false;
    }

    public void addSongIntoLibrary() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter movie name (in which this song present): ");
        String movieName = scn.nextLine();
        System.out.println("Enter song name: ");
        String songName = scn.nextLine();
        System.out.println("Enter song duration:");
        String songDuration = scn.nextLine();
        
        if (isSongAlreadyPresent(songName, songDuration, movieName)) {
            System.out.println("Song already present in the library");
            return;
        }

        Song currentSong = new Song(id++, songDuration, songName, movieName);
        songsLibrary.add(currentSong);
        System.out.println("Inserted into library successfully");
    }

    public void printAllSongsFromLibrary() {
        if (songsLibrary.size() == 0) {
            System.out.println("Audio player is empty");
            return;
        }

        System.out.println("Songs present in an Audio player are: ");
        for (Song currentSongObj: songsLibrary) {
            System.out.println(currentSongObj);
        }
    }

    public void printAskedMovieSongsFromLibrary() {
        if (songsLibrary.size() == 0) {
            System.out.println("No songs were present in database, try inserting few before proceeding further");
            return;
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter movie name:");
        String movieName = scn.nextLine().toLowerCase();

        List<String> allSongs = new ArrayList<>();

        for(Song currentSongObject: songsLibrary) {
            String lowerCurrMovieName = currentSongObject.getMovieName().toLowerCase();
            if (lowerCurrMovieName.equals(movieName)) {
                allSongs.add(currentSongObject.getSongName());
            }
        }

        if (allSongs.size() == 0) {
            System.out.println("No songs were present from this movie in library");
            return;
        }

        System.out.println("Songs from " + movieName + " are:");
        int songId = 1;
        for (String songName: allSongs) {
            System.out.println(songId + ". " + songName);
            songId++;
        }
    }

    private boolean updateSongObjectAccordingly(Song currSongObject) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter new movie name (Leave blank if you don't want to change): ");
        String newMovieName = scn.nextLine();

        System.out.println("Enter new song name (leave blank if you don't want to change): ");
        String newSongName = scn.nextLine();

        System.out.println("Enter song duration (leave blank if you don't want to change): ");
        String newSongDuration = scn.nextLine();

        boolean isAnythingChanged = false;

        if (newMovieName.length() != 0) {
            currSongObject.setMovieName(newMovieName);
            isAnythingChanged = true;
        }

        if (newSongDuration.length() != 0) {
            currSongObject.setSongDuration(newSongDuration);
            isAnythingChanged = true;
        }

        if (newSongName.length() != 0) {
            currSongObject.setSongName(newSongName);
            isAnythingChanged = true;
        }
        return isAnythingChanged;
    }

    private int getIndexOfAppropriateObject(String movieName, String songName) {
        movieName = movieName.toLowerCase();
        songName = songName.toLowerCase();
        int index = 0;

        for (Song currSongObject: songsLibrary) {
            String currMovieName = currSongObject.getMovieName().toLowerCase();
            String currSongName = currSongObject.getSongName().toLowerCase();

            if (currMovieName.equals(movieName) && currSongName.equals(songName)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public void updateSongFromLibaray() {

        if (songsLibrary.size() == 0) {
            System.out.println("No songs were present in database, try inserting few songs into DB first");
            return;
        }

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter movie name (name of the movie which you want to delete):");
        String movieName = scn.nextLine().toLowerCase();
        System.out.println("Enter the name of your song:");
        String songName = scn.nextLine().toLowerCase();

        int position = getIndexOfAppropriateObject(movieName, songName);
        if (position == -1) {
            System.out.println("Song is not present in the library");
            return;
        }

        Song currSongObject = songsLibrary.get(position);
        boolean isAnythingChanged = updateSongObjectAccordingly(currSongObject);
        if (isAnythingChanged) {
            System.out.println("Updated the changes successfully");
        } else {
            System.out.println("No modifications done so far");
        }
    }

    public void deleteSongFromLibrary() {
        if (songsLibrary.size() == 0) {
            System.out.println("No songs were present in database, please try after inserting few songs");
            return;
        }
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter movie name (name of the movie which you want to delete):");
        String movieName = scn.nextLine().toLowerCase();
        System.out.println("Enter the name of your song:");
        String songName = scn.nextLine().toLowerCase();

        int position = getIndexOfAppropriateObject(movieName, songName);
        if (position == -1) {
            System.out.println("Song is not present in the library");
            return;
        }

        System.out.println(songsLibrary.get(position));
        System.out.println("Above song deleted successfully");
        songsLibrary.remove(position);
    }

}
