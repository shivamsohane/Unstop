import com.unstop.base.TestBase;
import com.unstop.pages.Sign_up;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUp_unstop extends TestBase {


    Sign_up signupObject = new Sign_up();

    public SignUp_unstop()
    {
        super();
    }

    @BeforeMethod
    public void setup() {
        TestBase.initialization();
        signupObject = new Sign_up();
    }

    @Test(priority = 1)
    public void validateSignUpPage()
    {
        String title = signupObject.validateSignUpPage();
        System.out.println(title);
        Assert.assertEquals(title,"Sign up on Unstop.com");
    }

    @Test(priority = 2)
    public void validateFirstName()
    {
        String error = signupObject.validateFirstName();
        Assert.assertEquals(error,"Please enter a valid name");
    }
    @Test(priority = 3)
    public void validateMobile_number()
    {
        String error = signupObject.validateMobile_number();
        Assert.assertEquals(error,"Please enter a valid mobile number");
    }
    @Test(priority = 4)
    public void validatePassword()
    {
        String error = signupObject.validatePassword();
        Assert.assertEquals(error,"The password must have at least 8 characters with a combination of alphabets, special characters & numbers.");
    }
    @Test(priority = 5)
    public void validateConfirm_password()
    {
        String error = signupObject.validateconfirm_password();
        Assert.assertEquals(error,"Confirmation password not matching");
    }
    @Test(priority = 6)
    public void validateUsername()
    {
        String error = signupObject.validateUsername();
        Assert.assertEquals(error,"The username must have at least 8 characters with a combination of alphabets & numbers. Only '-' and '_' are allowed as special characters.");
    }
    @Test(priority = 7)
    public void validateEmail()
    {
        String error = signupObject.validateEmail();
        Assert.assertEquals(error,"Please enter a valid email id");
    }

    @Test(priority = 8)
    public void TestSign_up() throws InterruptedException {
        signupObject.Sign_up();

    }
    @AfterMethod
    public void clean()
    {
        driver.manage().deleteAllCookies();
        driver.close();

    }
}
