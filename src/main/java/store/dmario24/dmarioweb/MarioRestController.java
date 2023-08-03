package store.dmario24.dmarioweb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import store.dmario24.dmarioweb.question.Question;
import store.dmario24.dmarioweb.question.QuestionService;

@RestController
@RequestMapping("/mario")
@RequiredArgsConstructor
public class MarioRestController {
    private final QuestionService questionService;

    @GetMapping("/question/{id}")
    public Object createAnswer(@PathVariable("id") Integer id){
        Question question = this.questionService.getQuestion(id);
        return question;
    }

}
