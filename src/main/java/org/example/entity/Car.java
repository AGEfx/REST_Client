package org.example.entity;





public class Car {

    private int id;
    private String name;
    private String model;
    private String type;
    private int horsePowers;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", horsePowers=" + horsePowers +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public Car( String name, String model, String type, int horsePowers) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.horsePowers = horsePowers;
    }

    public Car() {
    }
}
