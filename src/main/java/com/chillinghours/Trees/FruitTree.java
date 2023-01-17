package com.chillinghours.Trees;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class FruitTree {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String treeId;
    private String varietyName;
    private String genus;
    private String species;
    private boolean rootstock;
    private boolean triploid;
    private boolean selfFertile;
    private String info;
    private String fruitRipenDates;
    private FruitTree rootStock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isRootstock() {
        return rootstock;
    }

    public void setRootstock(boolean rootstock) {
        this.rootstock = rootstock;
    }

    public boolean isTriploid() {
        return triploid;
    }

    public void setTriploid(boolean triploid) {
        this.triploid = triploid;
    }

    public boolean isSelfFertile() {
        return selfFertile;
    }

    public void setSelfFertile(boolean selfFertile) {
        this.selfFertile = selfFertile;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getFruitRipenDates() {
        return fruitRipenDates;
    }

    public void setFruitRipenDates(String fruitRipenDates) {
        this.fruitRipenDates = fruitRipenDates;
    }

    public FruitTree getRootStock() {
        return rootStock;
    }

    public void setRootStock(FruitTree rootStock) {
        this.rootStock = rootStock;
    }
}
