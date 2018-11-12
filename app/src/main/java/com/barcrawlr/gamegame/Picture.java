package com.barcrawlr.gamegame;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Picture extends RealmObject {
    // @PrimaryKey
    // private String id;
    private byte[] image;
    private String word;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    /**  public String getId() {
     return id;
     }

     public void setId(String id) {
     this.id = id;
     }
     **/
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
