package com.example.cyberclck;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class level_1 extends AppCompatActivity {

    private Toast backToasts;
    private long backPressedTime;
    private Button btn_map, btn_equipment, btn_shop;
    private int count = 10, unit=0;
    private ImageButton zone_fight;
    private TextView text_hp;
    private TextView unit_level1, unit_level2, unit_level3, unit_level4, unit_level5, unit_level6, unit_level7, unit_level8, unit_level9, unit_level10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        btn_map = findViewById(R.id.btn_map);
        btn_shop = findViewById(R.id.btn_shop);
        btn_equipment = findViewById(R.id.btn_equipment);
        zone_fight = findViewById(R.id.zone_fight);
        text_hp = findViewById(R.id.text_hp);
        unit_level1 = findViewById(R.id.unit_level1);
        unit_level2 = findViewById(R.id.unit_level2);
        unit_level3 = findViewById(R.id.unit_level3);
        unit_level4 = findViewById(R.id.unit_level4);
        unit_level5 = findViewById(R.id.unit_level5);
        unit_level6 = findViewById(R.id.unit_level6);
        unit_level7 = findViewById(R.id.unit_level7);
        unit_level8 = findViewById(R.id.unit_level8);
        unit_level9 = findViewById(R.id.unit_level9);
        unit_level10 = findViewById(R.id.unit_level10);

        zone_fight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                show_hp_bar();
                if (count == 0){
                    unit++;
                    victory_level(unit);
                    count = 10;
                    if (unit==10){
                        unit_level1.setBackgroundResource(R.color.black60);
                        unit_level2.setBackgroundResource(R.color.black60);
                        unit_level3.setBackgroundResource(R.color.black60);
                        unit_level4.setBackgroundResource(R.color.black60);
                        unit_level5.setBackgroundResource(R.color.black60);
                        unit_level6.setBackgroundResource(R.color.black60);
                        unit_level7.setBackgroundResource(R.color.black60);
                        unit_level8.setBackgroundResource(R.color.black60);
                        unit_level9.setBackgroundResource(R.color.black60);
                        unit_level10.setBackgroundResource(R.color.black60);
                    }
                }
            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(level_1.this, MapActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
    }
    public void show_hp_bar(){
        String hp;
        hp = String.valueOf(count);
        text_hp.setText(String.format("HP: %s", hp));
    };

    public void victory_level(int unit)
    {
        if (unit==1){
            unit_level1.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==2){
            unit_level2.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==2){
            unit_level2.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==3){
            unit_level3.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==4){
            unit_level4.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==5){
            unit_level5.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==6){
            unit_level6.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==7){
            unit_level7.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==8){
            unit_level8.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==9){
            unit_level9.setBackgroundResource(R.drawable.style_victory_level);
        }
        if (unit==10){
            unit_level10.setBackgroundResource(R.drawable.style_victory_level);
        }
    }

    @Override
    public void onBackPressed(){
        if (backPressedTime+2000>System.currentTimeMillis()){
            backToasts.cancel();
            super.onBackPressed();
            return;
        }
        else{
            backToasts=Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);
            backToasts.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}