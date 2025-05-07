public class ComputerDirector {
    private ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        builder.setType();
        builder.buildProcessor();
        builder.buildRam();
        builder.buildStorage();
        builder.buildGraphicsCard();
        return builder.getResult();
    }
}
