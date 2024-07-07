package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже !");
        } else if (position == 2) {
            System.out.println("Спокойной ночи.");
        } else {
            System.out.println("Песня не найдена.");
        }
    }

    public static void main(String[] args) {
        Jukebox krokodailGena = new Jukebox();
        Jukebox auntValya = new Jukebox();
        Jukebox unknownArtist = new Jukebox();
        int songOne = 1;
        int songTwo = 2;
        int songThree = 3;
        krokodailGena.music(songOne);
        auntValya.music(songTwo);
        unknownArtist.music(songThree);
    }
}