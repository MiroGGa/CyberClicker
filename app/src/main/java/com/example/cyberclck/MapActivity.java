package com.example.cyberclck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    Button btn_map_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        btn_map_back = findViewById(R.id.btn_map_back);
        btn_map_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MapActivity.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

        TextView text_level_id_1 = (TextView) findViewById(R.id.text_level_id_1);
        text_level_id_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent  = new Intent(MapActivity.this, level_1.class);
                    startActivity(intent); finish();
                }catch (Exception e){

                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        try {
            Intent intent = new Intent(MapActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {

        }
    }
}