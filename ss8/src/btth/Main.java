package btth;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. nhấn nút
         *  - bật đèn
         *  - tắt đèn
         *  - bật quạt
         *  - tắt quạt
         *  - điều chỉnh nhiệt độ
         */
        Light light = new Light();
        Fan fan = new Fan();
        AC ac = new AC(25);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.addCommand(1, new TurnOnLightCommand(new Light()));
        remoteControl.addCommand(2, new TurnOffLightCommand(new Light()));
        remoteControl.addCommand(3, new TurnOnFanCommand(new Fan()));
        remoteControl.addCommand(4, new TurnOffFanCommand(new Fan()));
        remoteControl.addCommand(5, new ACComand(ac, 25));

    }
}
