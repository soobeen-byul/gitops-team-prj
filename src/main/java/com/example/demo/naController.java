package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class naController {
    private final ResumeService resumeService;

    @GetMapping("/resume/na")
    public ResponseEntity<Resume> createSub() {
        String name="김나연";
        String github="github.com/nayeon1107";
        String aboutme="안녕하세요. 김나연입니다.";

        Resume naResume = new Resume(name,github,aboutme);

        resumeService.create(name,github,aboutme);

        return ResponseEntity.ok()
                .body(naResume);
    }
}