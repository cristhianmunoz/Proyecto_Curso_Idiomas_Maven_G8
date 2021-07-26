package courses_Languagues;

import ec.edu.epn.courses_Languagues.BudgetBusines;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BudgetBusinesTest {

    BudgetBusines budget = null;

    @Before
    public void setup(){
        budget  = new BudgetBusines();
    }

    @Test
    public void given_oneDouble_when_budget_then_ok() {
        assertEquals(1120,budget.checkAmountFile(),0);
    }

    @Test(timeout = 150)
    public void given_oneDouble_when_recalculateBudget_then_ok(){
        assertEquals(639.5,budget.recalculateBudget(480.5),0);
    }
}