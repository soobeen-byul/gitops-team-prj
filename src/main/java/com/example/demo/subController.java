package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class subController {
    private final ResumeService resumeService;

    @GetMapping("/resume/sub")
    public ResponseEntity<Resume> createSub() {
        String name="황수빈";
        String github="github.com/soobeen-byul";
        String aboutme="안녕하세요. 황수빈입니다.";

        Resume subResume = new Resume(name,github,aboutme);

        resumeService.create(name,github,aboutme);
        
        return ResponseEntity.ok()
                .body(subResume);
    }
}
