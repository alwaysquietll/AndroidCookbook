package com.jack.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView v = (TextView) findViewById(R.id.FontView);
        Typeface t = Typeface.createFromAsset(getAssets(),
                "fonts/Montserrat-Regular.ttf");
        v.setTypeface(t, Typeface.BOLD_ITALIC);
    }
}
