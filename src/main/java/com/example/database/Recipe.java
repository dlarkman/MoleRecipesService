package com.example.database;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

	@Entity
	public class Recipe implements Serializable {
	  
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	 
	    @Column(nullable = false, unique = true)
	    private String name;
	 
	    @Column(nullable = false)
	    private String method;
	    
	    @Column
	    @OneToMany(cascade = {CascadeType.ALL})
	    private List<Ingredient> ingredients;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}
	    
		public List<Ingredient> getIngredients() {
			return ingredients;
		}

		public void setIngredients(List<Ingredient> ingredients) {
			this.ingredients = ingredients;
		}
	    
	}

