import Classes.ItemFactory;
import Classes.Rewards.*;

public class Main {
    public static void main(String[] args) {
        ItemFactory factory = new GoldGenerator();
        ItemFactory factory1 = new GemGenerator();
        ItemFactory factory2 = new EmeraldGenerator();
        ItemFactory factory3 = new CoilGenerator();
        ItemFactory factory4 = new RockGenerator();
        ItemFactory factory5 = new AmetistGenerator();
        ItemFactory factory6 = new SilverGenerator();
        ItemFactory factory7 = new GlassGenerator();
        factory.openReward();
        factory1.openReward();
        factory2.openReward();
        factory3.openReward();
        factory4.openReward();
        factory5.openReward();
        factory6.openReward();
        factory7.openReward();
    }
}