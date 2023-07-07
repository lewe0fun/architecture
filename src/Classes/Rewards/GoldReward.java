package Classes.Rewards;

import Classes.GemItem;

public class GoldReward implements GemItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}
