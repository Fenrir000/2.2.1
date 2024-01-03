package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", carId=" + carId +
                '}';
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }
}
