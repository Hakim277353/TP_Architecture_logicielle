public class Computer {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;
    private String type;

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram + "GB" +
                ", storage=" + storage + "GB" +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
