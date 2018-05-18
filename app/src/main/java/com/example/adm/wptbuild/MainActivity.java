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

    public int sp, ep, lvl, strg, sprt, tal, agi, hlth, fUsed, iUsed, tUsed, aUsed, vUsed, stats, statsUsed,   //status
            amuletAddHp, amuletAddMp, amuletAddStm,  //amulet
            ring1AddHp, ring1AddStm, ring1Def, ring1AtkRtg, ring1AddMp, ring1StmMix, //ring1
            ring2AddHp, ring2AddStm, ring2Def, ring2AtkRtg, ring2AddMp, ring2StmMix, //ring2
            shelHpAdd, shelMpAdd, shelHpBoost, shelMpBoost, shelDefMix, shelMinMix, shelMaxMix, //sheltom
            bracDef, bracAtk, bracSpec, bracHpMix, bracMpMix, bracStmMix, //bracelets
            gauntDef, gauntDefAdd, gauntHpMix, gauntMpMix, gauntStmMix, //gauntlets
            bootsDef, bootsDefAdd, bootsHpMix, bootsMpMix, bootsStmMix, //boots
            wpnAtkpwr1, wpnAtkpwr2, wpnAtkRtg, wpnHpMix, wpnMpMix, //weapon
            armorDef, armorDefAdd, armorHpMix, armorMpMix, //armor
            shieldDef, shieldDefAdd, shieldHpMix, shieldMpMix, orbStmMix; //shield
    public double amuletMpRecover, amuletHpReg, amuletMpReg, amuletHpRecover, //amulet
            ring1HpRecover, ring1Abs, ring1HpReg, ring1MpReg, //ring1
            ring2HpRecover, ring2Abs, ring2HpReg, ring2MpReg, //ring2
            shelHpRegen, shelMpRegen, shelHpRecover, shelMpRecover, //sheltom
            bracCrit, //brac
            gauntAbs, gauntAbsAdd, gauntAtkPwr, //gauntlets
            bootsAbs, bootsAbsAdd, bootsSpd, bootsSpdAdd, //boots
            wpnAtkCrit, wpnAtkBlk, wpnAtkpwrSpec, wpnAtkRtgSpec, wpnAtkCritSpec, //weapon
            armorAbs, armorAbsAdd, //armor
            shieldAbs, shieldBlk, shieldAbsAdd, shieldBlkAdd,
            hp, mp, stm, atkRtg, def, abs, spd, weight, pdAtkMin, pdAtkMax; //shield

    EditText lvlText, strgtxt, sprttxt, taltxt, agitxt, healthtxt,
            amulet0, amulet1, amulet2, amulet3, amulet4, amulet5, amulet6,
            ringa1,
            ringb1;
    TextView pointsView, leftPoints;
    RadioGroup rg;
    RadioButton boxFs, boxMs, boxPs, boxAs, boxAss, boxMgs, boxKs, boxSs, boxPrs, boxAts;
    Button calcbtn;
    String texto;

    Classes teste = new Classes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.lay1);
        boxFs = (RadioButton) findViewById(R.id.btnFs);
        boxMs = (RadioButton) findViewById(R.id.btnMs);
        boxPs = (RadioButton) findViewById(R.id.btnPs);
        boxAs = (RadioButton) findViewById(R.id.btnAs);
        boxAss = (RadioButton) findViewById(R.id.btnAss);
        boxMgs = (RadioButton) findViewById(R.id.btnMgs);
        boxKs = (RadioButton) findViewById(R.id.btnKs);
        boxSs = (RadioButton) findViewById(R.id.btnSs);
        boxPrs = (RadioButton) findViewById(R.id.btnPrs);
        boxAts = (RadioButton) findViewById(R.id.btnAts);

        lvlText = (EditText) findViewById(R.id.levelText);
        //leftPoints = findViewById(R.id.pointsLeft);
        pointsView = findViewById(R.id.resultView);
        strgtxt = (EditText) findViewById(R.id.strgTxt);
        sprttxt = (EditText) findViewById(R.id.sprtText);
        taltxt = (EditText) findViewById(R.id.talText);
        agitxt = (EditText) findViewById(R.id.agiText);
        healthtxt = (EditText) findViewById(R.id.healthText);
        amulet0 = (EditText) findViewById(R.id.amulet0Txt);
        amulet1 = (EditText) findViewById(R.id.amulet1Txt);
        amulet2 = (EditText) findViewById(R.id.amulet2Txt);
        amulet3 = (EditText) findViewById(R.id.amulet3Txt);
        amulet4 = (EditText) findViewById(R.id.amulet4Txt);
        amulet5 = (EditText) findViewById(R.id.amulet5Txt);
        amulet6 = (EditText) findViewById(R.id.amulet6Txt);
        calcbtn = (Button) findViewById(R.id.CalculateBtn);

        //items
        //amulet
        amuletAddHp = Integer.parseInt(amulet0.getText().toString());
        amuletAddMp = Integer.parseInt(amulet1.getText().toString());
        amuletAddStm = Integer.parseInt(amulet2.getText().toString());
        amuletMpRecover = Integer.parseInt(amulet3.getText().toString());
        amuletHpReg = Integer.parseInt(amulet4.getText().toString());
        amuletMpReg = Integer.parseInt(amulet5.getText().toString());
        amuletHpRecover = Integer.parseInt(amulet6.getText().toString());

        //ring1
        ring1AddHp = 0;
        ring1AddStm = 0;
        ring1HpRecover = 0;
        ring1Def = 0;
        ring1AtkRtg = 0;
        ring1Abs = 0;
        ring1HpReg = 0;
        ring1MpReg = 0;
        ring1AddMp = 0;
        ring1AddMp = 0;
        ring1StmMix = 0;

        //ring2
        ring2AddHp = 0;
        ring2AddStm = 0;
        ring2HpRecover = 0;
        ring2Def = 0;
        ring2AtkRtg = 0;
        ring2Abs = 0;
        ring2HpReg = 0;
        ring2MpReg = 0;
        ring2AddMp = 0;
        ring2AddMp = 0;
        ring2StmMix = 0;

        //sheltom
        shelHpRegen = 0;
        shelMpRegen = 0;
        shelHpRecover = 0;
        shelMpRecover = 0;
        shelHpAdd = 0;
        shelMpAdd = 0;
        shelHpBoost = lvl / 8;
        shelMpBoost = lvl / 8;
        shelDefMix = 0;
        shelMinMix = 0;
        shelMaxMix = 0;

        //bracelets
        bracDef = 0;
        bracAtk = 0;
        bracSpec = 1;
        bracCrit = 0.01;
        bracHpMix = 0;
        bracMpMix = 0;
        bracStmMix = 0;

        //gauntlets
        gauntDef = 0;
        gauntAbs = 0;
        gauntDefAdd = 0;
        gauntAbsAdd = 0;
        gauntAtkPwr = lvl / 10;
        gauntHpMix = 0;
        gauntMpMix = 0;
        gauntStmMix = 0;

        //boots
        bootsDef = 0;
        bootsAbs = 0;
        bootsDefAdd = 0;
        bootsAbsAdd = 0;
        bootsSpd = 0;
        bootsSpdAdd = 0;
        bootsHpMix = 0;
        bootsMpMix = 0;
        bootsStmMix = 0;

        //weapon
        wpnAtkpwr1 = 0;
        wpnAtkpwr2 = 0;
        wpnAtkRtg = 0;
        wpnAtkCrit = 0;
        wpnAtkBlk = 0;
        wpnAtkpwrSpec = 0;
        wpnAtkRtgSpec = 0;
        wpnAtkCritSpec = 0;
        wpnHpMix = 0;
        wpnMpMix = 0;

        //armor
        armorDef = 0;
        armorAbs = 0;
        armorDefAdd = 0;
        armorAbsAdd = 0;
        armorHpMix = 0;
        armorMpMix = 0;

        //shield
        shieldDef = 0;
        shieldAbs = 0;
        shieldBlk = 0;
        shieldDefAdd = 0;
        shieldAbsAdd = 0;
        shieldBlkAdd = 0;
        shieldHpMix = 0;
        shieldMpMix = 0;
        orbStmMix = 0;

        //results
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();
                //lvl = Integer.parseInt(lvlText.getText().toString());
                //strg = Integer.parseInt(strgtxt.getText().toString());
                //sprt = Integer.parseInt(sprttxt.getText().toString());
                //tal = Integer.parseInt(taltxt.getText().toString());
                //agi = Integer.parseInt(agitxt.getText().toString());
                //hlth = Integer.parseInt(healthtxt.getText().toString());

                sp = ((lvl - 9) / 2) + ((lvl > 54) ? 1 : 0) + ((lvl > 69) ? 1 : 0) + ((lvl > 79) ? 2 : 0);
                ep = (lvl - 59) / 2;

                switch (id) {
                    case R.id.btnFs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpFsMs(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnMs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpFsMs(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpMsKsAts(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnPs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnAs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpAsAss(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnAss:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpAsAss(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnMgs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpMgs(lvl, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpPrsMgsSS(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnKs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpMsKsAts(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnSs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpPrsMgsSS(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnPrs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPrs(lvl, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpPrsMgsSS(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnAts:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpMsKsAts(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmMix, ring1AddStm, ring2StmMix, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                }

                // atkRtg = teste.calcAtkRtg(lvl, agi, tal, wpnAtkRtg, bracAtk, bracSpec, ring1AtkRtg, ring2AtkRtg);
                // def = teste.calcDef(lvl, agi, tal, armorDef, armorDefAdd, gauntDef, gauntDefAdd, bracDef, bootsDef, bootsDefAdd, shieldDef, shieldDefAdd, ring1Def,
                //         ring2Def, shelDefMix);
                // abs = teste.calcAbs(def, strg, sprt, tal, agi, hlth, lvl, ring1Abs, ring2Abs, gauntAbs, gauntAbsAdd, bootsAbs, bootsAbsAdd, armorAbs,
                //         armorAbsAdd, shieldAbs, shieldAbsAdd);
                // spd = teste.calcSpd(hlth, tal, lvl, bootsSpd, bootsSpdAdd);
                // weight = teste.calcWeight(strg, hlth, lvl, sprt, agi);

                texto = "your lvl: " + lvl +
                        "\natkRtg " + atkRtg +
                        "\nAtkPwr " + pdAtkMin + "-" + pdAtkMax +
                        "\nabs " + abs +
                        "\ndef " + def +
                        "\nspd " + spd +
                        "\nhp " + hp +
                        "\nmp " + mp +
                        "\nstm " + stm +
                        "\nWeight " + weight +
                        "\nSp " + sp + " EP " + ep;
                pointsView.setText(String.valueOf(texto));
            }
        });

    }

    public void rgClick(View v) {
        int id = rg.getCheckedRadioButtonId();
        switch (id) {
            case R.id.btnFs:
                strgtxt.setText("28");
                sprttxt.setText("6");
                taltxt.setText("21");
                agitxt.setText("17");
                healthtxt.setText("27");
                lvlText.requestFocus();
                break;
            case R.id.btnMs:
                strgtxt.setText("24");
                sprttxt.setText("8");
                taltxt.setText("25");
                agitxt.setText("18");
                healthtxt.setText("24");
                lvlText.requestFocus();
                break;
            case R.id.btnPs:
                strgtxt.setText("26");
                sprttxt.setText("9");
                taltxt.setText("20");
                agitxt.setText("19");
                healthtxt.setText("25");
                lvlText.requestFocus();
                break;
            case R.id.btnAs:
                strgtxt.setText("17");
                sprttxt.setText("11");
                taltxt.setText("21");
                agitxt.setText("27");
                healthtxt.setText("23");
                lvlText.requestFocus();
                break;
            case R.id.btnAss:
                strgtxt.setText("25");
                sprttxt.setText("10");
                taltxt.setText("22");
                agitxt.setText("20");
                healthtxt.setText("22");
                lvlText.requestFocus();
                break;
            case R.id.btnMgs:
                strgtxt.setText("16");
                sprttxt.setText("29");
                taltxt.setText("19");
                agitxt.setText("14");
                healthtxt.setText("21");
                lvlText.requestFocus();
                break;
            case R.id.btnKs:
                strgtxt.setText("26");
                sprttxt.setText("13");
                taltxt.setText("17");
                agitxt.setText("19");
                healthtxt.setText("24");
                lvlText.requestFocus();
                break;
            case R.id.btnSs:
                strgtxt.setText("15");
                sprttxt.setText("27");
                taltxt.setText("20");
                agitxt.setText("15");
                healthtxt.setText("22");
                lvlText.requestFocus();
                break;
            case R.id.btnPrs:
                strgtxt.setText("15");
                sprttxt.setText("28");
                taltxt.setText("21");
                agitxt.setText("15");
                healthtxt.setText("20");
                lvlText.requestFocus();
                break;
            case R.id.btnAts:
                strgtxt.setText("23");
                sprttxt.setText("15");
                taltxt.setText("19");
                agitxt.setText("19");
                healthtxt.setText("23");
                break;
        }
    }
}
