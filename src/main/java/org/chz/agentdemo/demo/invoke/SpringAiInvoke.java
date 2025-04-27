package org.chz.agentdemo.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component  //  启动时执行
public class SpringAiInvoke implements CommandLineRunner {

    @Resource
    private ChatModel chatModel;
    @Override
    public void run(String... args) throws Exception {
        AssistantMessage output = chatModel.call(new Prompt("Hello"))
                .getResult()
                .getOutput();
        System.out.println(output);
    }
}
