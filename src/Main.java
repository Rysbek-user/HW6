public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(550);
        boss.setDamage(60);

        Weapon bossWeapon = new Weapon();
        bossWeapon.setType(WeaponType.SWORD);

        bossWeapon.setName("Excalibur");
        boss.setWeapon(bossWeapon);

        boss.printInfo();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(50);

        Weapon skeleton1Weapon = new Weapon();
        skeleton1Weapon.setType(WeaponType.COLD);

        skeleton1Weapon.setName("AK-47");
        skeleton1.setWeapon(skeleton1Weapon);
        skeleton1.setArrowCount(5);

        skeleton1.printInfo();

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(200);
        skeleton2.setDamage(40);

        Weapon skeleton2Weapon = new Weapon();
        skeleton2Weapon.setType(WeaponType.MAGIC);

        skeleton2Weapon.setName("Tom Riddle's Wand");
        skeleton2.setWeapon(skeleton2Weapon);
        skeleton2.setArrowCount(10);

        skeleton2.printInfo();


    }
}