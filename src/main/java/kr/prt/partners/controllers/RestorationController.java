package kr.prt.partners.controllers;

import kr.prt.partners.models.Restoration;
import kr.prt.partners.models.RestorationResponse;
import kr.prt.partners.services.RestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v2")
public class RestorationController {

    @Autowired
    private RestorationService restorationService;

    public RestorationController(RestorationService restorationService) {
        this.restorationService = restorationService;
    }

//    @RequestMapping(value = "/restoration", method = RequestMethod.GET)
//    public ListRestorationRepository lists() {
//        List<Restoration> lists = restorationService.listResRead();
//        System.out.println(lists);
//        return new ListRestorationRepository();
//    }

    @RequestMapping(value = "/restoration", method = RequestMethod.GET)
    public RestorationResponse lists() {
        List<Restoration> lists = restorationService.listResRead();
        System.out.println(lists);
        return new RestorationResponse("read", lists);
    }

    @RequestMapping(path = "/restoration", method = RequestMethod.POST)
    public RestorationResponse create(Integer category_top, Integer category_base, Integer brand_no, String brand_name, String note, Integer id) {
        restorationService.create(category_top, category_base, brand_no, brand_name, note, id);
        return new RestorationResponse("create");
    }

}
