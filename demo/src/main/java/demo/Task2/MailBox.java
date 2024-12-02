package demo.Task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender mailSender;

    public MailBox(MailSender mailSender) {
        this.mailSender = mailSender;
        this.infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        if (mailInfo != null) {
            infos.add(mailInfo);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void sendAll() {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
        clearMailInfo();
    }

    public void clearMailInfo() {
        infos.clear();
    }
}
