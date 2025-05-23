package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car() {
    }

    public Car(String brand, String model, String fuel, int speedometer, int tachometer, String gear, boolean reverse, int wheelsAngle) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.speedometer = speedometer;
        this.tachometer = tachometer;
        this.gear = gear;
        this.reverse = reverse;
        this.wheelsAngle = wheelsAngle;
    }

    public void start() {
        if (isTachometerEqualToZero()) {
            this.tachometer = 1000;
            System.out.println("O vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (isTachometerGreaterThanZero() && this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    /* Comprobamos que el tacometro es cero
    tachometer0 = false , es decir no esta a cero*/
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0 ? true:false;
    }

    public boolean isTachometerGreaterThanZero() {
        if (this.tachometer > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //
    public void accelerate() {
        if (isTachometerEqualToZero() == true) {
            System.out.println("El coche no esta encendido, no se puede acelerar");
        }
        else {
            this.speedometer += 10;
            if (this.speedometer >= 120) {
                this.speedometer = MAX_SPEED;
                System.out.println("Velocidad maxima, non se pode acelerar mais");
            }
        }
    }

    public void brake() {
        if (isTachometerEqualToZero()== true) {
            System.out.println("El coche no esta encendido, no se puede frenar");
        }
        else {
            this.speedometer -= 10;
            if (this.speedometer <= 0) {
                this.speedometer = 0;
                this.tachometer = 1000;
                System.out.println("Coche frenado, no hay velocidad");
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        this.wheelsAngle += angle;
        if (this.wheelsAngle > 45) {
            this.wheelsAngle = 45;
            System.out.println(showSteeringwheelDetail());
            System.out.println("Non se pode xirar mais o volante");
        }
        else if (this.wheelsAngle + angle < -45) {
            this.wheelsAngle = -45;
            System.out.println(showSteeringwheelDetail());
            System.out.println("Non se pode xirar mais o volante");
        }
    }

    public String showSteeringwheelDetail() {
        if (this.wheelsAngle >= 0) {
            return "Rodas a dereita";
        }
        else {
            return "Rodas a esquerda";
        }
    }

    //Metodo que le asigna el valor a la variable reverse
    public boolean isReverse() {
        if (this.gear.toUpperCase() == "R") {
            return this.reverse = true;
        }
        else
            return this.reverse = false;
    }

    public void setReverse(boolean reverse) {
        if (tachometer > 0 && speedometer == 0) {
            this.gear = "R";
            isReverse();
            System.out.println("Marcha atras posta");
        } else if (tachometer > 0 && speedometer > 0) {
            this.gear = "N";
            isReverse();
            System.out.println("Non podes ponher marcha atras mentres aceleras");

        }
    }

    public void showDetails() {
        System.out.println("Car: " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", speedometer=" + speedometer +
                ", tachometer=" + tachometer +
                ", gear='" + gear + '\'' +
                ", reverse=" + reverse +
                ", steeringwheelAngle=" + wheelsAngle);
    }
}
