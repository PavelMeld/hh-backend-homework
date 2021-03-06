package service;

import dao.CompanyDao;
import entity.CompanyEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CompanyService {
    CompanyDao companyDao;

    public CompanyService(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Transactional
    public void addCompany(String companyName, Integer userId) {
        CompanyEntity newCompany = new CompanyEntity(companyName, userId);
        companyDao.createCompany(newCompany);
    }

    @Transactional
    public List<CompanyEntity> getCompanies() {
        return companyDao.getCompanies();
    }
}
