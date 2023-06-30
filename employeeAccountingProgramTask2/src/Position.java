public enum Position {
    qa(4),
    programmer(8),
    director(10);

    private int bonus;

    Position(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
}
