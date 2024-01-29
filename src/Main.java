public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Weapon bossWeapon = new Weapon(WeaponType.AXE, "Dragon Slayer");
        Boss boss = new Boss("Dragon Lord", 1000, 350, bossWeapon);

        System.out.println("Boss Name: " + boss.getName());
        System.out.println("Boss Health: " + boss.getHealth());
        System.out.println("Boss Damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type: " + boss.getWeapon().getWeaponType());
        System.out.println("Boss Weapon Name: " + boss.getWeapon().getWeaponName());
    }
}
