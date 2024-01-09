import org.example.CabInvoice;
import org.example.EnhancedInvoice;
import org.example.Ride;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        Ride ride1 = new Ride(10,10);
        Ride ride2 = new Ride(20,20);
        Ride ride3 = new Ride(30,30);
        List<Ride> rideList = new ArrayList<>();
        rideList.add(ride1);
        rideList.add(ride2);
        rideList.add(ride3);
        double totalFares = cabInvoice.calculateMultipleFares(rideList);
        Assert.assertEquals(660,totalFares,0);
    }

    @Test
    public void enhancedInvoice() {
        Ride ride1 = new Ride(10,10);
        Ride ride2 = new Ride(20,20);
        Ride ride3 = new Ride(30,30);
        List<Ride> rideList = new ArrayList<>();
        rideList.add(ride1);
        rideList.add(ride2);
        rideList.add(ride3);
        EnhancedInvoice enhancedInvoice = cabInvoice.enhancedInvoice(rideList);
        System.out.println(enhancedInvoice);
        Assert.assertEquals(3, enhancedInvoice.getTotalNumberOfRides(),0);
        Assert.assertEquals(660, enhancedInvoice.getTotalFare(),0);
        Assert.assertEquals(220, enhancedInvoice.getAverageFarePerRide(),0);
    }

}
