package by.netcracker.ec.map;

import by.netcracker.ec.annotation.Command;
import by.netcracker.ec.annotation.FirstCommandImpl;
import by.netcracker.ec.annotation.SecondCommandImpl;
import by.netcracker.ec.constant.Constant;

import java.util.HashMap;
import java.util.Map;

public class CommandMap {
    private Map<String, Command> commandMap;

    public CommandMap() {
       commandMap = new HashMap<>();
       commandMap.put(Constant.FIRST_COMMAND,new FirstCommandImpl());
       commandMap.put(Constant.SECOND_COMMAND, new SecondCommandImpl());
    }

    public Command getCommand(String nameCommand) {
        return commandMap.get(nameCommand);
    }
}
