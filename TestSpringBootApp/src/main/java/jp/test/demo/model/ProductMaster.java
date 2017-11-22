package jp.test.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PRODUCT_MASTER database table.
 * 
 */
@Entity
@Table(name="PRODUCT_MASTER")
@NamedQuery(name="ProductMaster.findAll", query="SELECT p FROM ProductMaster p")
public class ProductMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRODUCT_ID")
	private long productId;

	@Column(name="ABBREVIATION_NAME")
	private String abbreviationName;

	@Column(name="ABBREVIATION_NAME_KANA")
	private String abbreviationNameKana;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DELETE_DATE")
	private Date deleteDate;

	@Column(name="DISPLAY_NAME")
	private String displayName;

	@Column(name="DISPLAY_NAME_KANA")
	private String displayNameKana;

	@Column(name="ENTRY_USER_ID")
	private BigDecimal entryUserId;

	@Column(name="FORMAL_NAME")
	private String formalName;

	@Column(name="FORMAL_NAME_KANA")
	private String formalNameKana;

	@Column(name="POS_NAME_KANA")
	private String posNameKana;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	//bi-directional many-to-one association to ProductMaster
	@ManyToOne
	@JoinColumn(name="OLD_PRODUCT_ID")
	private ProductMaster productMaster1;

	//bi-directional many-to-one association to ProductMaster
	@OneToMany(mappedBy="productMaster1")
	private List<ProductMaster> productMasters1;

	//bi-directional many-to-one association to ProductMaster
	@ManyToOne
	@JoinColumn(name="HIGHER_PRODUCT_ID")
	private ProductMaster productMaster2;

	//bi-directional many-to-one association to ProductMaster
	@OneToMany(mappedBy="productMaster2")
	private List<ProductMaster> productMasters2;

	//bi-directional many-to-one association to ProductMaster
	@ManyToOne
	@JoinColumn(name="NEW_PRODUCT_ID")
	private ProductMaster productMaster3;

	//bi-directional many-to-one association to ProductMaster
	@OneToMany(mappedBy="productMaster3")
	private List<ProductMaster> productMasters3;

	public ProductMaster() {
	}

	public long getProductId() {
		return this.productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getAbbreviationName() {
		return this.abbreviationName;
	}

	public void setAbbreviationName(String abbreviationName) {
		this.abbreviationName = abbreviationName;
	}

	public String getAbbreviationNameKana() {
		return this.abbreviationNameKana;
	}

	public void setAbbreviationNameKana(String abbreviationNameKana) {
		this.abbreviationNameKana = abbreviationNameKana;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayNameKana() {
		return this.displayNameKana;
	}

	public void setDisplayNameKana(String displayNameKana) {
		this.displayNameKana = displayNameKana;
	}

	public BigDecimal getEntryUserId() {
		return this.entryUserId;
	}

	public void setEntryUserId(BigDecimal entryUserId) {
		this.entryUserId = entryUserId;
	}

	public String getFormalName() {
		return this.formalName;
	}

	public void setFormalName(String formalName) {
		this.formalName = formalName;
	}

	public String getFormalNameKana() {
		return this.formalNameKana;
	}

	public void setFormalNameKana(String formalNameKana) {
		this.formalNameKana = formalNameKana;
	}

	public String getPosNameKana() {
		return this.posNameKana;
	}

	public void setPosNameKana(String posNameKana) {
		this.posNameKana = posNameKana;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public ProductMaster getProductMaster1() {
		return this.productMaster1;
	}

	public void setProductMaster1(ProductMaster productMaster1) {
		this.productMaster1 = productMaster1;
	}

	public List<ProductMaster> getProductMasters1() {
		return this.productMasters1;
	}

	public void setProductMasters1(List<ProductMaster> productMasters1) {
		this.productMasters1 = productMasters1;
	}

	public ProductMaster addProductMasters1(ProductMaster productMasters1) {
		getProductMasters1().add(productMasters1);
		productMasters1.setProductMaster1(this);

		return productMasters1;
	}

	public ProductMaster removeProductMasters1(ProductMaster productMasters1) {
		getProductMasters1().remove(productMasters1);
		productMasters1.setProductMaster1(null);

		return productMasters1;
	}

	public ProductMaster getProductMaster2() {
		return this.productMaster2;
	}

	public void setProductMaster2(ProductMaster productMaster2) {
		this.productMaster2 = productMaster2;
	}

	public List<ProductMaster> getProductMasters2() {
		return this.productMasters2;
	}

	public void setProductMasters2(List<ProductMaster> productMasters2) {
		this.productMasters2 = productMasters2;
	}

	public ProductMaster addProductMasters2(ProductMaster productMasters2) {
		getProductMasters2().add(productMasters2);
		productMasters2.setProductMaster2(this);

		return productMasters2;
	}

	public ProductMaster removeProductMasters2(ProductMaster productMasters2) {
		getProductMasters2().remove(productMasters2);
		productMasters2.setProductMaster2(null);

		return productMasters2;
	}

	public ProductMaster getProductMaster3() {
		return this.productMaster3;
	}

	public void setProductMaster3(ProductMaster productMaster3) {
		this.productMaster3 = productMaster3;
	}

	public List<ProductMaster> getProductMasters3() {
		return this.productMasters3;
	}

	public void setProductMasters3(List<ProductMaster> productMasters3) {
		this.productMasters3 = productMasters3;
	}

	public ProductMaster addProductMasters3(ProductMaster productMasters3) {
		getProductMasters3().add(productMasters3);
		productMasters3.setProductMaster3(this);

		return productMasters3;
	}

	public ProductMaster removeProductMasters3(ProductMaster productMasters3) {
		getProductMasters3().remove(productMasters3);
		productMasters3.setProductMaster3(null);

		return productMasters3;
	}

}