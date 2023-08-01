package service;

import model.Plane;

public interface Service {
    Plane create();

    Plane[] createPlainArray(int arrayLength);

    void task1PrintInfo(Plane plane);

    void task2(Plane plane);

    Plane task3(Plane plane1, Plane plane2);

    Plane task4(Plane plane1, Plane plane2);

    void task5(Plane plane1, Plane plane2, Plane plane3);

    void task6(Plane[] planes);

    void task7(Plane[] planes);

    Plane task8(Plane[] planes);

    Plane task9(Plane[] planes);

    void task10(Plane[] planes);
}
