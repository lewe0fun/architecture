package ModelElements;

import java.util.List;
import java.util.ArrayList;

public class PolygonalModel {
    public List<Texture> textures;
    public List<Polygon> polygons;

    public PolygonalModel(List<Texture> textures) {
        this.textures = textures;
        polygons =new ArrayList<>();
    }


}
