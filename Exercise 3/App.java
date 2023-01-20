public class App {
    public static void main(String[] args) {

        Character soulreaper = new Character();

        soulreaper .strength = 100;
        soulreaper .agility = 100;
        soulreaper .intelligence =50;
        soulreaper .name = "Ichigo";
        soulreaper .sayMyName();
        soulreaper .Attack();

        Character mage = new Character();

        mage.strength = 5;
        mage.agility = 10;
        mage.intelligence = 40;
        mage.name = "Gon";
        mage.sayMyName();
        mage.Attack();

        Character thief = new Character();

        thief.strength = 4;
        thief.agility = 20;
        thief.intelligence = 1;
        thief.name = "KranDwarf";
        thief.sayMyName();
        thief.Attack();

        Weapon Katana = new Weapon();

        Katana.name = "Zambaktu";
        Katana.damage = 999;
        Katana.rarity = "Bakai";
        Katana.addDamage(1);
        System.out.print(Katana.nameRarity());

    }
}
