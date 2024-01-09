import org.example.CabInvoice;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    CabInvoice cabInvoice = new CabInvoice();
    @Test
    public void calculateFare() {
        double distance = 10;
        int time = 10;
        double result = cabInvoice.calculateFare(distance, time);
        Assert.assertEquals(110,result,0);
    }

    @Test
    public void calculateMultipleFares() {
        double distance[] = {10,20};
        int time[] = {10,30};
        double result = cabInvoice.calculateMultipleFares(distance, time);
        Assert.assertEquals(340,result,0);
    }
}
