package bt3;

import java.util.*;

public class RemoteControl {
    private Map<Integer, Command> buttons = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(int slot, Command command) {
        buttons.put(slot, command);
        System.out.println("Da gan command cho nut " + slot);
    }

    public void pressButton(int slot) {
        Command command = buttons.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("Nut chua duoc gan!");
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        } else {
            System.out.println("Khong co gi de undo!");
        }
    }
}