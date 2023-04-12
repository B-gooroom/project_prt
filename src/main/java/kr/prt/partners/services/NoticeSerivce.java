package kr.prt.partners.services;

import kr.prt.partners.models.Notice;
import kr.prt.partners.repositories.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeSerivce {


    private final NoticeRepository dashboardRepository;
    @Autowired
    public NoticeSerivce(NoticeRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    public List<Notice> read() {
        return dashboardRepository.read();
    }

}
