package com.example.adm.wptbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

    public int sp, ep, lvl, strg, sprt, tal, agi, hlth, fUsed, iUsed, tUsed, aUsed, vUsed, statusLeft,   //status
            amuletAddHp, amuletAddMp, amuletAddStm,  //amulet
            ring1AddHp, ring1AddStm, ring1Def, ring1AtkRtg, ring1AddMp, //ring1
            ring2AddHp, ring2AddStm, ring2Def, ring2AtkRtg, ring2AddMp, //ring2
            shelHpAdd, shelMpAdd, shelHpBoost, shelMpBoost, shelDefMix, shelMinMix, shelMaxMix, //sheltom
            bracDef, bracAtk, bracSpec, bracHpMix, bracMpMix, bracStmMix, //bracelets
            gauntDef, gauntDefAdd, gauntHpMix, gauntMpMix, gauntStmMix, //gauntlets
            bootsDef, bootsDefAdd, bootsHpMix, bootsMpMix, bootsStmMix, //boots
            wpnAtkpwr1, wpnAtkpwr2, wpnAtkRtg, wpnHpMix, wpnMpMix, //weapon
            armorDef, armorDefAdd, armorHpMix, armorMpMix, //armor
            shieldDef, shieldDefAdd, shieldHpMix, shieldMpMix, orbStmMix; //shield
    public double amuletMpRecover, amuletHpReg, amuletMpReg, amuletHpRecover, //amulet
            ring1HpRecover, ring1Abs, ring1HpReg, ring1MpReg, ring1StmReg, //ring1
            ring2HpRecover, ring2Abs, ring2HpReg, ring2MpReg, ring2StmReg, //ring2
            shelHpRegen, shelMpRegen, shelHpRecover, shelMpRecover, //sheltom
            bracCrit, //brac
            gauntAbs, gauntAbsAdd, gauntAtkPwr, //gauntlets
            bootsAbs, bootsAbsAdd, bootsSpd, bootsSpdAdd, //boots
            wpnAtkCrit, wpnAtkBlk, wpnAtkpwrSpec, wpnAtkRtgSpec, wpnAtkCritSpec, //weapon
            armorAbs, armorAbsAdd, //armor
            shieldAbs, shieldBlk, shieldAbsAdd, shieldBlkAdd,
            hp, mp, stm, atkRtg, def, abs, spd, weight, pdAtkMin, pdAtkMax; //shield

    EditText lvl_Text, str_Text, sprt_Text, tal_Text, agi_Text, health_Text,
            amulet0, amulet1, amulet2, amulet3, amulet4, amulet5, amulet6,
            ringA0, ringA1, ringA2, ringA3, ringA4, ringA5, ringA6, ringA7, ringA8, ringA9,
            ringB0, ringB1, ringB2, ringB3, ringB4, ringB5, ringB6, ringB7, ringB8, ringB9,
            shel0, shel1, shel2, shel3, shel4, shel5, shel6, shel7, shel8, shel9, shel10,
            brac0, brac1, brac2, brac3, brac4, brac5, brac6,
            gaunt0, gaunt1, gaunt2, gaunt3, gaunt4,
            boots0, boots1, boots2, boots3, boots4, boots5, boots6, boots7, boots8,
            wpn0, wpn1, wpn2, wpn3, wpn4, wpn5, wpn6, wpn7,
            armor0, armor1, armor2, armor3, armor4, armor5, armor6,
            shield0;
    TextView pointsView, left_Points;
    RadioGroup rg;
    RadioButton boxFs, boxMs, boxPs, boxAs, boxAss, boxMgs, boxKs, boxSs, boxPrs, boxAts;
    Button calcbtn;
    String texto, empty = "a";

    Classes teste = new Classes();
    int lp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);
        //region radioButton
        rg = (RadioGroup) findViewById(R.id.rg_chars);
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
        //endregion

        //region EditTexts
        lvl_Text = (EditText) findViewById(R.id.edit_level);
        left_Points =  findViewById(R.id.txt_points_left_n);
        pointsView = findViewById(R.id.resultView);
        str_Text = (EditText) findViewById(R.id.edit_strength);
        sprt_Text = (EditText) findViewById(R.id.edit_spirit);
        tal_Text = (EditText) findViewById(R.id.edit_talent);
        agi_Text = (EditText) findViewById(R.id.edit_agility);
        health_Text = (EditText) findViewById(R.id.edit_health);
        /*amulet0 = (EditText) findViewById(R.id.amulet0Txt);
        amulet1 = (EditText) findViewById(R.id.amulet1Txt);
        amulet2 = (EditText) findViewById(R.id.amulet2Txt);
        amulet3 = (EditText) findViewById(R.id.amulet3Txt);
        amulet4 = (EditText) findViewById(R.id.amulet4Txt);
        amulet5 = (EditText) findViewById(R.id.amulet5Txt);
        amulet6 = (EditText) findViewById(R.id.amulet6Txt);
        ringA0 = (EditText) findViewById(R.id.ring1Txt0);
        ringA1 = (EditText) findViewById(R.id.ring1Txt1);
        ringA2 = (EditText) findViewById(R.id.ring1Txt2);
        ringA3 = (EditText) findViewById(R.id.ring1Txt3);
        ringA4 = (EditText) findViewById(R.id.ring1Txt4);
        ringA5 = (EditText) findViewById(R.id.ring1Txt5);
        ringA6 = (EditText) findViewById(R.id.ring1Txt6);
        ringA7 = (EditText) findViewById(R.id.ring1Txt7);
        ringA8 = (EditText) findViewById(R.id.ring1Txt8);
        ringA9 = (EditText) findViewById(R.id.ring1Txt9);
        ringB0 = (EditText) findViewById(R.id.ring2Txt0);
        ringB1 = (EditText) findViewById(R.id.ring2Txt1);
        ringB2 = (EditText) findViewById(R.id.ring2Txt2);
        ringB3 = (EditText) findViewById(R.id.ring2Txt3);
        ringB4 = (EditText) findViewById(R.id.ring2Txt4);
        ringB5 = (EditText) findViewById(R.id.ring2Txt5);
        ringB6 = (EditText) findViewById(R.id.ring2Txt6);
        ringB7 = (EditText) findViewById(R.id.ring2Txt7);
        ringB8 = (EditText) findViewById(R.id.ring2Txt8);
        ringB9 = (EditText) findViewById(R.id.ring2Txt9);
        shel0 = (EditText) findViewById(R.id.shelTxt0);
        shel1 = (EditText) findViewById(R.id.shelTxt1);
        shel2 = (EditText) findViewById(R.id.shelTxt2);
        shel3 = (EditText) findViewById(R.id.shelTxt3);
        shel4 = (EditText) findViewById(R.id.shelTxt4);
        shel5 = (EditText) findViewById(R.id.shelTxt5);
        shel6 = (EditText) findViewById(R.id.shelTxt6);
        shel7 = (EditText) findViewById(R.id.shelTxt7);
        shel8 = (EditText) findViewById(R.id.shelTxt8);
        shel9 = (EditText) findViewById(R.id.shelTxt9);
        shel10 = (EditText) findViewById(R.id.shelTxt10);
        brac0 = (EditText) findViewById(R.id.bracTxt0);
        brac1 = (EditText) findViewById(R.id.bracTxt1);
        brac2 = (EditText) findViewById(R.id.bracTxt2);
        brac3 = (EditText) findViewById(R.id.bracTxt3);
        brac4 = (EditText) findViewById(R.id.bracTxt4);
        brac5 = (EditText) findViewById(R.id.bracTxt5);
        brac6 = (EditText) findViewById(R.id.bracTxt6);
        gaunt0 = (EditText) findViewById(R.id.gauntTxt0);
        gaunt1 = (EditText) findViewById(R.id.gauntTxt1);
        gaunt2 = (EditText) findViewById(R.id.gauntTxt2);
        gaunt3 = (EditText) findViewById(R.id.gauntTxt3);
        gaunt4 = (EditText) findViewById(R.id.gauntTxt4);
        boots0 = (EditText) findViewById(R.id.bootsTxt0);
        boots1 = (EditText) findViewById(R.id.bootsTxt1);
        boots2 = (EditText) findViewById(R.id.bootsTxt2);
        boots3 = (EditText) findViewById(R.id.bootsTxt3);
        boots4 = (EditText) findViewById(R.id.bootsTxt4);
        boots5 = (EditText) findViewById(R.id.bootsTxt5);
        boots6 = (EditText) findViewById(R.id.bootsTxt6);
        boots7 = (EditText) findViewById(R.id.bootsTxt7);
        boots8 = (EditText) findViewById(R.id.bootsTxt8);
        wpn0 = (EditText) findViewById(R.id.wpnTxt0);
        wpn1 = (EditText) findViewById(R.id.wpnTxt1);
        wpn2 = (EditText) findViewById(R.id.wpnTxt2);
        wpn3 = (EditText) findViewById(R.id.wpnTxt3);
        wpn4 = (EditText) findViewById(R.id.wpnTxt4);
        wpn5 = (EditText) findViewById(R.id.wpnTxt5);
        wpn6 = (EditText) findViewById(R.id.wpnTxt6);
        wpn7 = (EditText) findViewById(R.id.wpnTxt7);
        armor0 = (EditText) findViewById(R.id.armorTxt0);
        armor1 = (EditText) findViewById(R.id.armorTxt1);
        armor2 = (EditText) findViewById(R.id.armorTxt2);
        armor3 = (EditText) findViewById(R.id.armorTxt3);
        armor4 = (EditText) findViewById(R.id.armorTxt4);
        armor5 = (EditText) findViewById(R.id.armorTxt5);*/
        //armor6 = (EditText) findViewById(R.id.armorTxt7);

        calcbtn = (Button) findViewById(R.id.CalculateBtn);
        //endregion

        while(lp>0){
            //lp = Integer.parseInt(left_Points.getText().toString());

            lp = statusLeft - (strg - teste.getF());
            left_Points.setText(String.valueOf(lp));
            Log.i("tag", " "+lp);
        }

        lvl_Text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
               try{ if(lvl_Text.toString() != "" || lvl_Text.toString() == "" ) {
                   lvl = Integer.parseInt(lvl_Text.getText().toString());
                   statusLeft = teste.totalPoints(lvl);
                   lp = statusLeft - (strg + teste.getF());
                   left_Points.setText(String.valueOf(lp));
               }
               }catch (NumberFormatException e){
                   empty = "";
               }
            }
        });

        str_Text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {

                try{ if(str_Text.toString() != "" || str_Text.toString() == "" ){
                    strg = Integer.parseInt(str_Text.getText().toString());
                }
                }catch (NumberFormatException e){
                    empty = "";
                }
            }
        });

        //results
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();

                //lvl = Integer.parseInt(lvl_Text.getText().toString());
                //strg = Integer.parseInt(str_Text.getText().toString());
                sprt = Integer.parseInt(sprt_Text.getText().toString());
                tal = Integer.parseInt(tal_Text.getText().toString());
                agi = Integer.parseInt(agi_Text.getText().toString());
                hlth = Integer.parseInt(health_Text.getText().toString());

                //region items
              /*  //amulet
                amuletAddHp = Integer.parseInt(amulet0.getText().toString());
                amuletAddMp = Integer.parseInt(amulet1.getText().toString());
                amuletAddStm = Integer.parseInt(amulet2.getText().toString());
                amuletMpRecover = Integer.parseInt(amulet3.getText().toString());
                amuletHpReg = Integer.parseInt(amulet4.getText().toString());
                amuletMpReg = Integer.parseInt(amulet5.getText().toString());
                amuletHpRecover = Integer.parseInt(amulet6.getText().toString());

                //ring1
                ring1Def = Integer.parseInt(ringA0.getText().toString());
                ring1AtkRtg = Integer.parseInt(ringA1.getText().toString());
                ring1Abs = Integer.parseInt(ringA2.getText().toString());
                ring1HpReg = Integer.parseInt(ringA3.getText().toString());
                ring1MpReg = Integer.parseInt(ringA4.getText().toString());
                ring1StmReg = Integer.parseInt(ringA5.getText().toString());
                ring1AddHp = Integer.parseInt(ringA6.getText().toString());
                ring1AddMp = Integer.parseInt(ringA7.getText().toString());
                ring1AddStm = Integer.parseInt(ringA8.getText().toString());
                ring1HpRecover = Integer.parseInt(ringA9.getText().toString());

                //ring2
                ring2Def = Integer.parseInt(ringA0.getText().toString());
                ring2AtkRtg = Integer.parseInt(ringA1.getText().toString());
                ring2Abs = Integer.parseInt(ringA2.getText().toString());
                ring2HpReg = Integer.parseInt(ringA3.getText().toString());
                ring2MpReg = Integer.parseInt(ringA4.getText().toString());
                ring2StmReg = Integer.parseInt(ringA5.getText().toString());
                ring2AddHp = Integer.parseInt(ringA6.getText().toString());
                ring2AddMp = Integer.parseInt(ringA7.getText().toString());
                ring2AddStm = Integer.parseInt(ringA8.getText().toString());
                ring2HpRecover = Integer.parseInt(ringA9.getText().toString());*/


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
                //endregion

                sp = ((lvl - 9) / 2) + ((lvl > 54) ? 1 : 0) + ((lvl > 69) ? 1 : 0) + ((lvl > 79) ? 2 : 0);
                ep = (lvl - 59) / 2;

                switch (id) {
                    case R.id.btnFs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpFsMs(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnMs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpFsMs(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpMsKsAts(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnPs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnAs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpAsAss(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnAss:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpAsAss(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpFsPsAsAss(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnMgs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpMgs(lvl, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpPrsMgsSS(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnKs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpMsKsAts(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnSs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpPrsMgsSS(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnPrs:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPrs(lvl, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpPrsMgsSS(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
                        break;
                    case R.id.btnAts:
                        pdAtkMin = teste.atkPwr1Fs(strg, tal, agi, wpnAtkpwr1, wpnAtkpwr2, shelMinMix);
                        pdAtkMax = teste.atkPwr2Fs(tal, agi, wpnAtkpwr2, shelMaxMix);
                        hp = teste.hpPsKsAtsSS(lvl, strg, hlth) + teste.addHp(amuletAddHp, ring1AddHp, ring2AddHp, shelHpAdd, shelHpBoost, bracHpMix, gauntHpMix, bootsHpMix, wpnHpMix, armorHpMix, shieldHpMix);
                        mp = teste.mpMsKsAts(lvl, sprt) + teste.addMp(amuletAddMp, ring1AddMp, ring2AddMp, shelMpAdd, shelMpBoost, bracMpMix, gauntMpMix, bootsMpMix, wpnMpMix, armorMpMix, shieldMpMix);
                        stm = teste.stmAll(lvl, strg, sprt, tal, hlth) + teste.addStm(amuletAddStm, ring1StmReg, ring1AddStm, ring2StmReg, ring2AddStm, bracStmMix, gauntStmMix, bootsStmMix, orbStmMix);
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
                str_Text.setText("28");
                sprt_Text.setText("6");
                tal_Text.setText("21");
                agi_Text.setText("17");
                health_Text.setText("27");
                //teste.getStatus("Fs");
                break;
        /*    case R.id.btnMs:
                teste.getStatus("Ms");
                break;
            case R.id.btnPs:
                teste.getStatus("Ps");
                break;
            case R.id.btnAs:
                teste.getStatus("As");
                break;
            case R.id.btnAss:
                teste.getStatus("Ass");
                break;
            case R.id.btnMgs:
                teste.getStatus("Mgs");
                break;
            case R.id.btnKs:
                teste.getStatus("Ks");
                break;
            case R.id.btnSs:
                teste.getStatus("Ss");
                break;
            case R.id.btnPrs:
                teste.getStatus("PRs");
                break;
            case R.id.btnAts:
                teste.getStatus("ATs");
                break;*/
        }
    }
}
