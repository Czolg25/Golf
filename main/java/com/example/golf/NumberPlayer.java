package com.example.golf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NumberPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_player);
    }

    public void onClickChoosePlayer(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.choosePlayer1:
                Log.d("button","1");
                break;
            case R.id.choosePlayer2:
                Log.d("button","2");
                break;
            case R.id.choosePlayer3:
                Log.d("button","3");
                break;
            case R.id.choosePlayer4:
                Log.d("button","4");
                break;
        }
    }
}