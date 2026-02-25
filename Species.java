/**
 * Species - Represents a single wildlife species with its characteristics
 */
public class Species {
    private String name;
    private int population;
    private double birthRate;
    private double deathRate;
    private int habitatCapacity;
    private String location;
    
    /**
     * Constructor for Species
     */
    public Species(String name, int population, double birthRate, 
                   double deathRate, int habitatCapacity, String location) {
        this.name = name;
        this.population = population;
        this.birthRate = birthRate;
        this.deathRate = deathRate;
        this.habitatCapacity = habitatCapacity;
        this.location = location;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public long getPopulation() {
        return population;
    }
    
    public double getBirthRate() {
        return birthRate;
    }
    
    public double getDeathRate() {
        return deathRate;
    }
    
    public long getHabitatCapacity() {
        return habitatCapacity;
    }
    
    public String getLocation() {
        return location;
    }
    
    // Setters
    public void setPopulation(long population) {
        this.population = population;
    }
    
    /**
     * Simulate one year of population change
     * Population change = (births - deaths) but capped at habitat capacity
     */
    public void simulateYear() {
        //TODO
    }
    
    /**
     * Return formatted string representation of the species
     */
    public String toString() {
        return String.format("%s: %,d (Location: %s)", name, population, location);
    }
}
