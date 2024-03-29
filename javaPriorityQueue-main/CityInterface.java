public interface CityInterface {
    int getID();
    String getName();
    int getPopulation();
    int getInfluenzaCases();
    void setID(int ID);
    void setName(String name);
    void setPopulation(int population);
    void setInfluenzaCases(int influenzaCases);
    int compareTo(City otherCity);
    double calculateDensity();
}
