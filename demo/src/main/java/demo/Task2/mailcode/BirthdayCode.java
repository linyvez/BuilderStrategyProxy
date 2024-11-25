package demo.Task2.mailcode;

import demo.Task2.Client;

public class BirthdayCode implements MailCode{
    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy Birthday!", client);
    }
}
