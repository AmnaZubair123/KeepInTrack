package com.labsession.keepintrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInEng extends AppCompatActivity {
    EditText uname, pass;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_eng2);
        uname=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        btn=findViewById(R.id.signin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin")){
                    Intent intent = new Intent(getApplicationContext(),Manager_panel_main.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(SignInEng.this, "Invalid information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}