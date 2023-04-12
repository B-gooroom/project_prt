package kr.prt.partners.services;

import kr.prt.partners.models.Dashboard;
import kr.prt.partners.repositories.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardSerivce {

    private final DashboardRepository countRepository;
    @Autowired
    public DashboardSerivce(DashboardRepository countRepository) {
        this.countRepository = countRepository;
    }

    public List<Dashboard> cntRestoration() {
        return countRepository.restoration();
    }
    public List<Dashboard> cntNotification() { return countRepository.notification(); }
    public List<Dashboard> cntNotice() {
        return countRepository.notice();
    }

    public List<Dashboard> cntOngoing() {
        return countRepository.ongoing();
    }
}
