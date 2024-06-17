package shop.mtcoding.chatgptapitest.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import shop.mtcoding.chatgptapitest.dto.ChatCompletionDto;
import shop.mtcoding.chatgptapitest.dto.CompletionDto;

@Service
public interface ChatGptService {
    List<Map<String, Object>> modelList();
    Map<String, Object> isValidModel(String modelName);
    Map<String, Object> legacyPrompt(CompletionDto completionDto);
    Map<String, Object> prompt(ChatCompletionDto chatCompletionDto);
}
