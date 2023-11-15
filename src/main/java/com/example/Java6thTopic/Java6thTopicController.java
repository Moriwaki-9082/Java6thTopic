package com.example.Java6thTopic;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Java6thTopicController {
    @GetMapping("/averageAge")
    public Average AverageAge() {
        int ManAge1 = 28;
        int ManAge2 = 32;
        int WomanAge1 = 21;
        return new Average(List.of(
                new Parson("Bob", ManAge1),
                new Parson("Jon", ManAge2),
                new Parson("KAte", WomanAge1)
        ),
                new AverageText("平均年齢は" + (ManAge1 + ManAge2 + WomanAge1) / 3 + "歳です"));
    }
}