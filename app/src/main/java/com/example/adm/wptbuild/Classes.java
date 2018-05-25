package com.example.adm.wptbuild;


import android.util.Log;

public class Classes {

    private int f, i, t, a, v;

    private int lvl, addHp, addMp, pdBaseMin = 3, pdBaseMax = 4;
    private double hp, mp, addStm, stm, atkRtg, def, abs, spd, weight, pdAtkMin, pdAtkMax;

  //region StatusCharacters
    public void getStatus(String classe) {
        switch (classe) {
            case "Fs":
                f = 28;
                i = 6;
                t = 21;
                a = 17;
                v = 27;
                break;
            case "Ms":
                f = 24;
                i = 8;
                t = 25;
                a = 18;
                v = 24;
                break;
            case "Ps":
                f = 26;
                i = 9;
                t = 20;
                a = 19;
                v = 25;
                break;
            case "As":
                f = 17;
                i = 11;
                t = 21;
                a = 27;
                v = 23;
                break;
            case "Ass":
                f = 25;
                i = 10;
                t = 22;
                a = 20;
                v = 22;
                break;
            case "Mgs":
                f = 16;
                i = 29;
                t = 19;
                a = 14;
                v = 21;
                break;
            case "Ks":
                f = 26;
                i = 13;
                t = 17;
                a = 19;
                v = 24;
                break;
            case "Ss":
                f = 15;
                i = 27;
                t = 20;
                a = 15;
                v = 22;
                break;
            case "Prs":
                f = 15;
                i = 28;
                t = 21;
                a = 15;
                v = 20;
                break;
            case "Ats":
                f = 23;
                i = 15;
                t = 19;
                a = 19;
                v = 23;
                break;
        }
    }
//endregion

    public int totalPoints(int lvl) {
        int status = ((lvl * 5) - 5) + ((lvl > 79) ? ((lvl - 79) * 2) : 0) + ((lvl > 89) ? ((lvl - 89) * 3) : 0) + ((lvl > 30) ? 5 : 0)
                + ((lvl > 69) ? 5 : 0) + ((lvl > 79) ? 5 : 0) + ((lvl > 124) ? 10 : 0);//statusUsed;

return  status;
    }

    public Classes() {
/*   Se colocar o TextWatcher pro player ver a alteração em tempo real
        stats = ((lvl * 5) - 5) + ((lvl > 79) ? ((lvl - 79) * 2) : 0) + ((lvl > 89) ? ((lvl - 89) * 3) : 0) + ((lvl > 30) ? 5 : 0)
                + ((lvl > 69) ? 5 : 0) + ((lvl > 79) ? 5 : 0) + ((lvl > 124) ? 10 : 0) - statsUsed;
        statusUsed = (strg - f) + (sprt - i) + (tal - t) + (agi - a) + (hlth - v);
        statusLeft = status - statusUsed;
        fUsed = 0;
        strg = f - fUsed;
        iUsed = 0;
        sprt = i - iUsed;
        tUsed = 0;
        tal = t - tUsed;
        aUsed = 0;
        agi = a - aUsed;
        vUsed = 0;
        hlth = v - vUsed;*/
    }

    public double calcAtkRtg(int lvl, int agi, int tal, int wpnAtkRtg, int bracAtk, int bracSpec, int ring1AtkRtg, int ring2AtkRtg) {
        atkRtg = (lvl * 1.9) + (agi * 3.1) + (tal * 1.5) + wpnAtkRtg + bracAtk + (lvl / bracSpec) + ring1AtkRtg + ring2AtkRtg;
        return atkRtg;
    }

    public double atkPwr1Agi(int tal, int agi, int wpnAtkpwr1, int wpnAtkPwr2, int shelMinMix) {
        pdAtkMin = pdBaseMin + (wpnAtkpwr1 + wpnAtkPwr2) / 16 + lvl / 6 + (tal + agi) / 40 + ((agi / 130) * wpnAtkpwr1) + wpnAtkpwr1 + shelMinMix;  // falta
        return pdAtkMin;
    }

    public double atkPwr1Fs(int strg, int tal, int agi, int wpnAtkpwr1, int wpnAtkPwr2, int shelMinMix) {
        pdAtkMin = pdBaseMin + (strg / 130) + (tal + agi) / 40 + (wpnAtkpwr1 + wpnAtkPwr2) / 16 + lvl / 6 + ((strg / 130) * wpnAtkpwr1) + wpnAtkpwr1 + shelMinMix;  // falta
        return pdAtkMin;
    }

    public double atkPwr1Sprt(int sprt, int tal, int agi, int wpnAtkpwr1, int wpnAtkPwr2, int shelMinMix) {
        pdAtkMin = pdBaseMin + (wpnAtkpwr1 + wpnAtkPwr2) / 16 + lvl / 6 + (tal + agi) / 40 + ((sprt / 145) * wpnAtkpwr1) + wpnAtkpwr1 + shelMinMix;  // falta
        return pdAtkMin;
    }

    public double atkPwr1Prs(int sprt, int tal, int agi, int wpnAtkpwr1, int wpnAtkPwr2, int shelMinMix) {
        pdAtkMin = pdBaseMin + (wpnAtkpwr1 + wpnAtkPwr2) / 16 + lvl / 6 + (tal + agi) / 40 + ((sprt / 160) * wpnAtkpwr1) + wpnAtkpwr1 + shelMinMix;  // falta
        return pdAtkMin;
    }

    public double atkPwr2Agi(int tal, int agi, int wpnAtkpwr2, int shelMaxMix) {
        pdAtkMax = ((tal + agi) / 45 + wpnAtkpwr2 + shelMaxMix);  // falta
        return pdAtkMin;
    }

    public double atkPwr2Fs(int tal, int agi, int wpnAtkpwr2, int shelMaxMix) {
        pdAtkMax = ((tal + agi) / 45 + wpnAtkpwr2 + shelMaxMix);  // falta
        return pdAtkMin;
    }

    public double atkPwr2Sprt(int tal, int agi, int wpnAtkpwr2, int shelMaxMix) {
        pdAtkMax = ((tal + agi) / 45 + wpnAtkpwr2 + shelMaxMix);  // falta
        return pdAtkMin;
    }

    public double atkPwr2Prs(int tal, int agi, int wpnAtkpwr2, int shelMaxMix) {
        pdAtkMax = ((tal + agi) / 45 + wpnAtkpwr2 + shelMaxMix);  // falta
        return pdAtkMin;
    }

    public double calcAbs(double def, int strg, int sprt, int tal, int agi, int hlth, int lvl, double ring1Abs, double ring2Abs, double gauntAbs, double gauntAbsAdd,
                          double bootsAbs, double bootsAbsAdd, double armorAbs, double armorAbsAdd, double shieldAbs, double shieldAbsAdd) {
        abs = (def / 100) + (strg / 40) + (sprt / 40) + (tal / 40) + (agi / 40) + (hlth / 40) + (lvl / 10) + ((ring1Abs != 0) ? (ring1Abs + 0.5) : 0) + ((ring2Abs != 0) ? (ring2Abs + 0.5) : 0) +
                gauntAbs + gauntAbsAdd + bootsAbs + bootsAbsAdd + armorAbs + armorAbsAdd + ((shieldAbs != 0) ? (shieldAbsAdd + 0.5) : 0);
        return abs;
    }

    public double calcDef(int lvl, int agi, int tal, int armorDef, int armorDefAdd, int gauntDef, int gauntDefAdd, int bracDef, int bootsDef, int bootsDefAdd,
                          int shieldDef, int shieldDefAdd, int ring1Def, int ring2Def, int shelDefMix) {
        def = (lvl * 1.4) + agi + (tal * 0.25) + armorDef + armorDefAdd + gauntDef + gauntDefAdd + bracDef + bootsDef + bootsDefAdd + shieldDef + shieldDefAdd +
                ring1Def + ring2Def + shelDefMix;
        return def;
    }

    public double calcSpd(int hlth, int tal, int lvl, double bootsSpd, double bootsSpdAdd) {
        spd = (1.4 + (hlth / 150) + (tal / 150) + (lvl / 150) + bootsSpd + bootsSpdAdd);
        return spd;
    }

    public int addHp(int amuletAddHp, int ring1AddHp, int ring2AddHp, int shelHpAdd, int shelHpBoost, int bracHpMix, int gauntHpMix, int bootsHpMix, int wpnHpMix, int armorHpMix, int shieldHpMix) {
        addHp = amuletAddHp + ring1AddHp + ring2AddHp + shelHpAdd + shelHpBoost + bracHpMix + gauntHpMix + bootsHpMix + wpnHpMix + armorHpMix + shieldHpMix;
        return addHp;
    }

    public double hpFsMs(int lvl, int strg, int hlth) {
        hp = (lvl * 2.1) + (strg * 0.8) + (hlth * 2.4);
        return hp;
    }

    public double hpPsKsAtsSS(int lvl, int strg, int hlth) {
        hp = (lvl * 2.1) + (strg * 0.6) + (hlth * 2.2);
        return hp;
    }

    public double hpAsAss(int lvl, int strg, int hlth) {
        hp = (lvl * 1.8) + (strg * 0.4) + (hlth * 2.6);
        return hp;
    }

    public double hpPrs(int lvl, int hlth) {
        hp = (lvl * 2.8) + (hlth * 2.8);
        return hp;
    }

    public double hpMgs(int lvl, int hlth) {
        hp = (lvl * 1.8) + (hlth * 2);
        return hp;
    }

    public int addMp(int amuletAddMp, int ring1AddMp, int ring2AddMp, int shelMpAdd, int shelHpBoost, int bracMpMix, int gauntMpMix, int bootsMpMix, int wpnMpMix, int armorMpMix, int shieldMpMix) {
        addMp = amuletAddMp + ring1AddMp + ring2AddMp + shelMpAdd + shelHpBoost + bracMpMix + gauntMpMix + bootsMpMix + wpnMpMix + armorMpMix + shieldMpMix;
        return addMp;
    }

    public double mpFsPsAsAss(int lvl, int sprt) {
        mp = (lvl * 0.6) + (sprt * 2.2);
        return mp;
    }

    public double mpMsKsAts(int lvl, int sprt) {
        mp = (lvl * 0.9) + (sprt * 2.7);
        return mp;
    }

    public double mpPrsMgsSS(int lvl, int sprt) {
        mp = (lvl * 1.5) + (sprt * 3.8);
        return mp;
    }

    public double addStm(int amuletAddStm, double ring1StmReg, int ring1AddStm, double ring2StmReg, int ring2AddStm, int bracStmMix, int gauntStmMix, int bootsStmMix, int orbStmMix) {
        addStm = amuletAddStm + ring1StmReg + ring1AddStm + ring2StmReg + ring2AddStm + bracStmMix + gauntStmMix + bootsStmMix + orbStmMix;
        return addStm;
    }

    public double stmAll(int lvl, int strg, int sprt, int tal, int hlth) {
        stm = (lvl * 2.3) + (strg * 0.5) + (sprt * 1.0) + (tal * 0.5) + (hlth * 1.4) + 80;
        return mp;
    }


    public double calcWeight(int strg, int hlth, int lvl, int sprt, int agi) {
        weight = (strg * 2) + (hlth * 1.5) + (lvl * 3) + sprt + agi + 60;
        return weight;
    }

   /* public Classes(int f, int i, int a, int t, int v) {
        super();
        this.f = strg;
        this.i = sprt;
        this.t = tal;
        this.a = agi;
        this.v = hlth;

    }*/

    public double getDef() {
        return def;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getA() {
        return a;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


}
