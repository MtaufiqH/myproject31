package com.admin.taufiq.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookie(View v) {
        //changeImage Source
        ImageView image = (ImageView) findViewById(R.id.imageBeforeEat);
        image.setImageResource(R.drawable.after_cookie);

        //change text
        TextView text = (TextView) findViewById(R.id.hungryText);
        text.setText("I'm so full");
    }


}
