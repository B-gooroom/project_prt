package kr.prt.partners.controllers;

import kr.prt.partners.models.Restoration;
import kr.prt.partners.services.RestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.List;

import static java.awt.SystemColor.window;

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
        return "restoration/view";
    }

    @GetMapping("/restoration/form")
    public String createForm() {
        return "restoration/form";
    }

    @RequestMapping(path = "/restoration/new/{index}")
    public String create(@RequestParam("category_top") Integer category_top, @RequestParam("category_base") Integer category_base,
                         @RequestParam("brand_no") Integer brand_no, @RequestParam("brand_name") String brand_name, @RequestParam("note") String note,
                         @RequestParam("id") Integer id, Model model) {
        System.out.println(id);
        restorationService.create(category_top, category_base, brand_no, brand_name, note, id);
//        return new RestorationResponse("create");

        String notted = note;
        model.addAttribute("restorationCreate", notted);
        return "restoration/new";
    }
}
