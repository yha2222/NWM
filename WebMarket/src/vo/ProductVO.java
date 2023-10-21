package vo;

//자바빈 클래스(멤버변수, 기본생성자, getter/setter메소드)
public class ProductVO {
	private String productId;		//상품 아이디
	private String pname;			//상품명
	private int    unitPrice;		//상품 가격
	private String description;		//상품 설명
	private String manufacturer;	//제조사
	private String category;		//분류
	private long   unitsInStock; 	//재고수 
	private String condition;		//신상품 or 중고품 or 재생품
	private String filename;		// 이미지 파일명
	private int	   quantity;		// 장바구니에 담은 상품 개수

	public ProductVO() {}
	
	public ProductVO(String productId, String pname, int unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", pname=" + pname + ", unitPrice=" + unitPrice + ", description="
				+ description + ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInStock="
				+ unitsInStock + ", condition=" + condition + ", filename=" + filename + ", quantity=" + quantity + "]";
	}
}







