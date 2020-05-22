package com.Rchambe9;

public class VirtualPet {


    public String name;

    public int thirst = 3;
    public int hunger = 3;
    public int energy = 3;
    public int chill = 4;



    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getChill() {
        return chill;
    }

    public int getEnergy() { return energy;}

    public int getThirst() { return thirst;
    }

    public VirtualPet(String name) {
        this.name = name;
    }


    public void hunger() {
        hunger--;
        thirst++;
    }

    public void thirst() {
        thirst -= 2;
    }

    public void energy() {
        energy++;
    }

    public void chill() {
        chill++;
    }
        public void tick () {
            hunger++;
            energy--;
            thirst++;
            chill++;
        }

    }
