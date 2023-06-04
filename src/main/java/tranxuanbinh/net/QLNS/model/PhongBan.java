package tranxuanbinh.net.QLNS.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "phongban")
public class PhongBan {
    @Id
    @Column(name = "ma_phong")
    private String ma_phong;
    @Column(name = "ten_phong")
    private String ten_phong;
    public PhongBan() {
    }
    public String getMa_phong() {
        return ma_phong;
    }
    public void setMa_phong(String ma_phong) {
        this.ma_phong = ma_phong;
    }
    public String getTen_phong() {
        return ten_phong;
    }
    public void setTen_phong(String ten_phong) {
        this.ten_phong = ten_phong;
    }
}
