package com.example.diogo.bbteeam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.michael.easydialog.EasyDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        RatemyAppDialog.Initialize(this);

    }
}
