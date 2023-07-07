package inMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore {
    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore() {
        models = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
    }

    public Scene getScene(int id) {
        return null;
    }

    public void notifyChange(IModelChanger changer) {

    }

}
