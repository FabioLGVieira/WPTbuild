package com.example.adm.wptbuild;


public class Classes {

    private int f, i, t, a, v;

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
    private double hp, mp, stm, atkRtg, def, abs, spd, weight,
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

    public Classes() {
/*   Se colocar o TextWatcher pro player ver a alteração em tempo real
        statsUsed = stats - fUsed - iUsed - tUsed - aUsed - vUsed;
        stats = ((lvl * 5) - 5) + ((lvl > 79) ? ((lvl - 79) * 2) : 0) + ((lvl > 89) ? ((lvl - 89) * 3) : 0) + ((lvl > 30) ? 5 : 0)
                + ((lvl > 69) ? 5 : 0) + ((lvl > 79) ? 5 : 0) + ((lvl > 124) ? 10 : 0) - statsUsed;
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

        //items
        //amulet
        amuletAddHp = 0;
        amuletAddMp = 0;
        amuletAddStm = 0;
        amuletMpRecover = 0;
        amuletHpReg = 0;
        amuletMpReg = 0;
        amuletStmReg = 0;

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
        bracSpecDiv = 1;
        bracSpec = lvl / bracSpecDiv;
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


        //Resultado final das info

        sp = ((lvl - 9) / 2) + ((lvl > 54) ? 1 : 0) + ((lvl > 69) ? 1 : 0) + ((lvl > 79) ? 2 : 0);
        ep = (lvl - 59) / 2;

    }

    public int addHp(int bracHpMix, int gauntHpMix, int bootsHpMix, int wpnHpMix, int armorHpMix, int shieldHpMix) {
        addHp = bracHpMix + gauntHpMix + bootsHpMix + wpnHpMix + armorHpMix + shieldHpMix;
        return addHp;
    }

    public double hpFsMs(int lvl, int strg, int hlth) {
        hp = (lvl * 2.1) + (strg * 0.8) + (hlth * 2.4);
        return hp;
    }

    public int addMp(int bracMpMix, int gauntMpMix, int bootsMpMix, int wpnMpMix, int armorMpMix, int shieldMpMix) {
        addMp = bracMpMix + gauntMpMix + bootsMpMix + wpnMpMix + armorMpMix + shieldMpMix;
        return addMp;
    }

    public double mpFsPsAsAss(int lvl, int sprt) {
        mp = (lvl * 0.6) + (sprt * 2.2);
        return mp;
    }

    public int addStm(int ring1StmMix, int ring1AddStm, int ring2StmMix, int ring2AddStm, int bracStmMix, int gauntStmMix, int bootsStmMix, int orbStmMix) {
        addStm = ring1StmMix + ring1AddStm + ring2StmMix + ring2AddStm + bracStmMix + gauntStmMix + bootsStmMix + orbStmMix;
        return addStm;
    }

    public double stmAll(int lvl, int strg, int sprt, int tal, int hlth) {
        stm = (lvl * 2.3) + (strg * 0.5) + (sprt * 1.0) + (tal * 0.5) + (hlth * 1.4) + 80;
        return mp;
    }

    public double calcAtkRtg(int lvl, int a, int t, int wpnAtkRtg, int bracAtk, int ring1AtkRtg, int ring2AtkRtg) {
        atkRtg = (lvl * 1.9) + (a * 3.1) + (t * 1.5) + wpnAtkRtg + bracAtk + ring1AtkRtg + ring2AtkRtg;
        return atkRtg;
    }

    public double atkPwr1(int tal, int agi, int wpnAtkpwr1, int shelMinMix){
        pdAtkMin = (3 + (tal + agi) / 40 + wpnAtkpwr1 + shelMinMix);  // falta
        return pdAtkMin;
    }

    public double atkPwr2(int tal, int agi, int wpnAtkpwr2, int shelMaxMix){
        pdAtkMax = (4 + (tal + agi) / 35 + wpnAtkpwr2 + shelMaxMix);  // falta
        return pdAtkMin;
    }

    public double calcAbs(int def, int f, int i, int t, int a, int v, int lvl, double ring1Abs, double ring2Abs, double gauntAbs, double gauntAbsAdd,
                          double bootsAbs, double bootsAbsAdd, double armorAbs, double armorAbsAdd, double shieldAbs, double shieldAbsAdd) {
        abs = (def / 100) + (f / 40) + (i / 40) + (t / 40) + (a / 40) + (v / 40) + (lvl / 10) + ((ring1Abs != 0) ? (ring1Abs + 0.5) : 0) + ((ring2Abs != 0) ? (ring2Abs + 0.5) : 0) +
                gauntAbs + gauntAbsAdd + bootsAbs + bootsAbsAdd + armorAbs + armorAbsAdd + ((shieldAbs != 0) ? (shieldAbsAdd + 0.5) : 0);
        return abs;
    }

    public double calcDef(int lvl, int a, int t, int armorDef, int armorDefAdd, int gauntDef, int gauntDefAdd, int bracDef, int bootsDef, int bootsDefAdd,
                          int shieldDef, int shieldDefAdd, int ring1Def, int ring2Def, int shelDefMix) {
        def = (lvl * 1.4) + a + (t * 0.25) + armorDef + armorDefAdd + gauntDef + gauntDefAdd + bracDef + bootsDef + bootsDefAdd + shieldDef + shieldDefAdd +
                ring1Def + ring2Def + shelDefMix;
        return def;
    }

    public double calcSpd(int v, int t, int lvl, double bootsSpd, double bootsSpdAdd) {
        spd = (1.4 + (v / 150) + (t / 150) + (lvl / 150) + bootsSpd + bootsSpdAdd);
        return spd;
    }

    public double calcWeight(int strg, int hlth, int lvl, int sprt, int agi) {
        weight = (strg * 2) + (hlth * 1.5) + (lvl * 3) + sprt + agi + 60;
        return weight;
    }

    public Classes(int f, int i, int a, int t, int v) {
        super();
        this.f = strg;
        this.i = sprt;
        this.t = tal;
        this.a = agi;
        this.v = hlth;

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
