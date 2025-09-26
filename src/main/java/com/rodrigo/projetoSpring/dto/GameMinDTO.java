package com.rodrigo.projetoSpring.dto;

import com.rodrigo.projetoSpring.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getGenre();
		this.year = entity.getYear();
		this.imgUrl = entity.getGenre();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
		
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
}
