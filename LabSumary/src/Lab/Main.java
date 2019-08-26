package Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main implements QuanLyCanBo {
	
	
		
	public static HashMap<String, CongNhan> CN ;
	public static Set<KySu> KS;
	public static List<NhanVien> NV;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLyCanBo quanLyCB = new Main();
		NV = quanLyCB.khoiTaoNhanVien();
		KS = quanLyCB.khoiTaoKySu();
		CN = quanLyCB.khoiTaoCongNhan();
		
		// Hiển thị danh sách đã đc khởi tạo từ trc
		System.out.println("---------------- Danh sach Can Bo -------------------");
		quanLyCB.hienThiDanhSachCanBo(LoaiCanBo.NhanVien);
		quanLyCB.hienThiDanhSachCanBo(LoaiCanBo.KySu);
		quanLyCB.hienThiDanhSachCanBo(LoaiCanBo.CongNhan);
		
		// Hiển thị danh sách tìm kiếm thủ công
		System.out.println("---------------- Ket qua tim kiem -------------------");
		quanLyCB.timKiemCanBo("Nguyen Van A", LoaiCanBo.NhanVien);
	}

	@Override
	public List<NhanVien> khoiTaoNhanVien() {
		// Khởi tạo nhân viên cơ bản . Sử dụng Arraylist
		NhanVien nv1 = new NhanVien("Nguyen Van A", "adress 1 ", "man", 1994, "DEV");
		NhanVien nv2 = new NhanVien("Nguyen Van B", "adress 2", "man", 1998, "MANAGER");
		NhanVien nv3 = new NhanVien("Nguyen Van C", "adress 3", "women", 1996, "SUPPORTER");
		List<NhanVien> NV = new ArrayList<NhanVien>();
		NV.add(nv1);
		NV.add(nv2);
		NV.add(nv3);
		return NV;
	}

	@Override
	public Set<KySu> khoiTaoKySu() {
		KySu ks1 = new KySu("Le Van A", "adress 1", "man", 1998, "engineer");
		KySu ks2 = new KySu("Le Van B", "adress 2", "man", 1992, "engineer");
		KySu ks3 = new KySu("Le Van C", "adress 3", "women", 1994, "engineer");
		Set<KySu> KS = new HashSet<KySu>();
		 KS.add(ks1);
		 KS.add(ks2);
		 KS.add(ks3);
		return  KS;
	}

	@Override
	public HashMap<String, CongNhan> khoiTaoCongNhan() {	
	CongNhan cn1 = new CongNhan("Thai Van A", "adress 1", "man", 1998, "3");
	CongNhan cn2 = new CongNhan("Thai Van B", "adress 2", "man", 1997, "5");
	CongNhan cn3 = new CongNhan("Thai Van C", "adress 3", "women", 1994, "7");
	HashMap<String, CongNhan> CN = new HashMap<String, CongNhan>();
	CN.put(cn1.getName(), cn1);
	CN.put(cn2.getName(), cn2);
	CN.put(cn3.getName(), cn3);
	return CN;
	}

	@Override
	public void hienThiDanhSachCanBo(LoaiCanBo loaiCB) {
		switch (loaiCB) {
		case NhanVien:
			hienThiDanhSachNhanVien();
			break;
		case KySu:
			hienThiDanhSachKySu();
			break;
		case CongNhan:
			hienThiDanhSachCongNhan();
			break;
		default:
			break;
		}
		
	}

	@Override
	public void timKiemCanBo(String name, LoaiCanBo loaiCB) {
		switch (loaiCB) {
		case NhanVien:
			NhanVien nv = timNhanVien(name);
			if (nv != null && nv.getName() != null) {
				System.out.println("\"     Name         | Type  | Job \"");
				System.out.println(nv.getName() + "    nhan vien    " + nv.getJob());
			} else {
				System.out.println("Khong tim thay!!!");
			}
			break;
		case KySu:
			KySu ks = timKySu(name);
			if (ks != null && ks.getName() != null) {
				System.out.println("\"     Name         | Type  | Job \"");
        		System.out.println(ks.getName() + "    ky su    " + ks.getTraining());
			} else {
				System.out.println("Khong tim thay!!!");
			}
			break;
		case CongNhan:
			CongNhan cn = timCongNhan(name);
			if (cn != null && cn.getName() != null) {
				System.out.println("\"     Name         | Type  | Rank \"");
        		System.out.println(cn.getName() + "    cong nhan    " + cn.getrank());
			} else {
				System.out.println("Khong tim thay!!!");
			}
			break;
		default:
			break;
		}
		
	}
	public static NhanVien timNhanVien(String name) {
		for (int i = 0 ; i < NV.size(); i++) {
			NhanVien nv = NV.get(i);
			if (name != null && nv.getName().equals(name)) {
				return nv;
			}
		}
		return null;
	}
	// nhiều rắc rối nhất vs phần iterator
	public static KySu timKySu(String name) {
		Iterator<KySu> it = KS.iterator();
		while (it.hasNext()) {
        	KySu kySu = (KySu) it.next();
        	if (kySu != null && kySu.getName() != null) {
        		return kySu;
        	}
        }
		return null;
	}
	
	public static CongNhan timCongNhan(String name) {
		for (HashMap.Entry<String, CongNhan> entry : CN.entrySet()) {
	    	CongNhan cn = (CongNhan) entry.getValue();
	    	if (cn != null && cn.getName() != null) {
	    		return cn;
	    	}
		}
		return null;
	}

	public static void hienThiDanhSachNhanVien() {
		//Show  danh sách nhân viên kiểu index
		System.out.println("     Name         | Type  | Job ");
		for (int i = 0 ; i < NV.size(); i++) {
			NhanVien nv = NV.get(i);
			System.out.println(i+1 + ", " + nv.getName() + "    nhan vien    " + nv.getJob());
		}
	}
	
	public static void hienThiDanhSachKySu() {
		// Sử dụng iterator( nhưng thấy iterator khá khó hiểu )
		
		System.out.println("     Name         | Type  | Job ");
		Iterator<KySu> it = KS.iterator();
		int i = 1;
        while (it.hasNext()) {
        	KySu element = (KySu) it.next();
        	System.out.println(i + ", " + element.getName() + "    ky su    " + element.getTraining());
        	i++;
        }
	}
	
	public static void hienThiDanhSachCongNhan() {
		//for-each
		// (1 entry sẽ bao gồm key và value)
		
		System.out.println("     Name         | Type  | Rank ");
		int i = 1;
	    for (HashMap.Entry<String, CongNhan> entry : CN.entrySet()) {
	    	CongNhan cn = (CongNhan) entry.getValue();
	    	System.out.println(i + ", " + cn.getName() + "    cong nhan    " + cn.getrank());
		}
	}
// Thử phần 2 ----> Nhập từ bàn phím	

//	public static HashMap<String, CongNhan> CN1 = new HashMap<>(); ;
////	public static Set<KySu> KS1 = new Set<KySu>;
//	public static List<NhanVien> NV1 = new List<NhanVien>();
	
}
