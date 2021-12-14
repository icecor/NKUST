public class Class_ex5 {
    public static void main(String[] args) {
        Magician Merlin = new Magician("魔法師",100, 400, 1000);
        Merlin.getCurrentStatus();

        System.out.println("=============");
        attacker poki = new attacker("戰士",500,20,2000);
        poki.getCurrentStatus();
        System.out.println("=============");
        Archer ash = new Archer("弓箭手",150,70,1500);
        ash.getCurrentStatus();

    }
}
