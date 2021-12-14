public class Archer extends Role  {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    String name;

    Archer(String rolename,int roleHP, int roleMP, int roleATTACK) {
        super(rolename,roleHP, roleMP, roleATTACK);
    }
}
