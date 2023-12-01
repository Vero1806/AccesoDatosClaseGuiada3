package org.example;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="city")
public class city {
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private int Population;
    private List<city> cities = new ArrayList<city>();
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getCountryCode() {
        return CountryCode;
    }
    public String getDistrict() {
        return District;
    }
    public int getPopulation() {
        return Population;
    }
    public List<city> getCities() {
        return cities;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setCountryCode(String countryCode) {
        this.CountryCode = countryCode;
    }
    public void setDistrict(String district) {
        this.District = district;
    }
    public void setPopulation(int population) {
        this.Population = population;
    }
    public void setCities(List<city> cities) {
        this.cities = cities;
    }
}
