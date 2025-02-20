package SpecialQuestion;

import SpecialQuestion.shape.GeoShapes;

public class UsingGeoShape {
    public static void main(String[] args) {

//        using the square property
        GeoShapes sqr=new GeoShapes();
        sqr.SquareProperty(5);

//        using the rectangle property
        GeoShapes rec=new GeoShapes();
        rec.RectangleProperty(5,4);

//        using sphere property
        GeoShapes sph=new GeoShapes();
        sph.SphereProperty(5);

//        using Cylinder property
        GeoShapes ch=new GeoShapes();
        ch.CylinderProperty(5,6);


    }
}
