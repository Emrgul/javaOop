

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger(),new ConsoleLogger()};
//
//        // normalde array sadece tanımladığın tipte verileri içine kaydetmeyi kabul eder.
//        // ancak bu sefer Database File ve Email tipinte loggerları kaydetmeyi kabul etti.
//        // bunun nedeni hepsinin temelde baselogger'ı extend etmesidir.
//
//        for (BaseLogger logger:loggers){
//
//            logger.Log("log mesajı");
//
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
