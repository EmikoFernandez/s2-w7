import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * WildlifeSimulator - Manages population dynamics for multiple species
 * Uses an array of Species objects to store and simulate species data
 */
public class WildlifeSimulator {
    private Species[] species;
    private int speciesCount;
    
    public WildlifeSimulator(int maxSpecies) {
        //TODO
        species = new Species[maxSpecies];
    }
    
    /**
     * Add a species to the simulator
     */
    public void addSpecies(Species s) {
        //TODO
        species[speciesCount++] = s;
    }
    
    /**
     * Simulate one year of population changes for all species
     */
    public void simulateYear() {
        //TODO
        for(int i = 0; i < speciesCount; i++){
            if(species[i] != null)
            species[i].simulateYear();
        }
    }
    
    /**
     * Simulate multiple years
     */
    public void simulate(int years) {
        //TODO
        for(int i = 0; i < years; i++){
            simulateYear();
        }
    }

    public void writeYear(int year){
        String filename = "year_" + year + ".txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
        for (int i = 0; i < speciesCount; i++) {
            writer.write(species[i].toString());
            writer.newLine();
        }
    } catch (IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
    }
    }
    
    /**
     * Get species at given index
     */
    public Species getSpecies(int index) {
        //TODO
        return species[index];
    }
    
    /**
     * Get species info as formatted string
     */
    public String getSpeciesInfo(int index) {
        return species[index].toString();
    }

    public String toString(){
        String m = "";
        for(Species s: species){
            if (s != null)
                m += s.toString() + "\n";
        }
        return m;
    }
    
    /**
     * Get total wildlife count across all species
     */
    public double getTotalPopulation() {
        //TODO
        double total = 0;
        for(int i = 0; i < speciesCount; i++){
            total += species[i].getPopulation();
        }
        return total;
    }
    
    /**
     * Find the species with largest population
     */
    public int getMostPopulousIndex() {
        //TODO
        int maxPopIndex = 0;
        for (int x = 1; x< this.speciesCount; x++){
            if(this.species[maxPopIndex].getPopulation() < this.species[x].getPopulation()){
                maxPopIndex = x;
            }
        }
        return maxPopIndex;
    }
    
    /**
     * Find the species with smallest population (most endangered)
     */
    public int getMostEndangeredIndex() {
        //TODO
        int minPopIndex = 0;
        for (int x = 1; x < this.speciesCount; x++){
            if(this.species[minPopIndex].getPopulation() > this.species[x].getPopulation()){
                minPopIndex = x;
            }
        }
        return minPopIndex;
    }
    
    public int getSpeciesCount() {
        return speciesCount;
    }
    
    /**
     * Get array of all species
     */
    public Species[] getSpeciesArray() {
        return species;
    }
}
