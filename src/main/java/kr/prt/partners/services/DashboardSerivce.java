package kr.prt.partners.services;

import kr.prt.partners.models.Dashboard;
import kr.prt.partners.repositories.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardSerivce {


    private final DashboardRepository dashboardRepository;
    @Autowired
    public DashboardSerivce(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    public List<Dashboard> read() {
        return dashboardRepository.read();
    }

}
