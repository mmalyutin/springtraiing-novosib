package myspring;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        /*IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();*/
        BankService bankService = ObjectFactory.getInstance().createObject(BankService.class);
        bankService.work();
        bankService.drinkBeer();
    }
}
