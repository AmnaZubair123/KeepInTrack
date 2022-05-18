package com.labsession.keepintrack.ui.order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.labsession.keepintrack.R;

public class Order_main extends AppCompatActivity {
    Button btn,btnd1,btnd2,btnd3,btnd4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_main);
        btn=findViewById(R.id.btn_add);
        btnd1=findViewById(R.id.details1);
        btnd2=findViewById(R.id.details2);
        btnd3=findViewById(R.id.details3);
        btnd4=findViewById(R.id.details4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Order_adding.class);
                startActivity(intent);
            }
        });

    }
    public void moredetails(View view){
        Intent intent=new Intent(getApplicationContext(),OrderDetails.class);
        startActivity(intent);
    }
}