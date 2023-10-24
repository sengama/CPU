public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM(16);

        processor.process();
        ram.printSize();

        MotherBoard motherboard = new MotherBoard();
        MotherBoard.USB usb = new MotherBoard.USB();

        usb.transferData();
    }
}

