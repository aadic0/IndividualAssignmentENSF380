package edu.ucalgary.oop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogInquiryTest {
    @Test
    public void testAddAndSearchInquiryLog() {
        LogInquiry logInquiry = new LogInquiryImpl();

        logInquiry.addInquiryLog("Test log");
        assertEquals("Test log", logInquiry.searchInquiryLog("Test log"));

        assertThrows(NoInformationAvailableException.class, () -> {
            logInquiry.searchInquiryLog("Non-existent log");
        });
    }
}
