package Lab;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface QuanLyCanBo {
	public List<NhanVien> khoiTaoNhanVien();
	public Set<KySu> khoiTaoKySu();
	public HashMap<String, CongNhan> khoiTaoCongNhan();
	public void hienThiDanhSachCanBo(LoaiCanBo loaiCB);
	public void timKiemCanBo(String name, LoaiCanBo loaiCB);
	
	// tạo class interface QuanLyCanBo 
	//enum LoaiCanBo
}
