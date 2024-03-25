package org.example.javaAdvancedCoding.lambdas;

public class SomeGreatApplication {

    Logger logger;

    public SomeGreatApplication(Logger logger) {
        this.logger = logger;
    }

    public void doSomethig() {
        logger.log("doSomethig...");
    }


    public static void main(String[] args) {
        SomeGreatApplication someGreatApplication = new SomeGreatApplication(new DBLogger());
        someGreatApplication.doSomethig();

        //inner annonymous class implementing Logger interface
        SomeGreatApplication app2 = new SomeGreatApplication(new Logger() {
            @Override
            public void log(String msg) {
                System.out.println("Sending to web :" + msg);
            }
        });
        app2.doSomethig();

        Logger log1 = m -> System.out.println("lamda logger:" + m);
        SomeGreatApplication app3_prew = new SomeGreatApplication(log1);

        SomeGreatApplication app3 = new SomeGreatApplication(msg -> System.out.println("My lamda logger " + msg));
        app3.doSomethig();


        Logger log3 = app3::vypisNaSout;
        SomeGreatApplication application = new SomeGreatApplication(log3);
        application.doSomethig();

        SomeGreatApplication application2 = new SomeGreatApplication(app3::vypisNaSout);
        application2.doSomethig();

        SomeGreatApplication application3 = new SomeGreatApplication(SomeGreatApplication::vypis2);
        application3.doSomethig();

        SomeGreatApplication application4 = new SomeGreatApplication(System.out::println);
        application4.doSomethig();

//        Consumer<String> c = (Logger & Consumer<String>) s-> System.out.println(s);
//
//        SomeGreatApplication application5 = new SomeGreatApplication((Logger) c);
//        application5.doSomethig();

    }

    void vypisNaSout(String zprava) {
        System.out.println("Method reference " + zprava);
    }

    static void vypis2(String msg) {
        System.out.println("Static method reference " + msg);
    }


}
