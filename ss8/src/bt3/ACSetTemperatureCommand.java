package bt3;

public class ACSetTemperatureCommand implements Command {
    private AC ac;
    private int newTemp;
    private int oldTemp;

    public ACSetTemperatureCommand(AC ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    public void execute() {
        oldTemp = ac.getTemperature(); // lưu trạng thái cũ
        ac.setTemperature(newTemp);
    }

    public void undo() {
        ac.setTemperature(oldTemp);
        System.out.println("Undo: Dieu hoa quay lai " + oldTemp);
    }
}