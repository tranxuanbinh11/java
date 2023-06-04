package tranxuanbinh.net.QLNS;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPString ="binh";
        String encodedPassword = encoder.encode(rawPString);

        System.out.println(encodedPassword);
    }
}
