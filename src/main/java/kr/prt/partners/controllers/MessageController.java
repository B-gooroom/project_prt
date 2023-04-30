package kr.prt.partners.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import kr.prt.partners.models.Message;
import kr.prt.partners.models.MessageRequest;
import kr.prt.partners.models.MessageResponse;
import kr.prt.partners.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class MessageController {

    private MessageService messageService;
    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(path = "/message", method = RequestMethod.POST)
    public MessageResponse send(Message message) throws JsonProcessingException, RestClientException, URISyntaxException, InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
//        System.out.println(message.getTo());
//        System.out.println(message.getContent());
        MessageResponse response = messageService.sendMessage(message);
        return new MessageResponse();
//        return new MessageResponse(response.getRequestId(), response.getRequestTime(), response.getStatusCode(), response.getStatusName());
    }
}
