package com.day5.regex.basicregexproblems.extractionproblems.extractemailaddress;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    public static void main(String[] args) {

        //Input String
        String text = "For any inquiries regarding our services, feel free to reach out to our support team at support@example.com"
                + " or our sales department at sales@company.org. If you're an existing customer, you can contact our account managers at john.doe@business.net or jane_smith@corporate.io. For media-related queries, email our PR team at press@newsmedia.com. Job applicants can submit their resumes at careers@hiringnow.com. If you need urgent assistance, our emergency response team is available 24/7 at help@emergency.co. Additionally, for partnership opportunities, write to partners@globalpartners.org. You can also reach out to individual departments: HR (hr@company.com), IT Support (tech.support@itservices.net), or Finance (billing@financesystem.io)." +
                "Stay updated by subscribing to our newsletter at subscribe@newsletter.biz.";

        //list to call function
        List<String> email = extractedEmail(text);

        for (String emails : email){
            System.out.println(emails);
        }
    }

    //Method to store list of extracted emails
    public static List<String> extractedEmail(String text){
        String regex ="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        //text.matches(regex);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //creating an arraylist for storing emails
        List<String > emails = new ArrayList<>();

        while (matcher.find()){
            emails.add(matcher.group());
        }
        return emails;
    }
}
