package com.example.mymusik;

import java.util.ArrayList;

public class DataMusic {
    public static ArrayList<Music> dummyMusic() {
        ArrayList<Music> listMusic = new ArrayList<>();

        listMusic.add(
                new Music(
                        "1",
                        "Pamit",
                        "Tulus",
                        R.drawable.pamit
                )
        );
        listMusic.add(
                new Music(
                        "2",
                        "Monokrom",
                        "Tulus",
                        R.drawable.monokrom
                )
        );
        listMusic.add(
                new Music(
                        "3",
                        "Pergilah Kasih",
                        "Crisye",
                        R.drawable.crisye
                )
        );
        listMusic.add(
                new Music(
                        "4",
                        "Bintang di Surga",
                        "Peterpan",
                        R.drawable.peterpab
                )
        );

        return listMusic;
    }

    public static Music getDummyDetailMusic(String id) {
        ArrayList<Music> listMusic = dummyMusic();
        Music music = null;

        for (int i = 0; i < listMusic.size(); i++) {
            if (listMusic.get(i).getId().equals(id)) {
                music = listMusic.get(i);
            }
        }

        return music;
    }

}
