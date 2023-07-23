public class Main {
    public static void main(String[] args) {

        HavingSuperAbility[] superAbilites = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < superAbilites.length; i++) {
            superAbilites[i].applySuperAbility();
            
        }
    }

    
}