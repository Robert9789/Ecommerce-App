package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.smartkartapp.R;

public class AdminHomePage extends AppCompatActivity {
Button addStaff,addStock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);
        addStaff=findViewById(R.id.btn_add_staff);
        addStock=findViewById(R.id.btn_add_stock);
        String ca=getIntent().getStringExtra("CALLINGACTIVITY");
        if(ca.equals("AdminLogin"))
            Toast.makeText(this,"Bine ati venit!",Toast.LENGTH_SHORT).show();
        else if(ca.equals("AddStock"))
            Toast.makeText(this,"Stoc actualizat cu succes!",Toast.LENGTH_LONG).show();
        addStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminHomePage.this,AddStaff.class));
            }
        });
        addStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminHomePage.this, AddStock.class));
            }
        });


    }
    public void onBackPressed(){
        startActivity(new Intent(AdminHomePage.this,AdminLogin.class));
    }
}
