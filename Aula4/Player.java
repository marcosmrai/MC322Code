package Aula4;

public class Player implements Comparable<Player>, Cloneable {
    private int ranking;
    private String name;
    private int age;
    private Item item;

    public Player(int ranking, String name, int age, Item item) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
        this.item = item;
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

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public Object clone(){
        Item clone = (Item)item.clone();
        return new Player(this.ranking, this.name, this.age, clone);
    }
}
