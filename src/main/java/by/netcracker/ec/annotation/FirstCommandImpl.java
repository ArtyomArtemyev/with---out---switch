package by.netcracker.ec.annotation;

import org.springframework.stereotype.Component;

@Component
public class FirstCommandImpl implements Command {
    @Override
    public String execute() {
        return "FirstCommand";
    }
}
