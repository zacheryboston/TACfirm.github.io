package javaTest.monsterUnited;
class Ogre extends Monster {
    private int weaponCount;

    public int getDamage() {
        if (weaponCount == 0) {
            return 5;
        } else if (weaponCount == 1) {
            return 10;
        } else {
            return 20;
        }
    }

    // constructor, getters, setters, and other methods
}
