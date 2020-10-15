package com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor;

import java.util.ArrayList;

public class RootApi {

    public ArrayList<Data> data = new ArrayList<>();

    public RootApi( ) {   }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }
}
