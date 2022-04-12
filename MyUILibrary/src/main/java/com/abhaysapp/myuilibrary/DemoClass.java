package com.abhaysapp.myuilibrary;

import android.content.Context;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DemoClass extends AppCompatActivity {

    TextView textView;

    public DemoClass(Context context){
        setContentView(R.layout.demolayout);
        textView = findViewById(R.id.textView1);
    }

    public void changeText(String text){
        textView.setText(text);
    }

}
