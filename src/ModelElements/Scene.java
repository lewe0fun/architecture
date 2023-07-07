package ModelElements;

import Stuff.Type;

import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public Camera camera;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, Camera camera) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.camera = camera;
    }

    public Type method1(Type type) {
        return null;
    }

    public Type method2(Type type1, Type type2) {
        return null;
    }
}
