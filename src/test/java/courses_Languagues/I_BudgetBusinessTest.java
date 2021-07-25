package courses_Languagues;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import ec.edu.epn.courses_Languagues.*;

public class I_BudgetBusinessTest {

    @Test
    public void given_one_double_then_recalculateBudget_ok() {
        I_BudgetBusiness bb = Mockito.mock(I_BudgetBusiness.class);
        Mockito.when(bb.recalculateBudget(450.6)).thenReturn(669.6);
        assertEquals(669.6,bb.recalculateBudget(450.6),1120);
    }

    @Test
    public void given_one_double_then_recalculateBudget_error() {
        I_BudgetBusiness bb = Mockito.mock(I_BudgetBusiness.class);
        Mockito.when(bb.recalculateBudget(450.6)).thenReturn(669.6);
        assertEquals(0,bb.recalculateBudget(450),-1120);

    }
}