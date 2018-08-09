package myshop.model;

public class Cellphone {
	private Long id;
	private String brand;
	private String model;
	private String os;
	private String cpuBrand;
	private String cpuCoreCount;
	private Integer ram;
	private Integer storage;
	private String color;
	private String description;
	private String image;
	private int price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		if (brand != null && !brand.equals("")){
            this.brand = brand;
		}
    }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getCpuBrand() {
		return cpuBrand;
	}
	public void setCpuBrand(String cpuBrand) {
		if (cpuBrand != null && !cpuBrand.equals("")){
		this.cpuBrand = cpuBrand;
		}
	}
	public String getCpuCoreCount() {
		return cpuCoreCount;
	}
	public void setCpuCoreCount(String cpuCoreCount) {
		if (cpuCoreCount != null && !cpuCoreCount.equals("")){
		this.cpuCoreCount = cpuCoreCount;
		}
	}
	
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getStorage() {
		return storage;
	}
	public void setStorage(Integer storage) {
		this.storage = storage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
