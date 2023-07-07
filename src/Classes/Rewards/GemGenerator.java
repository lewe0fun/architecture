package Classes.Rewards;

import Classes.GemItem;
import Classes.ItemFactory;

public class GemGenerator extends ItemFactory {
    @Override
    public GemItem createItem() {
        GemReward gemReward = new GemReward();
        gemReward.open();
        return gemReward;

    }
}
