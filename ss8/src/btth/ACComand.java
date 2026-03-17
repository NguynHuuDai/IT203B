package btth;

public class ACComand implements Command {
    private AC ac;
    int newTemp;
    int oldTemp;

    public ACComand(AC ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
        this.oldTemp = ac.getTemp();
    }



    @Override
    public void execute() {
        oldTemp = ac.getTemp();
        ac.changeTemp(newTemp);
        System.out.println(oldTemp > newTemp ?
                "Đang giảm nhiệt độ xuống " + newTemp :
                "Đang tăng nhiệt độ lên " + newTemp);
    }

    @Override
    public void undo() {

        ac.changeTemp(oldTemp);
        System.out.println("Đã trở lại nhiệt đỗ cũ" + ac.getTemp());
    }
}
