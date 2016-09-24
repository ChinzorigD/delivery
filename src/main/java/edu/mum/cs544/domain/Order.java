package edu.mum.cs544.domain;
// Generated Sep 23, 2016 11:52:16 AM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "food_delivery")
public class Order implements java.io.Serializable {

	private Integer orderId;
	private User user;
	private Date date;
	private Integer status;
	private Integer totalPrice;
	private Integer travelledMiles;
	private Set<OrderGroup> orderGroups = new HashSet<OrderGroup>(0);

	public Order() {
	}

	public Order(User user, Date date, Integer status, Integer totalPrice, Integer travelledMiles,
			Set<OrderGroup> orderGroups) {
		this.user = user;
		this.date = date;
		this.status = status;
		this.totalPrice = totalPrice;
		this.travelledMiles = travelledMiles;
		this.orderGroups = orderGroups;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "orderID", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "totalPrice")
	public Integer getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "travelledMiles")
	public Integer getTravelledMiles() {
		return this.travelledMiles;
	}

	public void setTravelledMiles(Integer travelledMiles) {
		this.travelledMiles = travelledMiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<OrderGroup> getOrderGroups() {
		return this.orderGroups;
	}

	public void setOrderGroups(Set<OrderGroup> orderGroups) {
		this.orderGroups = orderGroups;
	}

}
