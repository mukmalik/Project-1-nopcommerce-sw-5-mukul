package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="inValidCredentials")
    public Object[][] getInValidCredentials()
    {
        Object[][] data = new Object[][]
                {
                        {"test1@gmail.com", "test123"},
                };
        return data;
    }

    @DataProvider(name="ValidCredentials")
    public Object[][] getValidCredentials()
    {
        Object[][] data = new Object[][]
                {
                        {"test1@gmail.com", "test123"},
                };
        return data;
    }

    @DataProvider(name = "registerPageInput")
    public Object[][] registerPageInput()
    {
        Object[][] data = new Object[][]
                {
                        {"Female", "Admin", "AdminLast", "1", "1", "1987", "admin@admin.com", "1234567", "1234567"},
                 };
        return data;
    }

    @DataProvider(name = "buildYourOwnComputer")
    public Object[][] buildYourOwnComputer()
    {
        Object[][] data = new Object[][]
                {{"2.2 GHz Intel Pentium Dual-Core E2200", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00]", "400 GB [+$100.00]", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00]"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "8GB [+$60.00]", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00]"},};
        return data;
    }

}
