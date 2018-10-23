package com.codebakery.joan.sigletouchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SingleTouchView stv = new SingleTouchView(this,null);
        setContentView(stv);
    }
}
