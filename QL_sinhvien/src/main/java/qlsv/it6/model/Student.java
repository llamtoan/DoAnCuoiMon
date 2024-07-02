package qlsv.it6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maSV;
	
	@Column(name = "hoTen")
	private String hoTen;
	
	@Column(name = "tenKhoa")
	private String tenKhoa;
	
	@Column(name = "gioiTinh")
	private String gioiTinh;
	
	@Column(name = "diemTin")
	private int diemTin;


	public Student(long maSV, String hoTen, String tenKhoa, String gioiTinh, int diemTin) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.tenKhoa = tenKhoa;
		this.gioiTinh = gioiTinh;
		this.diemTin = diemTin;
	}

	public Student() {
		
	}

	public long getMaSV() {
		return maSV;
	}

	public void setMaSV(long maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getDiemTin() {
		return diemTin;
	}

	public void setDiemTin(int diemTin) {
		this.diemTin = diemTin;
	}
	
	

}
