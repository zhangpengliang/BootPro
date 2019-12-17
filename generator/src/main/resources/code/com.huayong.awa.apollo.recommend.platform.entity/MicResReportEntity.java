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
@Table(name = "mic_res_report")
public class MicResReportEntity extends AbstractAwaEntity {

	private static final long serialVersionUID = 1L;
	
   	/**订单id*/
   	private Long recommendId;
   	/**职位id*/
   	private Long jobId;
   	/**内容*/
   	private String content;

}
