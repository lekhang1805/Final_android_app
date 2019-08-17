package com.hunghd.musicplayer;

public class SongInfo {
    private String BaiHat;
    private String CaSi;
    private String Url;

    public SongInfo() {
    }

    public SongInfo(String songname, String artistname, String songUrl) {
        BaiHat = songname;
        CaSi = artistname;
        Url = songUrl;
    }

    public String getSongname() {
        return BaiHat;
    }

    public void setSongname(String songname) {
        BaiHat = songname;
    }

    public String getArtistname() {
        return CaSi;
    }

    public void setArtistname(String artistname) {
        CaSi = artistname;
    }

    public String getSongUrl() {
        return Url;
    }

    public void setSongUrl(String songUrl) {
        Url = songUrl;
    }
}
