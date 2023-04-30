package kr.prt.partners.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import kr.prt.partners.models.Message;
import kr.prt.partners.models.MessageResponse;
import kr.prt.partners.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Controller
public class MessageViewController {

    private MessageService messageService;
    @Autowired
    public MessageViewController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/user/certify/send")
    public String send() {
        return "user/certify/send";
    }

    @PostMapping("/user/certify/new")
    public String sendMessage(Message message, Model model) throws JsonProcessingException, RestClientException, URISyntaxException, InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
//        System.out.println(message.getTo());
//        System.out.println(message.getContent());
        MessageResponse response = messageService.sendMessage(message);
        System.out.println(response.getRequestId());
        model.addAttribute("response", response);
        return "user/certify/new";
    }
}
