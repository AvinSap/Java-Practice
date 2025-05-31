public class Engine {
    String engineType;
    double capacity;

    Engine(String engineType,double capacity) {
        this.engineType = engineType;
        this.capacity = capacity;
    }

        void getEngineDetails(){
        System.out.println("Type: "+ this.engineType);
        }

    }

