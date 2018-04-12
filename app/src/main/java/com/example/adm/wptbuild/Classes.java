package com.example.adm.wptbuild;


public class Classes extends MainActivity {

    public class ClasseFs {

        public int f = 28, i = 6, t = 21, a = 17, v = 27;

        public ClasseFs() {

            lvl = 130;
            //lvl = Integer.parseInt(lvlText.getText().toString());

            stats = (( lvl - 9) * 5) + (( lvl - 79) * 2) + (( lvl - 89) * 3) + 25;

            atk = ((lvl * 1.9) + (a * 3.1) + (t * 1.5));
            pdAtkMin = (2 +(50));  // falta
            getPdAtkMax = (5);  // falta
            def = ((lvl * 1.4) + a + (t * 0.25));
            abs = ((def/100) + (f/40) + (i/40) + (t/40) + (a/40) + (v/40) + (lvl/10));  // falta
            vel = (1.4 + (v/150) + (t/150) + (lvl/150) + bootsVel);
            hp = ( lvl * 2.1 ) + ( f * 0.8 ) + ( v * 2.4 );
            mp = ( lvl *0.6 ) + ( i * 2.2 ) + additional;
            stm = ( lvl * 2.3 ) + ( f * 0.5 ) + ( i * 1.0 ) + ( t * 0.5 ) + ( v * 1.4 ) + 80;
            wheight = ( f * 2 ) + ( v * 1.5 ) + ( lvl * 3 ) + i + a + 60;
            sp = (( lvl - 9) / 2) + 2;
            ep = ( lvl - 59) / 2;

            pointsView.setText("Avaiable points: " + stats);
            hpView.setText("HP: " +  hp);
            mpView.setText("MP: "+ mp);
            stmView.setText("STM: " + stm);
            wheightView.setText("Wheight: " + wheight);

        }

        public ClasseFs(int f, int i, int a, int t, int v) {
            super();
            this.f = f;
            this.i = i;
            this.t = t;
            this.a = a;
            this.v = v;


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

    }
}
