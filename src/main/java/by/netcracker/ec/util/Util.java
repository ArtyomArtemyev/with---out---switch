package by.netcracker.ec.util;

import by.netcracker.ec.annotation.Command;

import java.util.List;

public class Util {
    public static Command getCommand(List<Command> listCommand, String commandClassName) {
        Command command = null;
        for (int i = 0; i < listCommand.size(); i++) {
            System.out.println(listCommand.get(i).getClass().getName());
            if (listCommand.get(i).getClass().getName().equals(commandClassName)) {
                return listCommand.get(i);
            }
        }
        return command;
    }
}
