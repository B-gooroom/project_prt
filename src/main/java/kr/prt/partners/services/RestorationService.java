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
}

