package com.example.adm.wptbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    int lvl, strg, sprt, tal, agi, hlth, fUsed, iUsed, tUsed, aUsed, vUsed, stats, statsUsed,   //status
            amuletAddHp, amuletAddMp, amuletAddStm,  //amulet
            ring1AddHp, ring1AddStm, ring1Def, ring1AtkRtg, ring1AddMp, //ring1
            ring2AddHp, ring2AddStm, ring2Def, ring2AtkRtg, ring2AddMp, //ring2
            shelHpAdd, shelMpAdd, shelHpBoost, shelMpBoost, //sheltom
            bracDef, bracAtk, bracSpecDiv, //bracelets
            gauntDef, gauntDefAdd,  //gauntlets
            bootsDef, bootsDefAdd, //boots
            wpnAtkpwr1, wpnAtkpwr2, wpnAtkRtg, //weapon
            armorDef, armorDefAdd, //armor
            shieldDef, shieldDefAdd,  //shield
            sp, ep;
    double hp, mp, stm, atkRtg, def, abs, vel, weight,
            amuletMpRecover, amuletHpReg, amuletMpReg, amuletStmReg, //amulet
            ring1HpRecover,ring1Abs, ring1HpReg, ring1MpReg, //ring1
            ring2HpRecover,ring2Abs, ring2HpReg, ring2MpReg, //ring2
            shelHpRegen, shelMpRegen, shelHpRecover, shelMpRecover, //sheltom
            bracSpec, bracCrit, //sheltom
            gauntAbs, gauntAbsAdd, gauntAtkPwr, //gauntlets
            bootsAbs,  bootsAbsAdd, bootsSpd, bootsSpdAdd, //boots
            wpnAtkCrit, wpnAtkBlk, wpnAtkpwrSpec, wpnAtkRtgSpec, wpnAtkCritSpec, //weapon
            armorAbs,  armorAbsAdd, //armor
            shieldAbs, shieldBlk, shieldAbsAdd, shieldBlkAdd, //shield
            pdAtkMin, pdAtkMax;


    EditText lvlText;
    TextView pointsView, hpView, mpView, stmView, weightView;
    RadioGroup rdGroup;
    RadioButton fsBtn;
    Button calcbtn;
    CheckBox chkbox1, chkbox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvlText = findViewById(R.id.levelText);
        pointsView = findViewById(R.id.pointsView);
        hpView = findViewById(R.id.hpView);
        mpView = findViewById(R.id.mpView);
        stmView = findViewById(R.id.stmView);
        weightView = findViewById(R.id.weightView);
        rdGroup = (RadioGroup) findViewById(R.id.radioGroup);
        String points = lvlText.getText().toString();
        calcbtn = (Button) findViewById(R.id.CalculateBtn);
        fsBtn = (RadioButton) findViewById(rdGroup.getCheckedRadioButtonId());
        chkbox1 = (CheckBox) findViewById(R.id.checkBox1);

        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             pointsView.setText("Avaiable points: " + stats);
             hpView.setText("HP: " +  hp);
             mpView.setText("MP: "+ mp);
             stmView.setText("STM: " + stm);
             weightView.setText("weight: " + weight);

             //Log.i("sadhausi","selecionou " + fsBtn);

                }


        });

    }
}
