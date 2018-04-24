package com.example.adm.wptbuild;


public class Classes extends MainActivity {

        public int f = 28, i = 6, t = 21, a = 17, v = 27;

        public Classes() {

            //falta declarar os mixes(add hp, stm, mp); colocar as variaveis no hp stm mp, abs, atk powers e skills

            //status
            statsUsed = stats - fUsed - iUsed - tUsed - aUsed -vUsed;
            stats = (( lvl * 5 ) - 5) + ((lvl >79)?(( lvl - 79 ) * 2) : 0) + ((lvl >89)?(( lvl - 89 ) * 3) : 0) + ((lvl >30)?5:0)
                    + ((lvl >69)?5 : 0) + ((lvl >79)? 5 : 0) + ((lvl >124)? 10 : 0) - statsUsed;
            fUsed = 0;
            strg = f - fUsed;
            iUsed = 0;
            sprt = i - iUsed;
            tUsed = 0;
            tal = t - tUsed;
            aUsed = 0;
            agi = a - aUsed;
            vUsed = 0;
            hlth = v - vUsed;

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

            //sheltom
            shelHpRegen = 0;
            shelMpRegen = 0;
            shelHpRecover = 0;
            shelMpRecover = 0;
            shelHpAdd = 0;
            shelMpAdd = 0;
            shelHpBoost = lvl/8;
            shelMpBoost = lvl/8;

            //bracelets
            bracDef = 0;
            bracAtk = 0;
            bracSpecDiv = 0;
            bracSpec = lvl/bracSpecDiv;
            bracCrit = 0.01;

            //gauntlets
            gauntDef = 0;
            gauntAbs = 0;
            gauntDefAdd = 0;
            gauntAbsAdd = 0;
            gauntAtkPwr = lvl/10;

            //boots
            bootsDef = 0;
            bootsAbs = 0;
            bootsDefAdd = 0;
            bootsAbsAdd = 0;
            bootsSpd = 0;
            bootsSpdAdd = 0;

            //weapon
            wpnAtkpwr1 = 0;
            wpnAtkpwr2 = 0;
            wpnAtkRtg = 0;
            wpnAtkCrit = 0;
            wpnAtkBlk = 0;
            wpnAtkpwrSpec = 0;
            wpnAtkRtgSpec = 0;
            wpnAtkCritSpec = 0;

            //armor
            armorDef = 0;
            armorAbs = 0;
            armorDefAdd = 0;
            armorAbsAdd = 0;

            //shield
            shieldDef = 0;
            shieldAbs = 0;
            shieldBlk = 0;
            shieldDefAdd = 0;
            shieldAbsAdd = 0;
            shieldBlkAdd = 0;

            //Resultado final das info
            atkRtg = (lvl * 1.9) + (a * 3.1) + (t * 1.5) + wpnAtkRtg + bracAtk + ring1AtkRtg + ring2AtkRtg;
            pdAtkMin = (3 + (tal + agi)/40 + wpnAtkpwr1);  // falta
            pdAtkMax = (5 + (tal + agi)/35 + wpnAtkpwr2);  // falta
            def = (lvl * 1.4) + a + (t * 0.25) + armorDef + armorDefAdd + gauntDef + gauntDefAdd + bracDef + bootsDef + bootsDefAdd + shieldDef + shieldDefAdd +
                    ring1Def + ring2Def;
            abs = (def/100) + (f/40) + (i/40) + (t/40) + (a/40) + (v/40) + (lvl/10) + ((ring1Abs != 0)?(ring1Abs + 0.5): 0) + ((ring2Abs != 0)?(ring2Abs + 0.5): 0) +
                    gauntAbs + gauntAbsAdd + bootsAbs + bootsAbsAdd + armorAbs + armorAbsAdd + ((shieldAbs != 0)?(shieldAbsAdd + 0.5): 0);
            vel = (1.4 + (v/150) + (t/150) + (lvl/150) + bootsSpd + bootsSpdAdd);

            hp = ( lvl * 2.1 ) + ( strg * 0.8 ) + ( hlth * 2.4 ) + 40;
            mp = ( lvl *0.6 ) + ( sprt * 2.2 );
            stm = ( lvl * 2.3 ) + ( strg * 0.5 ) + ( sprt * 1.0 ) + ( tal * 0.5 ) + ( hlth * 1.4 ) + 80;
            weight = ( strg * 2 ) + ( hlth * 1.5 ) + ( lvl * 3 ) + sprt + agi + 60;

            sp = (( lvl - 9) / 2) + ((lvl >54)?1 : 0) + ((lvl >69)?1 : 0) + ((lvl >79)?2 : 0);
            ep = ( lvl - 59) / 2;

            pointsView.setText("Avaiable points: " + stats);
            hpView.setText("HP: " +  hp);
            mpView.setText("MP: "+ mp);
            stmView.setText("STM: " + stm);

            weightView.setText("weight: " + weight); //universal

        }
/*
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
        }*/




}
