package test;

import main.Luhn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLuhnParamaterizedAgainstTwelveCardTypes {
    private Boolean expectedResult;
    private Boolean actualResult;
    private Luhn luhn;

    public TestLuhnParamaterizedAgainstTwelveCardTypes(String cardNumber, Boolean expectedResult) {
        luhn = new Luhn(cardNumber);
        this.expectedResult = expectedResult;
        this.actualResult = luhn.isValid();
    }

    @Parameters(name = "{index}: luhn.isValid()({0} {1}")
    public static Iterable<Object[]> cardsToTest() {
        return Arrays.asList(new Object[][] {
                { "4556737586899855", true  },
                { "1556737586899855", false },
                { "5466576003262578", true  },
                { "4024007194988563", true  },
                { "5194781069295814", true  },
                { "373367593257274",  true  },
                { "6011469410813225", true  },
                { "3528867685167602", true  },
                { "5489473291516225", true  },
                { "30037027840988",   true  },
                { "36992186931263",   true  },
                { "5020436825293112", true  },
                { "6709180359676047", true  },
                { "4026530709288177", true  },
                { "6395535700384360", true  }
        });
    }

    @Test
    public void luhnChecker() {
        assertEquals(expectedResult, actualResult);
    }

}