package com.abhaysapp.myuilibrary;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DemoClass extends AppCompatActivity {

    TextView textView;

    public DemoClass(Context context, Activity activity){
        activity.setContentView(R.layout.demolayout);
        textView = activity.findViewById(R.id.textView1);
    }

    public void changeText(String text){
        textView.setText(text);
    }

}
