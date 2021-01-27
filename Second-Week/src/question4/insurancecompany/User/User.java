package question4.insurancecompany.User;

import java.util.Date;
import java.util.List;

import question4.insurancecompany.Address.Address;

public class User {

	private String isim;
	private String soyisim;
	private String email;
	private String sifre;
	private String meslek;
	private int yas;
	private List<Address> adresListesi;
	private Date sistemeSonGirisTarihi;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public String getMeslek() {
		return meslek;
	}
	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public List<Address> getAdresListesi() {
		return adresListesi;
	}
	public void setAdresListesi(List<Address> adresListesi) {
		this.adresListesi = adresListesi;
	}
	public Date getSistemeSonGirisTarihi() {
		return sistemeSonGirisTarihi;
	}
	public void setSistemeSonGirisTarihi(Date sistemeSonGirisTarihi) {
		this.sistemeSonGirisTarihi = sistemeSonGirisTarihi;
	}
	
	
	
}
