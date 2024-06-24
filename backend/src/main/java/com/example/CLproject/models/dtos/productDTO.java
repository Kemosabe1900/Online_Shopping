package com.example.CLproject.models.dtos;

public class productDTO {
    private String name;
    private int producerId;
    private String description;
    private Double price;
    private String image;

    public productDTO() {
    }

    public productDTO(String name, int producerId, String description, Double price, String image) {
        this.name = name;
        this.producerId = producerId;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int producerId) {
        this.producerId = producerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "productDTO{" +
                "name='" + name + '\'' +
                ", producerId=" + producerId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
