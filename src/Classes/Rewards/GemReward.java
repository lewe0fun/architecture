package Classes.Rewards;

import Classes.GemItem;

public class GemReward implements GemItem {
    @Override
    public void open() {
        System.out.println("gem");
    }
}
