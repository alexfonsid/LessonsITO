package level4.lesson10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("electricEngine")
    private Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}

interface Engine {
}

@Component
class UsualEngine implements Engine {
    @Override
    public String toString() {
        return "UsualEngine{}";
    }
}

@Component
class ElectricEngine implements Engine {
    @Override
    public String toString() {
        return "ElectricEngine{}";
    }
}
