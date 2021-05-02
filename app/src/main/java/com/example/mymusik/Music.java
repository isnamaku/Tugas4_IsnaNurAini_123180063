package com.example.mymusik;

public class Music {
    private String id;
    private String judul;
    private String artis;

    private int gambar;

    public Music(String id, String judul, String artis, int gambar) {
        this.id = id;
        this.judul = judul;
        this.artis = artis;
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }
    public String getArtis() {
        return artis;
    }

    public int getGambar(){
        return gambar;
    }
}
