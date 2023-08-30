package com.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutBoundResponse {
	@JsonProperty("areaName")
	private Long areaId;
	@JsonProperty("rackNumber")
	private Long rackId;
	@JsonProperty("levelNumber")
	private Long levelId;
	@JsonProperty("blockNumber")
	private Long blockId;
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public Long getRackId() {
		return rackId;
	}
	public void setRackId(Long rackId) {
		this.rackId = rackId;
	}
	public Long getLevelId() {
		return levelId;
	}
	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}
	public Long getBlockId() {
		return blockId;
	}
	public void setBlockId(Long blockId) {
		this.blockId = blockId;
	}
	public OutBoundResponse(Long areaId, Long rackId, Long levelId, Long blockId) {
		super();
		this.areaId = areaId;
		this.rackId = rackId;
		this.levelId = levelId;
		this.blockId = blockId;
	}
	public OutBoundResponse() {
		super();
		
	}
	
	
}
