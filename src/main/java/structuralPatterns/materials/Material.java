package structuralPatterns.materials;

import structuralPatterns.bridgePattern.ColorImplementor;
import structuralPatterns.bridgePattern.MaterialImplementor;

/**
 * Created by Ning on 4/9/18.
 */
public class Material {
    private MaterialType materialType;
    private MaterialImplementor materialImplementor;

    public void setMaterialType(MaterialType colorType) {}

    public MaterialType getMaterialType() {
        return materialType;
    }


    public Material(MaterialImplementor materialImplementor) {
        this.materialImplementor = materialImplementor;
    }

    public Material() {}

    public void print() {}
}
