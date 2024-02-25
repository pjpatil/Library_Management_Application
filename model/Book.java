package library.model;

public class Book {
	private int bId;
	private String bName;
	private String bAuthor;
	private String bPrice;
	private String bStatus;
	private String bCategory;
	
	public Book()
	{
		
	}
	public Book(int bId,String bName,String bAuthor,String bPrice,String bStatus,String bCategory)
	{
		this.bId=bId;
		this.bName=bName;
		this.bAuthor=bAuthor;
		this.bPrice=bPrice;
		this.bStatus=bStatus;
		this.bCategory=bCategory;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbPrice() {
		return bPrice;
	}
	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	public String getbStatus() {
		return bStatus;
	}
	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}
	public String getbCategory() {
		return bCategory;
	}
	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
	}

}
