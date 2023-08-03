package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ResumeController {

    private final ResumeService resumeService;

    @GetMapping("/resume/list")
    public String resumeList(Model model) {
        List<Resume> rList = resumeService.getList();
        model.addAttribute("rList",rList);
        return "resume_list";
    }

    @GetMapping(value="resume/detail/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        Resume resume = resumeService.getResume(id);
        model.addAttribute("resume", resume);
        return "resume_detail";
    }

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
