package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.smartkartapp.R;

public class Books extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images={R.drawable.meditation,R.drawable.maths,R.drawable.literature,R.drawable.horrorstorybook,R.drawable.firstyearengg,R.drawable.encyclopedia,R.drawable.dsa,R.drawable.music};
    private String[] details={"Algoritmica","Pseudocoding","Web Design","PHP & MySql","From C to C++","Java & Databases","Python","Oracle"};
    private int[] prices={79,69,109,109,229,229,149,249};
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        recyclerView=findViewById(R.id.rvBooks);
        final String sna=getIntent().getStringExtra("NAME");
        final String sph=getIntent().getStringExtra("PHONE");
        final String spa=getIntent().getStringExtra("PASSWORD");
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(images,details,prices,this,sna,sph,spa,"Books");
        recyclerView.setAdapter(adapter);

    }
    public void onBackPressed(){
        final String sna=getIntent().getStringExtra("NAME");
        final String sph=getIntent().getStringExtra("PHONE");
        final String spa=getIntent().getStringExtra("PASSWORD");
        Intent intent=new Intent(Books.this,HomePageActivity.class);
        intent.putExtra("NAME",sna);
        intent.putExtra("PHONE",sph);
        intent.putExtra("PASSWORD",spa);
        intent.putExtra("CALLINGACTIVITY","Division");
        startActivity(intent);
    }


}
