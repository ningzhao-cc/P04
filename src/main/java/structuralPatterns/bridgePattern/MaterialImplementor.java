package structuralPatterns.bridgePattern;


import structuralPatterns.materials.MaterialType;

/**
 * Created by Ning on 4/9/18.
 */
public interface MaterialImplementor {
    void setMaterialType(MaterialType materialType);
    MaterialType getMaterialType();
}
