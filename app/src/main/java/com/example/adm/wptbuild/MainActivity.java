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

public class MainActivity extends AppCompatActivity {

    private int lvl, strg, sprt, tal, agi, hlth, fUsed, iUsed, tUsed, aUsed, vUsed, stats, statsUsed,   //status
            amuletAddHp, amuletAddMp, amuletAddStm,  //amulet
            ring1AddHp, ring1AddStm, ring1Def, ring1AtkRtg, ring1AddMp, ring1StmMix, //ring1
            ring2AddHp, ring2AddStm, ring2Def, ring2AtkRtg, ring2AddMp, ring2StmMix, //ring2
            shelHpAdd, shelMpAdd, shelHpBoost, shelMpBoost, shelDefMix, shelMinMix, shelMaxMix, //sheltom
            bracDef, bracAtk, bracSpecDiv, bracHpMix, bracMpMix, bracStmMix, //bracelets
            gauntDef, gauntDefAdd, gauntHpMix, gauntMpMix, gauntStmMix, //gauntlets
            bootsDef, bootsDefAdd, bootsHpMix, bootsMpMix, bootsStmMix, //boots
            wpnAtkpwr1, wpnAtkpwr2, wpnAtkRtg, wpnHpMix, wpnMpMix, //weapon
            armorDef, armorDefAdd, armorHpMix, armorMpMix, //armor
            shieldDef, shieldDefAdd, shieldHpMix, shieldMpMix, orbStmMix, //shield
            sp, ep, addHp, addStm, addMp;
    private double hp, mp, stm, atkRtg, def, abs, vel, weight,
            amuletMpRecover, amuletHpReg, amuletMpReg, amuletStmReg, //amulet
            ring1HpRecover, ring1Abs, ring1HpReg, ring1MpReg, //ring1
            ring2HpRecover, ring2Abs, ring2HpReg, ring2MpReg, //ring2
            shelHpRegen, shelMpRegen, shelHpRecover, shelMpRecover, //sheltom
            bracSpec, bracCrit, //sheltom
            gauntAbs, gauntAbsAdd, gauntAtkPwr, //gauntlets
            bootsAbs, bootsAbsAdd, bootsSpd, bootsSpdAdd, //boots
            wpnAtkCrit, wpnAtkBlk, wpnAtkpwrSpec, wpnAtkRtgSpec, wpnAtkCritSpec, //weapon
            armorAbs, armorAbsAdd, //armor
            shieldAbs, shieldBlk, shieldAbsAdd, shieldBlkAdd, //shield
            pdAtkMin, pdAtkMax;

    EditText lvlText, strgtxt, sprttxt, taltxt, agitxt, healthtxt;
    TextView pointsView;
    Button calcbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvlText = (EditText) findViewById(R.id.levelText);
        pointsView = findViewById(R.id.pointsView);
        strgtxt = (EditText) findViewById(R.id.strgTxt);
        sprttxt = (EditText) findViewById(R.id.sprtText);
        taltxt = (EditText) findViewById(R.id.talText);
        agitxt = (EditText) findViewById(R.id.agiText);
        healthtxt = (EditText) findViewById(R.id.healthText);
        calcbtn = (Button) findViewById(R.id.CalculateBtn);



        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Classes teste = new Classes();
                teste.setLvl(Integer.parseInt(lvlText.getText().toString()));
                teste.setF(Integer.parseInt(strgtxt.getText().toString()));
                teste.setI(Integer.parseInt(sprttxt.getText().toString()));
                teste.setT(Integer.parseInt(taltxt.getText().toString()));
                teste.setA(Integer.parseInt(agitxt.getText().toString()));
                teste.setV(Integer.parseInt(healthtxt.getText().toString()));


                String texto = "your lvl: " + teste.getLvl() +
                        "\nf " + teste.getF() +
                        "\ns " + teste.getI() +
                        "\nt " + teste.getT() +
                        "\na " + teste.getA() +
                        "\nv " + teste.getV() +
                        "\nWeight " + teste.calcWeight(teste.getF(), teste.getV(), teste.getLvl(), teste.getI(), teste.getA());

                pointsView.setText(String.valueOf(texto));

            }


        });

    }
}
