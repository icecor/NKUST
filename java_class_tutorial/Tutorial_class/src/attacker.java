public class attacker extends Role {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    String name;

    attacker(String rolename,int roleHP, int roleMP, int roleATTACK) {
        super(rolename,roleHP, roleMP, roleATTACK);
   }
}
