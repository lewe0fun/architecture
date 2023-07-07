import Classes.GemItem;
import Classes.ItemFactory;
import Classes.Rewards.GemGenerator;
import Classes.Rewards.GoldGenerator;

public class Main {
    public static void main(String[] args) {
        ItemFactory factory = new GoldGenerator();
        ItemFactory factory1= new GemGenerator();
        factory.openReward();
        factory1.openReward();
    }
}