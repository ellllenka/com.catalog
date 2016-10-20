package com.catalog.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by lena on 09.06.16.
 */
@Entity
public class Good {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String snippet;
    private Integer price;
    private String mainImageUrl;

    @ElementCollection
    private List<String> description;

    @ElementCollection
    private List<String> images;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Good() {
    }

    public Good(String name, String snippet, List<String> description, Integer price, String mainImageUrl, List<String> images) {
        this.name = name;
        this.snippet = snippet;
        this.description = description;
        this.price = price;
        this.mainImageUrl = mainImageUrl;
        this.images = images;
    }
}
