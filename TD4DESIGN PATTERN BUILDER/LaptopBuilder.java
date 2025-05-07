public class LaptopBuilder implements ComputerBuilder {
    private Computer computer;

    public LaptopBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel i7 Mobile");
    }

    @Override
    public void buildRam() {
        computer.setRam(16);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(512);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 3060 Mobile");
    }

    @Override
    public void setType() {
        computer.setType("Laptop");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
