package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car c1 = new Car("Peugeot", "307", "60l", 0, 0, "N", false, 0);

         System.out.println("\nCaso 1: Acender coche valor tacometro correcto ");
        c1.start();
        System.out.println("Valor tacometro: " + c1.tachometer);
        c1.stop();

  /*      System.out.println("\nCaso 2: Acender coche xa acendido");
        c1.start();
        c1.start();
        c1.stop();*/

        System.out.println("\nCaso 3: Apagar coche valor tacometro correcto");
        c1.start();
        c1.stop();
        System.out.println(c1.tachometer);

        System.out.println("\nCaso 4: Apagar coche en movemento");
        c1.start();
        c1.accelerate();
        c1.stop();

        System.out.println("\nCaso 5: Acelerar coche");
        c1.start();
        c1.accelerate();
        System.out.println(c1.speedometer);
        c1.brake();
        c1.stop();

        System.out.println("\nCaso 6: Acelerar maxima velocidade");
        c1.start();
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.accelerate();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.stop();

        System.out.println("\nCaso 6: Decelerar coche");
        c1.start();
        c1.accelerate();
        c1.accelerate();
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.stop();

        System.out.println("\nCaso 7: Decelerar coche maximo");
        c1.start();
        c1.accelerate();
        c1.brake();
        c1.brake();
        System.out.println("Velocidad actual: " + c1.speedometer);
        c1.stop();

        System.out.println("\nCaso 8: Xirar volante 20º");
        c1.turnAngleOfWheels(20);
        System.out.println("Angulo das rodas: " + c1.wheelsAngle);

        System.out.println("\nCaso 9: Xirar o volante mais +45/-45º");
        c1.turnAngleOfWheels(-1);
        System.out.println("Angulo das rodas: " + c1.wheelsAngle);
        c1.turnAngleOfWheels(1);
        System.out.println("Angulo das rodas: " + c1.wheelsAngle);
        c1.turnAngleOfWheels(-50);
        System.out.println("Angulo das rodas: " + c1.wheelsAngle);

        System.out.println("\nCaso 10: Marcha atrás");
        c1.start();
        c1.accelerate();
        c1.brake();
        c1.setReverse(c1.isReverse());
        System.out.println(c1.gear);
        c1.brake();
        c1.stop();

        System.out.println("\nCaso 11: Por marcha tras se o coche esta acelerando");
        c1.start();
        c1.accelerate();
        c1.setReverse(c1.isReverse());
        System.out.println(c1.gear);
        c1.brake();
        c1.stop();

        System.out.println("\nCaso 12: Acelerar con marchas atras");
        c1.start();
        c1.setReverse(c1.isReverse());
        c1.accelerate();
        System.out.println(c1.gear);
        System.out.println(c1.speedometer);
        c1.brake();
        c1.stop();

        System.out.println("\nCaso 12: Acelerar con marchas atras");
        c1.showDetails();

    }

}