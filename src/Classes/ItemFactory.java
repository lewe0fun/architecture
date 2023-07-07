package Classes;

public abstract class ItemFactory {
    public void openReward(){
        GemItem gemItem=createItem();
    }
    public abstract GemItem createItem();
}
