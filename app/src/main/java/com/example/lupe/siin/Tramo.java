package com.example.lupe.siin;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by lupe on 28/11/17.
 */

public class Tramo {
    public final String id;
    public final ArrayList<LatLng> coordenadas;
    public final int OBJECTID_1;
    public final int OBJECTID;
    public final float Distancia;
    public final int OBJECTID_2;
    public final String Poblacion;
    public final String Tramo;
    public final float Shape_Leng;
    public final String color;
    public final int proyId;
    public final int idSubproyecto;


    /**
     * Construye un nuevo {@link Tramo}.
     */

    public Tramo(String id, ArrayList<LatLng> coordenadas, int objectid_1, int objectid, float distancia, int objectid_2, String poblacion, String tramo, float shape_leng, String color, int proyId, int idSubproyecto) {
        this.id = id;
        this.coordenadas = coordenadas;
        OBJECTID_1 = objectid_1;
        OBJECTID = objectid;
        Distancia = distancia;
        OBJECTID_2 = objectid_2;
        Poblacion = poblacion;
        Tramo = tramo;
        Shape_Leng = shape_leng;
        this.color = color;
        this.proyId = proyId;
        this.idSubproyecto = idSubproyecto;
    }
}
