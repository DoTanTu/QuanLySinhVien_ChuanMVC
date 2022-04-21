
package service;

import Dao.HocVienDao;
import Dao.HocVienDaompl;
import java.util.List;
import model.HocVien;

public class HocVienServicempl implements HocVienService{
    
    private HocVienDao hocVienDao = null;
    
    public HocVienServicempl(){
        hocVienDao = new HocVienDaompl();
    }
    @Override
    public List<HocVien> getList() {
        return hocVienDao.getList();
    }
    
}
