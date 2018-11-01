package queue.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import queue.main.db.dao.TestDao;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private TestDao testDao;

    @Autowired
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public List<Integer> getTestData() {
        return testDao.getTestData();
    }
}
