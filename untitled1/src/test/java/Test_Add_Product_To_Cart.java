import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductsPage;

import java.util.Scanner;


public class Test_Add_Product_To_Cart extends BaseTest {
    int Pagex;
    int ProductCount;
    int input;
    int PageController;
    Scanner input = new Scanner(System.in);
    if input == 1 {
        homePage = new HomePage(input);

    }

    HomePage homePage ;
    ProductsPage productsPage ;
    ProductDetailPage productDetailPage ;
    CartPage cartPage ;

    @Test
    @Order(1)
//    @Disabled("Due to BUG-123 disabled")
    public void search_a_product(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Ceket");
        Assertions.assertTrue(productsPage.isOnProductPage(1),
                "Not on products page!");

        if PageController==1;
        productsPage.isOnProductPage(Pagex){
            Assertions.assertTrue(productsPage.isOnProductPage(Pagex);
        }
    }

    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage();
    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp();

    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded();

    }

}
