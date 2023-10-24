public class CPU {

    public class Processor {
        public void process() {
            System.out.println("Processing data...");
        }
    }

    public class RAM {
        private int size;

        public RAM(int size) {
            this.size = size;
        }

        public void printSize() {
            System.out.println("RAM size: " + size + "GB");
        }
    }

}
