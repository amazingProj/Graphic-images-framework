package geometries;

import primitives.*;

/**
 * Interface of the whole geometry shapes which gives the the ability to find a
 * normal and intersect with rays.
 *
 * @author bassi
 * @author asaf0
 */
public abstract class Geometry implements Intersectable {
    Color emission;
    public Material material;
    // ***************** Getters/Setters ********************** //

    /**
     * setter of the emission light of the geometry
     *
     * @param emission - the emission light color
     */
    public void setEmission(Color emission) {
        this.emission = emission;
    }

    /**
     * getter of the emission light of the geometry
     *
     * @return the emission light
     */
    public Color getEmission() {
        return emission;
    }

    /**
     * getter of the material of the geometry
     *
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Calculates unit vector orthogonal to the tangent plane at the point (which is
     * called - normal)
     *
     * @param p point of tangent...
     * @return normal vector
     */
    public abstract Vector getNormal(Point3D p);
}
