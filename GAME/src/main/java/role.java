public class role {

    int HP;
    int MP;
    int ATTACK;
    String name;



    role(String rolename, int roleHP, int roleMP, int roleATTACK) {
        this.HP = roleHP;
        this.MP = roleMP;
        this.ATTACK = roleATTACK;
        this.name = rolename;

    }

    void getCurrentStatus() {
        System.out.println("職業:" + this.name);
        System.out.println("HP:" + this.HP);
        System.out.println("MP:" + this.MP);
        System.out.println("ATTACK:" + this.ATTACK);
        System.out.println(this.name+"拿起了大天使之杖!" );
        System.out.println(this.name+"開始蓄力!"+"使用技能 豪火球");

        //testasd
//testasd
        //testasd

    }
    void getCurrentStatus2() {
        System.out.println("職業:" + this.name);
        System.out.println("HP:" + this.HP);
        System.out.println("MP:" + this.MP);
        System.out.println("ATTACK:" + this.ATTACK);
        System.out.println(this.name+"拿起了無盡之刃!" );
        System.out.println(this.name+"開始蓄力!"+"累積能量...");
        System.out.println(this.name+"使用技能!"+"滅盡斬擊");
    }
    void getCurrentStatus3() {
        System.out.println("職業:" + this.name);
        System.out.println("HP:" + this.HP);
        System.out.println("MP:" + this.MP);
        System.out.println("ATTACK:" + this.ATTACK);
        System.out.println(this.name+"拿起了嗜血弓!" );
        System.out.println(this.name+"開始攻擊!"+"使用技能 烈焰火箭");
        System.out.println(this.name+"觸發被動!"+"使用技能 百發百中");

    }






}
