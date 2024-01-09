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
}
