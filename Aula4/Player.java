package Aula4;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        int rankingComparison = Integer.compare(this.ranking, otherPlayer.ranking);
        if (rankingComparison != 0) {
            return rankingComparison;
        }
        return Integer.compare(this.age, otherPlayer.age);
    }

    @Override
    public String toString() {
        return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
    }
}
