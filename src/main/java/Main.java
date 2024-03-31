public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService();
        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();

        createAnimalService.createAnimals();
        CreateAnimalServiceImpl.createAnimals(5);
        createAnimalServiceImpl.createAnimals();

        Example example = new Example();
        System.out.println(example.hashCode());
    }
}
