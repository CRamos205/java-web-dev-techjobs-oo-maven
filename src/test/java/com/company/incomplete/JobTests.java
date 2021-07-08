package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JobTests {
    static Job jobTests1, jobTests2, jobTests3, jobTests4;

@BeforeAll
    static void createJob() {
        jobTests1 = new Job();
        jobTests2 = new Job();
        jobTests3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTests4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    @Test
    public void testSettingJobId() {
        assertEquals(1, (jobTests2.getId()) - (jobTests1.getId()) );

    }


    @Test
    public void testJobConstructorSetsAllFields() {
    assertEquals(true, jobTests3.getEmployer() instanceof Employer);
    assertEquals(true, jobTests3.getLocation() instanceof Location);
    assertEquals(true, jobTests3.getPositionType() instanceof PositionType);
    assertEquals(true, jobTests3.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(true, jobTests3.getName() == "Product tester");
    assertEquals(true, jobTests3.getEmployer().getValue() == "ACME");
    assertEquals(true, jobTests3.getPositionType().getValue() == "Quality control");
    assertEquals(true, jobTests3.getLocation().getValue() == "Desert");
    assertEquals(true, jobTests3.getCoreCompetency().getValue() == "Persistence");




    }

    @Test
    public void testJobsForEquality() {
    assertFalse(jobTests3.equals(jobTests4));

    }



    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {

    }

    @Test
    public void testToStringHasLabelsForEachField() {

    }

    @Test
    public void testToStringDataNotAvailable() {

    }
}
