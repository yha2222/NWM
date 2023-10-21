package dao;

import java.util.ArrayList;

import vo.ProductVO;

//상품을 저장하고 접근, 관리(In Memory)
public class ProductRepository {
	
	//싱글톤 : 메모리에 객체가 1개 생성. 공유/저장/통합/운영.
	private static ProductRepository instance = new ProductRepository();
	//private ProductRepository() {}
	public  static ProductRepository getInstance() {
		return instance;
	}

	//ProductVO제네릭 ArrayList 타입의 멤버변수
	private ArrayList<ProductVO> listOfProducts 
			= new ArrayList<ProductVO>();
	
	//상품 3개를 등록
	public ProductRepository() {
		ProductVO phone = new ProductVO("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1234X750 Renina HD display");
		phone.setManufacturer("Apple");
		phone.setCategory("Smart Phone");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		phone.setFilename("snoopy7.jpg");
		
		ProductVO notebook = new ProductVO("P1235", "LG PC 그램", 1500000);
        notebook.setDescription("13.3-inch, IPS LED display");
        notebook.setManufacturer("LG");
        notebook.setCategory("Notebook");
        notebook.setUnitsInStock(1000);
        notebook.setCondition("Refurbished");
        notebook.setFilename("snoopy8.jpg");
        
        ProductVO tablet = new ProductVO("P1236", "Galaxy Tab S", 900000);
        tablet.setDescription("121.8*125 6*6.6mm, Super AMOLED display");
        tablet.setManufacturer("Samsung");
        tablet.setCategory("Tablet");
        tablet.setUnitsInStock(1000);
        tablet.setCondition("Old");
        tablet.setFilename("snoopy9.jpg");
        
        listOfProducts.add(phone);
        listOfProducts.add(notebook);
        listOfProducts.add(tablet);
	}
	
	public ArrayList<ProductVO> getAllProducts(){
		return this.listOfProducts;
	}
	
	public ProductVO getProductById(String productId) {
		// 찾은 객체를 넣어줄 리턴할 객체
		ProductVO productById = null;
		
		for(int i=0;i<listOfProducts.size();i++) {
			ProductVO product = listOfProducts.get(i);
			
			if(product!=null&&product.getProductId()!=null&&
					product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		return productById;
	}
	
	//Insert 처리(상품 추가) 메소드
	public void addProduct(ProductVO productVO) {
		listOfProducts.add(productVO);
	}
}