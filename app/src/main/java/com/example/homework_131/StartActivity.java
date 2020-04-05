package com.example.homework_131;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    private ImageView logoImg;
    private TextView startHeadTxt;
    private TextView author;
    private EditText nameEdtx;
    private EditText ageEdtx;
    private Button saveBtn;
    private Button pressureBtn;
    private Button vitStatBtn;
    private static final String TAG = "ПОЛЬЗОВАТЕЛЕМ НАЖАТА ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        init();
        btnListen();
    }

    private void init() {
        logoImg = findViewById(R.id.logoImg);
        startHeadTxt = findViewById(R.id.startHeadTxt);
        nameEdtx = findViewById(R.id.nameEdtx);
        ageEdtx = findViewById(R.id.ageEdix);
        saveBtn = findViewById(R.id.saveBtn);
        pressureBtn = findViewById(R.id.pressureBtn);
        vitStatBtn = findViewById(R.id.vitStatBtn);
        author = findViewById(R. id. authorTxt);
    }

    private void btnListen() {

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "кнопка сохранения");
                String name = nameEdtx.getText().toString();
                String age = ageEdtx.getText().toString();
                User user = new User(name, Integer.parseInt(age));
                try {
                    int ageInt = Integer.parseInt(age);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(StartActivity.this, R.string.numExcMess, Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(StartActivity.this, R.string.saveMess, Toast.LENGTH_SHORT).show();


                pressureBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(TAG, "кнопка перехода к экрану давления");
                        Intent intent = new Intent(StartActivity.this, PressureActivity.class);
                        startActivity(intent);
                    }
                });

                vitStatBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(TAG, "кнопка перехода к экрану жизненных показателей");
                        Intent intent = new Intent(StartActivity.this, VitStatActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
