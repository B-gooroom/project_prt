package kr.prt.partners.controllers;

import kr.prt.partners.models.Restoration;
import kr.prt.partners.services.RestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListRestorationController {

    @Autowired
    private RestorationService restorationService;

    public ListRestorationController(RestorationService restorationService) {
        this.restorationService = restorationService;
    }

    @GetMapping("/restoration")
    public String restoration(Model model) {
        List<Restoration> restorations = restorationService.listResRead();
        System.out.println(restorations);
        model.addAttribute("reses", restorations);
        return "/restoration";
    }
}
