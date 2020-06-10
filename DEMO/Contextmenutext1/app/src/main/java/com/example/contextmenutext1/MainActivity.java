package com.example.contextmenutext1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView listView;
private String[] manh ={"An","Hieu","Tan","Dang"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.listManh);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(
               this, android.R.layout.simple_list_item_1, manh
       );

       listView.setAdapter(adapter);
       registerForContextMenu(listView);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menutexxt_layout, menu);
        menu.setHeaderTitle("Select Action");
    }

    @Override
    public boolean onContextItemSelected( MenuItem item) {



        switch (item.getItemId()){
            case R.id.menu1 : Toast.makeText(this,"manh xin chao", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2 : Toast.makeText(this,"Hieu xin chao", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
