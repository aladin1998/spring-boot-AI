package com.deepseek.deepseek.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api")
public class ChatRestController {

    private final ChatClient chatClient;

    public ChatRestController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }

    @GetMapping("/chat/{tokens}")
    public ResponseEntity<String> chat(@PathVariable String tokens) {
        String response = this.chatClient.prompt(tokens).call().content();

        return ResponseEntity.ok(response);
    }
}
