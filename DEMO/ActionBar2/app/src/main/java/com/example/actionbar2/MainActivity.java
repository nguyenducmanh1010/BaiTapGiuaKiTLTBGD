package com.example.actionbar2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
//ActionBar actionBar;
//Menu menu1,menu2,menu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();


        actionBar.setTitle("Manh"); //Thiết lập tiêu đề nếu muốn

       // actionBar.hide(); //Ẩn ActionBar nếu muốn



//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setLogo(R.mipmap.baseline_local_taxi_black_18dp);    //Icon muốn hiện thị
//        actionBar.setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
