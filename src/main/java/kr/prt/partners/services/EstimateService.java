package kr.prt.partners.services;

import kr.prt.partners.models.Estimate;
import kr.prt.partners.repositories.EstimateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstimateService {
    private final EstimateRepository estimateRepository;

    @Autowired
    public EstimateService(EstimateRepository estimateRepository) {
        this.estimateRepository = estimateRepository;
    }

    public List<Estimate> readList() {
        return estimateRepository.readList();
    }

    public List<Estimate> readId(Integer rstrNo) {
        return estimateRepository.readId(rstrNo);
    }

    public Integer create(Integer rstr_no, String state, String note, String contract_yn) {
//        return estimateRepository.insert(rstr_no, state, note);
//        System.out.println(rstr_no);
//        System.out.println(state);
//        System.out.println(note);
//        System.out.println(contract_yn);
        return estimateRepository.create(rstr_no, state, note, contract_yn);
    }
//    public Integer create(Estimate estimate) {
//        System.out.println(estimate);
//        return estimateRepository.create(estimate);
//    }

}
