package kr.co.yhw.spinner_20200526.datas;

public class Occupation {


    private String name;
    private int imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Occupation(int imageId) {
        this.imageId = imageId;
    }

    public Occupation(String name) {
        this.name = name;
    }
}
