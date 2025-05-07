public interface ComputerBuilder {
    void buildProcessor();
    void buildRam();
    void buildStorage();
    void buildGraphicsCard();
    void setType();
    Computer getResult();
}
