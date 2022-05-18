package com.labsession.keepintrack.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.labsession.keepintrack.Manager_panel_main;
import com.labsession.keepintrack.R;

public class Register_driver extends AppCompatActivity {
    ImageView imghome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_driver);
        imghome=findViewById(R.id.back);
    }

    public void setImghome(ImageView imghome) {
        Intent intent= new Intent(getApplicationContext(), Manager_panel_main.class);
        startActivity(intent);
    }
}