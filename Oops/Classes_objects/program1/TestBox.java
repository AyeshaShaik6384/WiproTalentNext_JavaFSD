public class TestBox {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please enter width, height and depth.");
            return;
        }

        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double depth = Double.parseDouble(args[2]);

        Box box = new Box(width, height, depth);

        System.out.println("Volume of Box = " + box.getVolume());
    }
}