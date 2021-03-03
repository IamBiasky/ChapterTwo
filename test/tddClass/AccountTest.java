package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void accountCanBeDepositedIntoTest(){

        //given
        Account myAccount = new Account();

        //When
        myAccount.depositMoney(2500.00);

        //assert
        double balance = myAccount.getAccountBalance();
        assertEquals(2500.00, balance);

    }

    @Test
    @DisplayName("Money can be deposited twice Test")
    public void accountCanReceivedDoubleDepositTest(){

        //given
        Account sarahAccount = new Account();
        sarahAccount.depositMoney(500.00);

        //when
        sarahAccount.depositMoney(3500);

        //assert
        assertEquals(4000, sarahAccount.getAccountBalance());

        }

    @Test
    public void accountCannotReceiveNegativeDepositTest(){

        //given
        Account humbleAccount = new Account();

        //when
        humbleAccount.depositMoney(-970297372);

        //assert
        assertEquals(0, humbleAccount.getAccountBalance());
    }

    @Test
    public void moneyCanBeWithdrawnFromAccountWithValidPinTest(){

        //given
        Account babasolaAccount = new Account();
        babasolaAccount.depositMoney(7000);
        babasolaAccount.setPin(1234);

        //when
        babasolaAccount.withdrawMoney(2000, 1234);

        //assert
        assertTrue(babasolaAccount.getAccountBalance()==5000);
    }



    }
