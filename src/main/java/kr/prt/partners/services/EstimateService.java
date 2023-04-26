package kr.prt.partners.services;

import kr.prt.partners.models.Estimate;
import kr.prt.partners.models.Suggest;
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

    public Integer create(Integer rstr_no, String state, Integer user_no, String note, Integer input_day, Integer price, Integer work_day) {
        return estimateRepository.create(rstr_no, state, user_no, note, input_day, price, work_day);
    }

    public List<Suggest> readEstimateList() {
        return estimateRepository.readEstimateList();
    }

    public List<Suggest> readEstimate(Integer estimate_no) {
//        System.out.println(estimate_no);
        return estimateRepository.readEstimate(estimate_no);
    }

}
