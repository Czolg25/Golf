package com.example.golf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.golf.Main.Data.Data;
import com.example.golf.Main.TestFunctions;

public class MainActivity extends AppCompatActivity {
    private static Data data = new Data();

    public static Data getData() {
        return data;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToChooseTurnament(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.button:
                intent = new Intent(MainActivity.this,ChooseTurnament.class);
                break;
        }
        startActivity(intent);
    }
}