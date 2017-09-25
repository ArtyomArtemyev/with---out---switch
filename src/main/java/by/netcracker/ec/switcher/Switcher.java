package by.netcracker.ec.switcher;

import by.netcracker.ec.annotation.Command;
import by.netcracker.ec.annotation.FirstCommandImpl;
import by.netcracker.ec.annotation.SecondCommandImpl;
import by.netcracker.ec.constant.Constant;

public class Switcher {
    public static Command getCommand(String nameCommand) {
        Command command = null;
        switch (nameCommand) {
            case Constant.FIRST_COMMAND: {
                command = new FirstCommandImpl();
                break;
            }
            case Constant.SECOND_COMMAND: {
                command = new SecondCommandImpl();
                break;
            }
        }
        return command;
    }
}
