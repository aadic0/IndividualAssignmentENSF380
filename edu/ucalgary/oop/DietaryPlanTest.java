package edu.ucalgary.oop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DietaryPlanTest {
    @Test
    public void testSetAndGetDietaryPlan() {
        DietaryPlan plan = new DietaryPlan();

        plan.setDietaryPlan("AVML");
        assertEquals("AVML", plan.getDietaryPlan());

        plan.setDietaryPlan("DBML");
        assertEquals("DBML", plan.getDietaryPlan());

    }
}
