package com.huayong.awa.apollo.recommend.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

/**
 * 功能:  对应的DTO
 * 
 * @author zpl
 *
 * @date 2019-09-06
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MicResReportDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
   	/**主键ID*/
   	private Long id;
   	/**订单id*/
   	private Long recommendId;
   	/**职位id*/
   	private Long jobId;
   	/**内容*/
   	private String content;
   	/**删除标识(0：未删除；1：删除)*/
   	private Integer delFlag;
   	/**创建者id*/
   	private String creatorId;
   	/**员工项目组*/
   	private String creatorTeam;
   	/**员工分办*/
   	private String creatorBranch;
   	/**员工大区*/
   	private String creatorRegion;
   	/**创建者所属公司 1:埃摩森 2:沃瑞 3:安利*/
   	private Integer creatorCompany;
   	/**组织机构ID*/
   	private String orgId;
   	/**数据归属品牌 1:埃摩森 2:沃瑞 3:安利 4:如禹*/
   	private Integer brand;
   	/**创建时间(用作首次匹配时间)*/
   	private Date createTime;
   	/**更新时间*/
   	private Date modifyTime;
}
