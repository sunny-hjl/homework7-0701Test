package com.test;

public class PersonEntity {
    private  int id;
    private  String name;
    private CarEntity carEntity;

    public PersonEntity() {
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

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    public boolean equals(Objeect o){
        if(this==o) return  true;
        if(o==null || getClass() !=o.getClass()) return  false;

        CarEntity carEntity=(CarEntity) o;

        if (id !=null ? !id.equals(carEntity.id) : carEntity.id !=null) return  false;
        if(name !=null ? !name.equals(carEntity.name) : carEntity.name != null) return  false;
        return true;
    }

    public  int hashCode(){
        int result = id !=null ? id.hashCode() :0;
        result =31 * result +(name != null ? name.hashCode() : 0);
    }
}
