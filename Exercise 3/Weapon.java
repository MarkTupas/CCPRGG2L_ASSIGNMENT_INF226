public class Weapon {
    String name;
    int damage;
    String rarity;

    String nameRarity() {
        return rarity + "" + name;
    }

    void addDamage (int addDamage) {
        int newDamage = this.damage + addDamage;
        System.out.println("Damage increased from " + this.damage + " to " + newDamage);

        this.damage = newDamage;
    }
}