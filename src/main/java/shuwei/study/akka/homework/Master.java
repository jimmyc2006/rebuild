package shuwei.study.akka.homework;

import akka.actor.ActorSelection;
import akka.actor.UntypedAbstractActor;

public class Master extends UntypedAbstractActor {
    private PsoValue gBest = null;

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof PBestMsg) {
            PsoValue pBest = ((PBestMsg) msg).getValue();
            if ((gBest == null) || (gBest.getValue() < pBest.getValue())) {
                gBest = pBest;
                ActorSelection selection = getContext().actorSelection("/user/bird_*");
                selection.tell(new GBestMsg(gBest), getSelf());
                System.out.println(gBest.getValue());
            }
        }
    }
}
