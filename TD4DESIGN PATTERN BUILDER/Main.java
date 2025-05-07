public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        
        LaptopBuilder laptopBuilder = new LaptopBuilder();
        director.setBuilder(laptopBuilder);
        Computer laptop = director.constructComputer();
        
        DesktopBuilder desktopBuilder = new DesktopBuilder();
        director.setBuilder(desktopBuilder);
        Computer desktop = director.constructComputer();
        
        System.out.println("Laptop configuration:");
        System.out.println(laptop);
        System.out.println("\nDesktop configuration:");
        System.out.println(desktop);
    }
}
