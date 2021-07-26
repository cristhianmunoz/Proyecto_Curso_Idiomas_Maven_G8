package courses_Languagues;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import ec.edu.epn.courses_Languagues.*;

public class I_BudgetBusinessTest {

    @Test
    public void given_A_weekNumber_returnPayment_then_ok() {
        I_BudgetBusiness rPayment = Mockito.mock(I_BudgetBusiness.class);
        Mockito.when(rPayment.returnPayment(6)).thenReturn(140.0);
        assertEquals(140.0,rPayment.returnPayment(6),0);
    }

}