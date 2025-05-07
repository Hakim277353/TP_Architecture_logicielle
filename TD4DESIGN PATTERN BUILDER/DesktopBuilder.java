public class DesktopBuilder implements ComputerBuilder {
    private Computer computer;

    public DesktopBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel i9 Desktop");
    }

    @Override
    public void buildRam() {
        computer.setRam(32);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(2000);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 4090");
    }

    @Override
    public void setType() {
        computer.setType("Desktop");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
