package kr.prt.partners.services;

import kr.prt.partners.models.Restoration;
import kr.prt.partners.repositories.RestorationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestorationService {

    private final RestorationRepository restorationRepository;

    @Autowired
    public RestorationService(RestorationRepository restorationRepository) {
        this.restorationRepository = restorationRepository;
    }

    public List<Restoration> listResRead() {
        return restorationRepository.read();
    }

    public Integer create(Integer category_top, Integer category_base, Integer brand_no, String brand_name, String note, Integer id) {
        return restorationRepository.create(category_top, category_base, brand_no, brand_name, note, id);
    }
}

