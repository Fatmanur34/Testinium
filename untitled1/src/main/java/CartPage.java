import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage {
    int TotalPrize;
    int i==0;
    int m[];
    int x==0;
    int y;

    By productNameLocator = new By.ByCssSelector("Haki uzun yaka ceket ");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0 ;
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
    private List<WebElement> getProductsPrize(){
        By productsPrizeLocator;
        return findAll(productsPrizeLocator);
        int ProductCount;
        for(y=0; y<=ProductCount;y++){
        i == productsPrizeLocator(y);
        m[x]=i;
        x = x+1;
    }
    TotalPrize =  m[x];
}