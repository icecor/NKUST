public class game {
    public static void main(String[] args) {
        Magician Merlin = new Magician("魔法師",15, 10, 30);
        Merlin.getCurrentStatus();

        System.out.println("=============");
        attacker poki = new attacker("戰士",20,5,15);
        poki.getCurrentStatus2();
        System.out.println("=============");
        Archer ash = new Archer("弓箭手",10,30,40);
        ash.getCurrentStatus3();


    }
}
