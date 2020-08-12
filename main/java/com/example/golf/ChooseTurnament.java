package com.example.golf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.golf.Main.Data.Data;
import com.example.golf.Main.TestFunctions;

import org.w3c.dom.Text;

import java.lang.reflect.InvocationTargetException;

public class ChooseTurnament extends AppCompatActivity {
    private Data data = MainActivity.getData();
    private TestFunctions testFunctions = new TestFunctions();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_choose_turnament);
        super.onCreate(savedInstanceState);
    }

    public void onClickToNuberPlayer(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.button2:
                TextView fieldTurnament = view.getRootView().findViewById(R.id.textTurnament);
                String textFieldTurnament = fieldTurnament.getText().toString();
                TextView fieldCourse = view.getRootView().findViewById(R.id.textCourse);
                String textFieldCourse = fieldCourse.getText().toString();
                if(testFunctions.testText(textFieldCourse)&&testFunctions.testText(textFieldTurnament)){
                    data.setCourseName(textFieldCourse);
                    data.setTurnamentName(textFieldTurnament);
                    intent = new Intent(ChooseTurnament.this, NumberPlayer.class);
                }
                break;
        }
        if(intent != null)startActivity(intent);
    }
}
