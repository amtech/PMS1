package cn.james.pms_1;

import cn.james.pms_1.dao.ProDemandDAO;
import cn.james.pms_1.server.ProDemandServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class Pms1ApplicationTests {
    @Autowired
    private ProDemandServer proDemandServer;
    @Autowired
    private ProDemandDAO proDemandDAO;

    @Test
    void contextLoads() {
//        System.out.println(proDemandDAO.selectAll(new ProDemand()));
    }

}
