public abstract class Mammal {
    private int eyes;
    private int legs;
    private double weight;
    public static final int DEFAULT_EYES_NUMBER = 2;

    public Mammal() {
    }

    public void setEyes(int eyes) {
        if(eyes==2) {
            this.eyes = eyes;
        }
    }

    public void setLegs(Integer legs) {
        if(legs==4 || legs==2) {
            this.legs = legs;
        }
    }

    public void setWeight(Double weight) {
        if(weight>50) {
            this.weight = weight;
        }
    }

    public Integer getEyes() {
        if(eyes==2) {
            return eyes;
        }
        return DEFAULT_EYES_NUMBER;
    }

    public int getLegs() {
        return legs;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(){};
    public void run(){}
    public void sleep(){}
}
