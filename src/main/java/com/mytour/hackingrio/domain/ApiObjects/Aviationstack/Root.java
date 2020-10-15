package com.mytour.hackingrio.domain.ApiObjects.Aviationstack;

import java.util.ArrayList;

public class Root {

    Pagination PaginationObject;
    ArrayList< Data > data = new ArrayList < Data> ();

    public Root() {
    }

    public Pagination getPaginationObject() {
        return PaginationObject;
    }

    public void setPaginationObject(Pagination paginationObject) {
        PaginationObject = paginationObject;
    }

    public ArrayList<Data> getData() {
        return data;
    }

    public void setData(ArrayList<Data> data) {
        this.data = data;
    }
}
