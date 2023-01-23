package javaTest.monsterUnited;
class Snake extends Monster {
    public int getDamage() {
        return (int)(health / 100 + 3);
    }

    // other methods
}
