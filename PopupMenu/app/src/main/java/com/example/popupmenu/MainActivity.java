package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu menu = new PopupMenu(MainActivity.this, view);
                menu.inflate(R.menu.items_menu_popup);
                menu.show();

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.setting:
                                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.cart:
                                Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.infor:
                                Toast.makeText(MainActivity.this, "Information", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.mail:
                                Toast.makeText(MainActivity.this, "Mail", Toast.LENGTH_SHORT).show();
                                break;
                        }
                        return false;
                    }
                });
            }
        });
    }
}