package proiectFinal1;

public class Product {
    String productName;
    int grasimi;
    int carbohidrati;
    int proteine;
    int totalCalories;

    Product (String productName, int grasimi, int carbohidrati, int proteine){
        this.productName = productName;
        this.grasimi = grasimi;
        this.carbohidrati = carbohidrati;
        this.proteine = proteine;
    }

    public Product() {
    }


    public static int computeCalories(int grasimi, int carbohidrati, int proteine){
        int sum = grasimi + carbohidrati + proteine;
        return sum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", grGrasimi=" + grasimi +
                ", grCarbohidrati=" + carbohidrati +
                ", grProteine=" + proteine +
                ", totalCalories=" + totalCalories +
                '}';
    }
}
