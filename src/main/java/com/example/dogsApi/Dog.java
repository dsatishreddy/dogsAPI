package com.example.dogsApi;

import java.util.Map;

public class Dog {

    private Integer id;
    private String name;
    private String countryCode;
    private String bredFor;
    private String breedGroup;
    private String lifeSpan;
    private String temperament;
    private String origin;
    private String referenceImageId;
    private Map<String, String> weight;
    private Map<String, String> height;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getBredFor() {
        return bredFor;
    }

    public void setBredFor(String bredFor) {
        this.bredFor = bredFor;
    }

    public String getBreedGroup() {
        return breedGroup;
    }

    public void setBreedGroup(String breedGroup) {
        this.breedGroup = breedGroup;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getReferenceImageId() {
        return referenceImageId;
    }

    public void setReferenceImageId(String referenceImageId) {
        this.referenceImageId = referenceImageId;
    }

    public Map<String, String> getWeight() {
        return weight;
    }

    public void setWeight(Map<String, String> weight) {
        this.weight = weight;
    }

    public Map<String, String> getHeight() {
        return height;
    }

    public void setHeight(Map<String, String> height) {
        this.height = height;
    }
}
