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

    }
    void getCurrentStatus2() {
        System.out.println("職業:" + this.name);
        System.out.println("HP:" + this.HP);
        System.out.println("MP:" + this.MP);
        System.out.println("ATTACK:" + this.ATTACK);
        System.out.println(this.name+"拿起了嗜血者!" );
        System.out.println(this.name+"開始蓄力!"+"使用技能 撕裂斬");
    }
    void getCurrentStatus3() {
        System.out.println("職業:" + this.name);
        System.out.println("HP:" + this.HP);
        System.out.println("MP:" + this.MP);
        System.out.println("ATTACK:" + this.ATTACK);
        System.out.println(this.name+"拿起了瑞蘭颶風箭!" );
        System.out.println(this.name+"開始蓄力!"+"使用技能 腐蝕箭雨");
        System.out.println("哈哈是我啦");

    }






}
