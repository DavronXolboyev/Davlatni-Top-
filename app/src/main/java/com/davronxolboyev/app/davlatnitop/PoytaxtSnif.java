package com.davronxolboyev.app.davlatnitop;

public class PoytaxtSnif {

    private final String name;
    private final String quiz1;
    private final String quiz2;
    private final String quiz3;
    private final String quiz4;
    private final int image;

    public PoytaxtSnif(String name, String quiz1, String quiz2, String quiz3, String quiz4, int image) {
        this.name = name;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getQuiz1() {
        return quiz1;
    }

    public String getQuiz2() {
        return quiz2;
    }

    public String getQuiz3() {
        return quiz3;
    }

    public String getQuiz4() {
        return quiz4;
    }

    public int getImage() {
        return image;
    }
}
