package com.lazyloading;

//https://www.baeldung.com/hibernate-lazy-eager-loading
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class UserLazy implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<OrderDetail> orderDetail = new HashSet<>();

	// standard setters and getters
	// also override equals and hashcode

}