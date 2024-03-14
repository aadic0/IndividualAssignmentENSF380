import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class EnterDisasterVictimTest {

    private InterfaceImpl impl;
    ArrayList<MedicalRecord> recordsToSet = new ArrayList<>();
    ArrayList<DisasterVictim> = new ArrayList<>();



    @Before
    public void setup(){
        impl = new InterfaceImpl();
    }


    @Test
    public void testEnterDisasterVictim() {

        boolean worked = false;

        DisasterVictim victim = new DisasterVictim("John Doe", "2000-01-01");
        impl.enterDisasterVictim(victim);

        worked = true;
        
        assertTrue("testEnterDisasterVictim should add a disasterVictim.", worked);

    }

    @Test
    public void testEnterMedicalInformation() {
        InterfaceImpl impl = new InterfaceImpl();
        boolean worked = false;
        ArrayList<MedicalRecord> records = new ArrayList<>();

        impl.enterMedicalInformation(records);
        worked = true;
        assertTrue("testEnterMedicalInformation should add a medical record.", worked);
    }

    @Test
    public void testEnterFamilyRelationship() {
        boolean worked = false;
        InterfaceImpl impl = new InterfaceImpl();

        ArrayList<FamilyRelation> family = new ArrayList<>();

        impl.enterFamilyRelationship(family);

        worked = true;

        assertTrue("testEnterFamilyRelationship should add a family relationship", worked);
    }
}

