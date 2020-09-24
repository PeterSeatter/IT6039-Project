package packer;

/**
 *
 * @author I.M.Bad
 */
public class Product {

    private String name;
    private int weight;
    private boolean overweight = false;
    private boolean hazardous;
    private boolean fragile;

    public Product(String name, int weight,boolean overweight, boolean hazardous, boolean fragile) {
        this.name = name;
        this.weight = weight;
        this.overweight = overweight;
        this.hazardous = hazardous;
        this.fragile = fragile;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }
    
    public boolean overweight() {
        if(weight >= 20){
            overweight = true;
        }
        return overweight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hazardous
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * @return the fragile
     */
    public boolean isFragile() {
        return fragile;
    }

    public String toString() {
        return this.getName();
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }    
}
