package poly.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = " Category")
public class Category {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "Name")
	@NotBlank(message = "Không được để trống tên danh mục !")
	private String name;
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Product> getProducts() {
		return products;
	}

	public void setProducts(Collection<Product> products) {
		this.products = products;
	}

}
