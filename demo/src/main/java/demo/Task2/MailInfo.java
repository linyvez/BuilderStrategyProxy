package demo.Task2;

import demo.Task2.mailcode.MailCode;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }

    public String getEmail() {
        return client.getEmail();
    }
}