package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.Piano;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];
        Instrument instrumento = new Piano();
        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        songPlayer.play(song, instrumento);

    }
}
