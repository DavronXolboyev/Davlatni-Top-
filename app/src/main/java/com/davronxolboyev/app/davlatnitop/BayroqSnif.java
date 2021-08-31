package com.davronxolboyev.app.davlatnitop;


import java.lang.String;

public class BayroqSnif {

    private final String name;
    private final int image1;
    private final int image2;
    private final int image3;
    private final int image4;

    public BayroqSnif(String name, int image1, int image2, int image3, int image4) {
        this.name = name;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
    }

    public String getName() {
        return name;
    }

    public int getImage1() {
        return image1;
    }

    public int getImage2() {
        return image2;
    }

    public int getImage3() {
        return image3;
    }

    public int getImage4() {
        return image4;
    }

}
