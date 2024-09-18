public class Weapon {
    private WeaponType type;
    private String name;

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    //Здесь ошибка
    public void setName(String name) {
        this.name = name;
    }
}
