package com.example.Java6thTopic;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Java6thTopicController {
    @GetMapping("/average-age")
    public Average averageAge() {
        int manAge1 = 28;
        int manAge2 = 32;
        int womanAge1 = 21;
        return new Average(List.of(
                new Parson("Bob", manAge1),
                new Parson("Jon", manAge2),
                new Parson("KAte", womanAge1)
        ),
                new AverageText("平均年齢は" + (manAge1 + manAge2 + womanAge1) / 3 + "歳です"));
    }
}
