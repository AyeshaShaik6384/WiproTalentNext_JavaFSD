class Box {

    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}