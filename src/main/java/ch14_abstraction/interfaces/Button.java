package ch14_abstraction.interfaces;

/*
    인터페이스는 다중 상속이 가능하다는 점을 볼수있는 클래스
    단일 상속을 위한 명령어 -> extends
    다중 상속을 위한 명령어 -> implenents
 */
public abstract class Button implements Up, Down, Press {
    @Override
    public void onDown(){};
    @Override
    public abstract void onPressed();

    @Override
    public String onUp(){
        return "올립니다.";
    };
}
