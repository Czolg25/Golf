package com.example.golf.Main;


public class TestFunctions {
    public boolean testText(String text){
        if(text == null) return false;
        text = text.replace(" ","");
        if(text.equals("")) return false;
        return true;
    }
}
