package main_study.the_08_08;

public interface RemoteControl {
    //최대 볼륨은 30
    //최소 볼륨은 0이다.

    public static final int MAX_VALUME =30;
    public static final int Min_VALUME =30;

    public void trunOn();//전원켜기
    public void trunOff();//전원끄기

    public void setValume(int volume);
    public void setValume(boolean volume);



    //디폴트 인스턴스 메소드
        default void setMute(boolean mute){
            if (mute){
                System.out.println("무음 처리 작동시작");
                setValume(Min_VALUME);
            }else {
                System.out.println("무음해제");
            }
        }
}
