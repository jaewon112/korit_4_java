package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(new PowerButton() , new ChannelDownButton() , new ChannelUpButton() , new VolumeUpButton() , new VolumeDownButton());
        PowerButton powerButton = new PowerButton();
        tvRemoteController.onPressedPowerButton();          //결과값 : 전원을 켭니다.
        tvRemoteController.onPressedPowerButton();          //결과값 : 전원을 끕니다.
        powerButton.onPressed();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        tvRemoteController.onPressedvolumeUpButton();
        tvRemoteController.onDownVolumeDownButton();




        // 별개의 PowerButton 객체를 생성해서 메서드 호출이 가능하다.
//        PowerButton powerButton = new PowerButton();
//        powerButton.onPressed();                      // 결과값 전원을켭니다 -> 별개로 굴러간다 (리모컨에 전원버튼만 있는것)
    }
}
