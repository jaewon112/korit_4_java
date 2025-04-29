package ch14_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
// 접근지정자    자료형       변수명
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    //객체생성방법
    // 클래스명 객체명 = new 클래스명();
    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton ,
                              VolumeUpButton volumeUpButton,
                              VolumeDownButton volumeDownButton){

        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;


    }
    // 이상의 field들을 이용한 메서드들을 정의
    public void onPressedPowerButton() {
        System.out.print("TV의");
        powerButton.onPressed();
    }
    public  void onPressedChannelDownButton() {
        System.out.print("TV의");
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        System.out.print("TV의");
        channelDownButton.onDown();
    }
    public void onPressedChannelUpButton() {
        System.out.print("TV의");
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.print("TV의");
        System.out.println(channelUpButton.onUp());
    }
    public void onUpVolumeUpButton(){
        System.out.print("TV의");
        System.out.println(volumeUpButton.onUp());
    }
    public void onPressedvolumeUpButton() {
        System.out.print("TV의");
        volumeUpButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        System.out.print("TV의");
       volumeDownButton.onDown();
    }
    public void onPressedvolumeDownButton() {
        System.out.print("TV의");
        volumeDownButton.onPressed();
    }
}
