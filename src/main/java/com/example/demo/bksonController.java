package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class bksonController {
    private final ResumeService resumeService;

    @GetMapping("/resume/bkson")
    public ResponseEntity<Resume> createSub() {
        String name="손병규";
        String github="github.com/bksooon";
        String aboutme="안녕하세요. 손병규입니다.";

        Resume bksonResume = new Resume(name,github,aboutme);

        resumeService.create(name,github,aboutme);
        
        return ResponseEntity.ok()
                .body(bksonResume);
    }
}
