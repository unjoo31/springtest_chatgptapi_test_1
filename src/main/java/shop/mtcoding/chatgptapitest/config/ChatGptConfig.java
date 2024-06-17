package shop.mtcoding.chatgptapitest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.MediaType;

/**
 * ChatGPT에서 사용하는 환경 구성
 *
 * @author : park
 * @fileName : RestTemplate
 * @since : 2024
 */

@Configuration
public class ChatGptConfig {
    
    @Value("${openai.secret-key}")
    private String secretKey;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders httpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(secretKey);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
