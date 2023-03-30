class Item {
    private String name;
    private double fullPrice;
    private double salesPrice;

    public Item(String name, double fullPrice, double salesPrice) {
        this.name = name;
        this.fullPrice = fullPrice;
        this.salesPrice = salesPrice;
    }

    public Item(String name, double fullPrice) {
        this(name, fullPrice, fullPrice / 2);
    }

    public static String format(double value) {
        if (value < 0) {
            return "$0.00";
        }
        String formatted = String.format("%.2f", value);
        if (formatted.indexOf(".") == formatted.length() - 2) {
            formatted += "0";
        }
        return "$" + formatted;
    }

    public String toString() {
        return String.format("Item: %s Full price: %s Sales price: %s",
                name, format(fullPrice), format(salesPrice));
    }
}