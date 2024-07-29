import io.qameta.allure.Description;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountParameterizedTest {

    String name;
    boolean expected;

    public AccountParameterizedTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "For name \"{0}\" embossing possibility must be {1}")
    public static Object[][] data() {
        return new Object[][]{
                {"Имя Фамилия", true},
                {" ИмяФамилия", false},
                {"ИмяФамилия ", false},
                {"ИмяФамилия", false},
                {"", false},
                {"   ", false},
                {"Имя Фа милия", false},
                {"ИФ", false},
                {"И", false},
                {"И Ф", true},
                {RandomStringUtils.random(4, true, false) + " " + RandomStringUtils
                        .random(13, true, false), true},
                {RandomStringUtils.random(4, true, false) + " " + RandomStringUtils
                        .random(14, true, false), true},
                {RandomStringUtils.random(4, true, false) + " " + RandomStringUtils
                        .random(15, true, false), false}

        };

    }



    @Test
    @Description("Name for card must contains 1 Whitespace, do not have Whitespace as first or last character and " +
            "it size must be between 3-19 characters inclusive")
    public void blankValueReturnsFalse() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(expected, actual);
    }

}
