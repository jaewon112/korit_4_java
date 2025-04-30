package ch15_casting.control;

public class Tv implements  Power{
    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void channelUp() {
        System.out.println("채널을 한 칸 올립니다.");
    }
}
