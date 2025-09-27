package Tests;

import org.testng.annotations.*;

public class C01_Annotations {


    /*
@BeforeSuite-@AfterSuite : Runs before/after all tests in this package. Executes only once.
@BeforeTest-@AfterTest : Runs before/after all test methods. Executes only once.
@BeforeClass-@AfterClass : Runs before/after all test methods in a test class. Executes only once.
@BeforeGroups-@AfterGroups : Runs before/after any specific test group. Executes only once.
@BeforeMethod-@AfterMethod : Runs before/after each test method.
 */

    @BeforeSuite
    void beforeSuite(){
        System.out.println("@BeforeSuite"); //Must run with test .
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("@AfterSuite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("@BeforeTest");
    }
    @AfterTest
    void afterTest(){
        System.out.println("@AfterTest");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("@BeforeClass");
    }@AfterClass
    void afterClass(){
        System.out.println("@AfterClass");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("@BeforeMethod");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("@AfterMethod");
    }
    @Test
    void test01(){
        System.out.println("Test 01");
    }
    @Test
    void test04(){
        System.out.println("Test 04"); // The test will be performed in numerical sequence .
    }
    @Test
    void test02(){
        System.out.println("Test 02");
    }
    @Test
    void test03(){
        System.out.println("Test 03");
    }

    @Test
    void test05(){
        System.out.println("Test 05");
    }

    /*

    The order of TestNG annotations

        @BeforeSuite
        @BeforeTest
        @BeforeClass
        @BeforeGroup
        @BeforeMethod
        @Test#
        @AfterMethod
        @AfterGroup
        @AfterClass
        @AfterTest
        @AfterSuite
     */

}
