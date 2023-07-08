package Classes;

public abstract class ItemFactory {
    public void openReward(){
        RewardItem rewardItem =createItem();
    }
    public abstract RewardItem createItem();
}
