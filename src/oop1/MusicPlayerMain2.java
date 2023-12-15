package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        up(data);
        down(data);
        status(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악플레이어 실행");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악플레이어 종료");
    }

    static void up(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨:"+data.volume);
    }

    static void down(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨:"+data.volume);
    }

    static void status(MusicPlayerData data) {
        if(data.isOn){
            System.out.println("음악플레이어 on , 볼륨:"+data.volume);
        }
        else{
            System.out.println("음악플레이어 off");
        }
    }
}
