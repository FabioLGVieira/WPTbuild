package com.example.adm.wptbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int sp, ep;

    EditText lvlText;
    TextView pointsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvlText = findViewById(R.id.levelText);
        pointsView = findViewById(R.id.pointsView);

        String points = lvlText.getText().toString();

        if (!points.equals("")) {
            int pt = Integer.parseInt(points);
            int point = ((pt - 9) * 5) + ((pt - 79) * 2) + ((pt - 89) * 3) + 25;
            sp = ((pt - 9) / 2) + 2;
            ep = (pt - 59) / 2;
            pointsView.setText("Avaiable points: " + point);
        }

    }
}
