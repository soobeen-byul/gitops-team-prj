package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class lmsController {
    private final ResumeService resumeService;

    @GetMapping("/resume/lms")
    public ResponseEntity<Resume> createLms() {
        String name="이미선";
        String github="github.com/Lee-Miseon";
        String aboutme="안녕하세요. 이미선입니다.";

        Resume lmsResume = new Resume(name,github,aboutme);

        resumeService.create(name,github,aboutme);
        
        return ResponseEntity.ok()
                .body(lmsResume);
    }
}
