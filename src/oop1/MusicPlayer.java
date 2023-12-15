package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악플레이어 실행");
    }

    void off() {
        isOn = false;
        System.out.println("음악플레이어 종료");
    }

    void up() {
        volume++;
        System.out.println("볼륨:"+volume);
    }

    void down() {
        volume--;
        System.out.println("볼륨:"+volume);
    }

    void status() {
        if(isOn){
            System.out.println("음악플레이어 on , 볼륨:"+volume);
        }
        else{
            System.out.println("음악플레이어 off");
        }
    }
}
