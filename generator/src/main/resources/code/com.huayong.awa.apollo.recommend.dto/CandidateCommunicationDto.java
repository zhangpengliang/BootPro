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
public class CandidateCommunicationDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
   	/**主键ID*/
   	private Long id;
   	/**简历ID*/
   	private String resumeId;
   	/**人选姓名*/
   	private String candidateName;
   	/**人选手机*/
   	private String candidateMobile;
   	/**人选目前公司*/
   	private String candidateCompany;
   	/**人选目前职位*/
   	private String candidatePosition;
   	/**状态 1:不考虑机会 2:稍后联系 3:同意推荐 4:人选不符 5:打电话有误*/
   	private Integer status;
   	/**备注*/
   	private String remark;
   	/**权限 1:仅对自己 2:所有人可见（本公司的人）*/
   	private Integer remarkStatus;
   	/**提醒时间 年月日时分*/
   	private String delayTime;
   	/**员工ID*/
   	private String creatorId;
   	/**员工项目组*/
   	private String creatorTeam;
   	/**员工分办*/
   	private String creatorBranch;
   	/**员工大区*/
   	private String creatorRegion;
   	/**组织机构ID*/
   	private String orgId;
   	/**数据归属品牌 1:埃摩森 2:沃瑞 3:安利 4:如禹*/
   	private Integer brand;
   	/**员工所属公司*/
   	private Integer creatorCompany;
   	/**创建时间*/
   	private Date createTime;
   	/**修改时间*/
   	private Date modifyTime;
   	/**删除标识0未删除1删除*/
   	private Integer delFlag;
   	/**是否是最新的 1是 0 否*/
   	private Integer newFlag;
   	/**职位id*/
   	private Long jobId;
   	/**推荐id*/
   	private Long recommendId;
   	/**职位名称*/
   	private String jobName;
   	/**客户名称*/
   	private String clientName;
}
