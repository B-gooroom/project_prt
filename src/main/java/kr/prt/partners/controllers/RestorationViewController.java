package kr.prt.partners.controllers;

import kr.prt.partners.models.Restoration;
import kr.prt.partners.services.RestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RestorationViewController {

    @Autowired
    private RestorationService restorationService;

    public RestorationViewController(RestorationService restorationService) {
        this.restorationService = restorationService;
    }

    @GetMapping("/restoration/view")
    public String restoration(Model model) {
        List<Restoration> restorations = restorationService.listResRead();
        System.out.println(restorations);
        model.addAttribute("reses", restorations);
        return "/restoration/view";
    }
}
