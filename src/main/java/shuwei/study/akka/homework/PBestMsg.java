package shuwei.study.akka.homework;

public final class PBestMsg {

    final PsoValue value;

    public PBestMsg(PsoValue v) {
        value = v;
    }

    public PsoValue getValue() {
        return value;
    }
}
