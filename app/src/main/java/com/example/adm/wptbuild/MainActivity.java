package com.example.adm.wptbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int lvl, strg, sprt, tal, agi, hlth, stats, sp, ep, additional;
    double hp, mp, stm, atk, def, abs, vel, wheight, pdAtkMin, getPdAtkMax, bootsVel;

    EditText lvlText;
    TextView pointsView, hpView, mpView, stmView, wheightView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkbox = (CheckBox) findViewById(R.id.msBox);

        lvlText = findViewById(R.id.levelText);
        pointsView = findViewById(R.id.pointsView);
        hpView = findViewById(R.id.hpView);
        mpView = findViewById(R.id.mpView);
        stmView = findViewById(R.id.stmView);
        wheightView = findViewById(R.id.wheightView);

        String points = lvlText.getText().toString();


    }
}
