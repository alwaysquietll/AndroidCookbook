package com.jack.sendemail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "Main";
    private Button emailButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailButton = (Button)findViewById(R.id.emailButton);
        emailButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == emailButton) {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setType("text/html");
            emailIntent.putExtra(Intent.EXTRA_TITLE, "My Title");
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My Subject");

            emailIntent.putExtra(Intent.EXTRA_TEXT,
                    getString(R.string.my_text));
            startActivity(emailIntent);
        }
    }
}
