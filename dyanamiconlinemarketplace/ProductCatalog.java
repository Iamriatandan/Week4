package dyanamiconlinemarketplace;
import java.util.*;
public class ProductCatalog <T extends ProductCategory>{
    private List<Product<T>> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product<T> product) {
        productList.add(product);
    }

    public void displayCatalog() {
        for (Product<T> product : productList) {
            product.displayProductDetails();
        }
    }
}
