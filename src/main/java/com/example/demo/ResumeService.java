package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public List<Resume> getList() {
        return resumeRepository.findAll();
    }

    public Resume getResume(Long id) {
        return resumeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void create(String name, String github, String aboutme) {
        Resume r = new Resume(name,github,aboutme);
        resumeRepository.save(r);
    }


}
