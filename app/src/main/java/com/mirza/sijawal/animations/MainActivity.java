package com.mirza.sijawal.animations;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    static  int count=1;
    ImageView one;
    ImageView on;
    public void fade(View view)
    {

    //ImageView one=(ImageView) findViewById(R.id.imageView);
     //   ImageView on=(ImageView) findViewById(R.id.imageView2);
        if(count==1)
        {
            one.animate().translationXBy(1000f).setDuration(2000);
            on.animate().translationYBy(800f).setDuration(2000);
            count=0;
        }
        else
        {
            one.animate().translationX(-1000f).setDuration(2000);
            on.animate().translationY(-1000f).setDuration(2000);
            count=1;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(ImageView) findViewById(R.id.imageView);
        one.setTranslationX(1000f);
        on=(ImageView) findViewById(R.id.imageView2);
        on.setTranslationY(1000f);
    }
}
