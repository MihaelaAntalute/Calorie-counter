package proiectFinal1;

import proiectFinal1.Product;

public class ProductCatalog {
    public static final int MAX_NO_OF_PRODUCTS = 100; //constanta
    Product[] listOfProducts = new Product[100]; // maxim 100 produse sunt acceptate in lista;
    int numberOfProducts = 0;

    public void printProducts() {
        //alegm numberOfProducts ca daca alegem lungimea posibil sa nu fie in toate 100 produse
        if (numberOfProducts == 0) {
            System.out.println("Nu exista produse in lista");
            return;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Produsele din lista sunt: " + listOfProducts[i]);
        }
    }

    public boolean addProduct(Product product) {
        boolean isProductFound;
        boolean isFullList = false;
        boolean isOnList = false;
        if (isOnList == true || isFullList == true) {
            isProductFound = false;
            System.out.println("Produsul nu poate fi adaugat");
        }
        if (isOnList == false || isFullList == false) {
        }
        listOfProducts[numberOfProducts] = product;
        numberOfProducts++;
        //sau doar listOfProducts[numberOfProducts++] = product;
        return true;
    }

    public Product getProductByName(String nameOfProduct) {
        boolean isOnList = false;
        Product foundProduct = new Product();
        for (int i = 0; i < numberOfProducts; i++) {
            if (listOfProducts[i].productName.equals(nameOfProduct)) {
                isOnList = true;
                System.out.println("Produsul este in lista");
                foundProduct = listOfProducts[i];
                break;
            }
        }
        return foundProduct;
    }


    public boolean deleteProduct(String productName) {
        int productIndex = getProductIndex(productName);
        if (productIndex == -1) {
            return false;
        }
        for (int i = productIndex; i < numberOfProducts; i++) {
            listOfProducts[i] = listOfProducts[i + 1];
        }
        listOfProducts[numberOfProducts] = null;
        numberOfProducts--;
        System.out.println("Produsul " + productName + " s-a sters ");

           return true;
}

    private int getProductIndex(String productName) {
        for (int i = 0; i < numberOfProducts; i++) {
            if (listOfProducts[i].productName.equals(productName)) {
                return i;
            }
        }
        return -1;

    }
}


