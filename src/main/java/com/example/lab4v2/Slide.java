package com.example.lab4v2;

import javafx.scene.image.Image;

public class Slide {
    private String Label1;
    private String Label2;
    private String Label3;
    private String Label4;
    private String Date;
    private String Title;
    private String Image1;
    private String Image2;
    private String Image3;
    private String Image4;


    public Slide(){

    }
    public String getDate(){
        return Date;
    }
    public String getTitle(){
        return Title;
    }
    public String getLabel1(){
        return Label1;
    }
    public String getLabel2(){
        return Label2;
    }
    public String getImage1(){
        return Image1;
    }

    public String getImage2() {
        return Image2;
    }

    public String getImage3() {
        return Image3;
    }

    public String getImage4() {
        return Image4;
    }

    public String getLabel3() {
        return Label3;
    }

    public String getLabel4() {
        return Label4;
    }

    public void setTitle(String title){
        Title=title;
    }

    public void setLabel4(String label4) {
        Label4 = label4;
    }

    public void setLabel3(String label3) {
        Label3 = label3;
    }

    public void setLabel2(String label2){
        Label2=label2;
     }
    public void setLabel1(String label1) {
        Label1 = label1;
    }

    public void setDate(String date) {
        Date = date;
    }
    public void setImage1(String image1){
        Image1=image1;
    }
    public void setImage2(String image2){
        Image2=image2;
    }
    public void setImage3(String image3){
        Image3=image3;
    }
    public void setImage4(String image4){
        Image4=image4;
    }

    public String toString(){
        return "["+Title+","+Date+","+Label1+","+Label2+","+Label3+","+Label4+","+Image1+","+Image2+","+Image3+","+Image4+"]";
    }
}
