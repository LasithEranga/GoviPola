package com.example.govipola.modal;

public class HomeModel {
    Integer id;
    Integer imgUrl;

    public HomeModel(Integer id, Integer imgUrl) {
        this.id = id;
        this.imgUrl = imgUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;

    }
}
