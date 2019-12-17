package com.huayong.awa.apollo.recommend.platform.entity;

import javax.persistence.Table;

import com.huayong.awa.service.entity.AbstractAwaEntity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * 功能: 
 * 
 * @author zpl
 *
 * @date 2019-09-06
 */
@Setter
@Getter
@Table(name = "candidate_communication")
public class CandidateCommunicationEntity extends AbstractAwaEntity {

	private static final long serialVersionUID = 1L;
	
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
