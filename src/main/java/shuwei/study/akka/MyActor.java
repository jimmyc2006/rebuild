package shuwei.study.akka;

import akka.actor.UntypedAbstractActor;

public class MyActor extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("::" + message);
    }
}
