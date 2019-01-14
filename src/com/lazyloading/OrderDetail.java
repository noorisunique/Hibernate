package com.lazyloading;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER_ORDER")
public class OrderDetail implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "ORDER_ID")
	private Long orderId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private UserLazy user;

	// standard setters and getters
	// also override equals and hashcode

}