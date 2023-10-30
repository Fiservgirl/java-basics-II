public abstract class Vehicle {
    String model;
    int year; 
    String Brand; 

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setBrand(String Brand){
        this.Brand = Brand; 
    }

    public String getModel(){
        return model; 
    }
    
    public int getYear(){
        return year;
    }

    public String getBrand(){
        return Brand;
    }
}
    

