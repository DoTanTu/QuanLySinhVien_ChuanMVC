
package contrller;

import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.KhoaHoc;
import view.LopHoc;
import view.SinhVien_Panel;
import view.ThongKe;
import view.TrangChu_Panel;

public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem;
    public ChuyenManHinhController(JPanel jpnRoot){
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu_Panel());
        root.validate();
        root.repaint();
        
    }  
    public void setEven(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEven(item.getKind(),item.getJpn(),item.getJlb()));
        }
    }
    class LabelEven implements MouseListener{
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEven(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
        @Override
        public void mouseClicked(MouseEvent e) {
           switch(kind){
               case "TrangChu":
                   node = new TrangChu_Panel();
                   break;
               case "HocVien":
                   node = new SinhVien_Panel();
                   break;
               case "KhoaHoc":
                   node = new KhoaHoc();
                   break;
               case "LopHoc":
                   node = new LopHoc();
                   break;
               case "ThongKe":
                   node = new ThongKe();
                   break;
               default:
                   node = new TrangChu_Panel();
                   break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
            setChageBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(96,100,191));
           jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           jpnItem.setBackground(new Color(96,100,191));
           jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(0,204,51));
                jlbItem.setBackground(new Color(0,204,51));
            }
        }
    
    }
    private void setChageBackground(String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(96,100,191));
                item.getJlb().setBackground(new Color(96,100,191));
            }else{
                item.getJpn().setBackground(new Color(0,204,51));
                item.getJlb().setBackground(new Color(0,204,51));
            }
        }
    }
}
