package com.labsession.keepintrack;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread td= new Thread(){
            public void run()
            {
                try {
                    sleep(5000);

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }

                finally {
                    Intent it= new Intent(MainActivity.this,Language_selection.class);
                    startActivity(it);
                }
            }
        }; td.start();
    }
}